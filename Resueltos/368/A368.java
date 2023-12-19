import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Clase para acelerar la lectura por teclado.
class FastScanner {
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

public class A368{

	public static void main(String[] args){
		FastScanner teclado = new FastScanner();
		int huevo = teclado.nextInt();
		int olla = teclado.nextInt();
		

		while ( huevo != 0 || olla != 0) {
            int tiempo = 10;
			int resto = olla - huevo;
			
            while ( resto < 0 ) {
				tiempo += 10;
				resto = olla + resto;
			}

		System.out.println(tiempo);
		huevo = teclado.nextInt();
		olla = teclado.nextInt();
		}
	}
}
