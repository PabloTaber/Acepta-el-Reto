import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A146 {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = new ArrayList<>();
        List<Integer> aux = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        while (numero != 0) {

            for (int i = 1; i < numero + 1; i++) {
                lista.add(i);
            }

            int m = 2;

            //Utilizo una lista auxiliar para evitar hacer las eliminaciones
            //una a uno y así solventar el TLE de acepta el reto.
            while (m <= lista.size()) {
                for (int i = 0; i < lista.size(); i++) {
                    if (i % m != 0) {
                        aux.add(lista.get(i));
                    }
                }
                lista.clear();
                lista.addAll(aux);
                aux.clear();
                m++;
            }

            System.out.print(numero + ":");

            for (int i = lista.size() - 1; i >= 0; i--) {
                System.out.print(" " + lista.get(i));
            }

            System.out.println();
            lista.clear();
            numero = sc.nextInt();
        }
    }
}
