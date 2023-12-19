import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A521 {

    // Clase para acelerar la lectura por teclado.
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        int numeroPisos = sc.nextInt();
        int numeroLetras = sc.nextInt();
        int asistentes = sc.nextInt();

        while (numeroPisos != 0 || numeroLetras != 0 || asistentes != 0) {
            Set<String> viviendas = new TreeSet<>();

            for (int i = 0; i < asistentes; i++) {
                String piso = sc.next();
                String letra = sc.next();
                viviendas.add(piso + letra);
            }

            int numeroViviendasTotales = numeroPisos * numeroLetras;
            int cuorum = (int) Math.ceil((double) numeroViviendasTotales / 2);
            int numeroViviendasPresentes = viviendas.size();

            System.out.println(numeroViviendasPresentes >= cuorum ? "EMPEZAMOS" : "ESPERAMOS");

            numeroPisos = sc.nextInt();
            numeroLetras = sc.nextInt();
            asistentes = sc.nextInt();
        }
    }
}
