import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaSobres = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int sobres = sc.nextInt();
        int reparto = sc.nextInt();

        while (sobres != 0) {
            

            for (int i = 0; i < sobres; i++) {
                listaSobres.add(sc.nextInt());
            }

            while (reparto <= listaSobres.size()) {   
                System.out.print(Collections.max(listaSobres.subList(0, reparto)) + " ");
                listaSobres.remove(0);
            }
            
            listaSobres.removeAll(listaSobres);
            System.out.println();
            sobres = sc.nextInt();
            reparto = sc.nextInt();
        }
    }
}
