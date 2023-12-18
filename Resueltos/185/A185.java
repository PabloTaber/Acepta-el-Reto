import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A185 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while (casos != 0) {
            Set<String> ingredientesSI = new TreeSet<>();
            Set<String> ingredientesNO = new TreeSet<>();
            

            for (int i = 0; i < casos; i++) {
                String palabra = sc.next();
                String alimentos = sc.next();

                while (!alimentos.equals("FIN") && palabra.equals("SI:")) {
                    ingredientesSI.add(alimentos);
                    alimentos = sc.next();
                }

                while (!alimentos.equals("FIN") && palabra.equals("NO:")) {
                    ingredientesNO.add(alimentos);
                    alimentos = sc.next();
                }

                ingredientesNO.removeAll(ingredientesSI);
            }

            Iterator<String> i = ingredientesNO.iterator();

            if (i.hasNext()) {
                System.out.print(i.next());
            } 
            while (i.hasNext()) {
                System.out.print(" " + i.next());
            }

            System.out.println();
            casos = sc.nextInt();
        }
    }
}
