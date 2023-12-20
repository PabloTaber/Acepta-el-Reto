import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class A260 {

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

    static String ordenarString (String palabra) {
        char[] array = palabra.replaceAll(" ", "").toLowerCase().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int numeroCasos = sc.nextInt();

        for (int i = 0; i < numeroCasos; i++) {
            String palabra1 = sc.nextLine();
            String palabra2 = sc.nextLine();

            String palabraOrdenada1 = ordenarString(palabra1);
            String palabraOrdenada2 = ordenarString(palabra2);

            System.out.println(palabraOrdenada1.equals(palabraOrdenada2) ? "SI" : "NO");
        }
    }
}