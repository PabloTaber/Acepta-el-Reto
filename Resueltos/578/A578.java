import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A578 {

    //Clase para acelerar la lectura por teclado.
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
            new InputStreamReader(System.in));
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
         
        while (true) {
            Set<String> inventario = new HashSet<>();
            int numeroProductos = Integer.parseInt(sc.nextLine());
            if (numeroProductos == 0) {
                break;
            } 
        
            for (int i = 0; i < numeroProductos; i++) {
                inventario.add(sc.nextLine().toLowerCase());
            }

            System.out.println(inventario.size());
        }
    }
}