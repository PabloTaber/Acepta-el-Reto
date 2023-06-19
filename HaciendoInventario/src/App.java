import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        while (true) {
            Set<String> inventario = new HashSet<>();
            int numeroProductos = Integer.parseInt(sc.nextLine());
            if (numeroProductos == 0) break; 
        
            for (int i = 0; i < numeroProductos; i++) {
                inventario.add(sc.nextLine().toLowerCase());
            }

            System.out.println(inventario.size());

        }
    }
}
