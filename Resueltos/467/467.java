import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A467 {

    //Clase para acelerar la lectura por teclado.
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
        FastScanner teclado = new FastScanner();
        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            String primera = teclado.next().toLowerCase();
            teclado.next();
            String segunda = teclado.next().toLowerCase();
            System.out.println(primera.equals(segunda) ? "TAUTOLOGIA" : "NO TAUTOLOGIA");
        }
    }
}