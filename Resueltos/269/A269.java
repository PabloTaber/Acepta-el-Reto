import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class A269 {

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
        FastScanner sc = new FastScanner();
        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            int totalKilometros = 0;
            int distanciaDiaAnterior = 0;
            
            while (true) {
                int distanciaDiaActual = sc.nextInt();

                if (distanciaDiaActual == 0) {
                    break;
                }

            distanciaDiaAnterior += 2 * distanciaDiaActual;
                totalKilometros += distanciaDiaAnterior;
            }

            System.out.println(totalKilometros);
        }
    }
}