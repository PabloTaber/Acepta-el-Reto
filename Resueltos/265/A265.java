import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class A265 {

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
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();

        while (true) {
            String entrada = sc.next();

            if (entrada.equals("0")) {
                return;
            }

            int suma = 0;
            int longitud = entrada.length();

            for (int i = 0; i < longitud; i++) {
                int numero = Integer.parseInt(entrada);
                suma += numero;
                entrada = entrada.substring(1);
            }

            System.out.println(suma);
        }
    }
}
