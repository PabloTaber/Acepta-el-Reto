import java.util.TreeMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class A268 {

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
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();

        while (true) {
            int numeroPlatos = sc.nextInt();
            int numeroCoronas = sc.nextInt();

            if (numeroPlatos == 0 && numeroPlatos == 0) {
                return;
            }

            int[] platos = new int[numeroPlatos];
            int[] coronas = new int[numeroCoronas];

            for (int i = 0; i < numeroPlatos; i++) {
                platos[i] = sc.nextInt();
            }

            for (int i = 0; i < numeroCoronas; i++) {
                coronas[i] = sc.nextInt();
            }

            //Se introducen las relaciones de marchas en un TreeMap para que ya estén ordenadas.
            Map<Float, String> relacionMarchas = new TreeMap<>();
        
            for (int i = 0; i < platos.length; i++) {
                for (int j = 0; j < coronas.length; j++) {
                    float relacion = (float)platos[i] / coronas[j];
                    String desarrollo = platos[i] + "-" + coronas[j];
                    relacionMarchas.put(relacion, desarrollo);
                }
            }

            //Se imprime evitando el espacio final.
            int count = 0;
            for (Map.Entry<Float, String> entry : relacionMarchas.entrySet()) {
                System.out.print(entry.getValue());
                count++;
                
                if (count < relacionMarchas.size()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
