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

public class Aburrimiento {
    public static void main(String[] args) {
        FastScanner teclado = new FastScanner();
        int lados = teclado.nextInt();

        while (lados != 0) {
            int palillos = 0;
            
            for (int i = lados; i > 0; i--) {
                palillos = i + palillos;
            }

            System.out.println(palillos * 3);
            lados = teclado.nextInt();
        }
    }
}
