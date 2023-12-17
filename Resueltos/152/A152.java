import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A152 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();

        while (nCasos != 0) {
            Map<Integer, Integer> moda = new HashMap<>();

            for (int i = 0; i < nCasos; i++) {
                int numero = sc.nextInt();
                if (moda.containsKey(numero)) {
                    moda.put(numero, moda.get(numero) + 1);
                } else {
                    moda.put(numero, 1);
                }
            }

            Set<Integer> claves = moda.keySet();
            int max = 0;
            int numeroModa = 0;
            for (Integer c : claves) {
                if (moda.get(c) > max) {
                    max = moda.get(c);
                    numeroModa = c;
                }
            }

            System.out.println(numeroModa);
            nCasos = sc.nextInt();
        }
    }
}
