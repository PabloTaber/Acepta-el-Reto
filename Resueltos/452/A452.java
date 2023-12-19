import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A452 {

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
        int nBolas = sc.nextInt();

        while (nBolas != 0) {
            int[] bingo = new int[nBolas];
            TreeSet<Integer> resultado = new TreeSet<>();

            for (int i = 0; i < nBolas; i++) {
                bingo[i] = sc.nextInt();
            }

            Arrays.sort(bingo);

            for (int i = 0; i < bingo.length - 1; i++) {
                for (int j = i + 1; j < bingo.length; j++) {
                    resultado.add(bingo[j] - bingo[i]);
                }
            }

            for (int bola : resultado) {
                System.out.print(resultado.last() == bola ? bola : bola + " ");
            }

            System.out.println();
            nBolas = sc.nextInt();
        }

    }
}