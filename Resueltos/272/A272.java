import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A272 {

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

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int numeroCasos = sc.nextInt();

        for (int i = 0; i < numeroCasos; i++) {
            int numero = sc.nextInt();
            String resultado = "";

            if (numero == 0) {
                resultado = "0";
            }

            while (numero > 0) {
                int resto = numero % 6;
                resultado = resto + resultado;
                numero /= 6;
            }

            System.out.println(resultado);
        }
    }
}
