import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A416 {

    // Clase para acelerar la lectura por teclado.
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
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

        double nextDouble() {
            return Double.parseDouble(next());
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

        Scanner sc = new Scanner(System.in);

        int nCasos = sc.nextInt();

        while (nCasos != 0) {
            Set<String> fechas = new LinkedHashSet<>();

            for (int i = 0; i < nCasos; i++) {
                String fecha = sc.next();
                fecha = fecha.substring(0, fecha.lastIndexOf("/"));
                fechas.add(fecha);
            }

            System.out.println(fechas.size() == nCasos ? "NO" : "SI");

            nCasos = sc.nextInt();
        }
    }
}
