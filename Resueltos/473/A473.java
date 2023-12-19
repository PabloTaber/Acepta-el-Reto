import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {

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
        int balones = sc.nextInt();
        int disparos = sc.nextInt();

        while (balones != 0 && disparos != 0) {
            Queue<Integer> cola = new LinkedList<>();
            int contador = 0;
            int ultimoBalon = 0;

            for (int i = 0; i < balones; i++) {
                cola.add(i + 1);
            }

            while (!cola.isEmpty()) {
                contador++;
                ultimoBalon = cola.remove();
                if (contador % disparos != 0) {
                    cola.add(ultimoBalon);
                }
            }

            System.out.println(ultimoBalon);

            balones = sc.nextInt();
            disparos = sc.nextInt();
        }
    }
}
