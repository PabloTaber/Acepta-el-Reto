import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A267 {

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
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();

        while (true) {
            int base = sc.nextInt();
            int altura = sc.nextInt();
            int distancia = sc.nextInt();

            if (base == 0 && altura == 0 && distancia == 0) {
                return;
            }

            int postesBase = (int)Math.ceil((double)base / distancia);
            int postesAltura = (int)Math.ceil((double)altura / distancia);
 
            System.out.println((postesBase + postesAltura) * 2);
        }
    }
}