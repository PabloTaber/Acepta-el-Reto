import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CartasAbuelo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;

        while (true) {
            linea = br.readLine();
            int numTest = Integer.parseInt(br.readLine().trim());

            if (numTest == 0) {
                return;
            }

            for (int i = 0; i < numTest; i++) {
                String[] tokens = br.readLine().split(" ");
                int inicio = Integer.parseInt(tokens[0]);
                int fin = Integer.parseInt(tokens[1]);

                if (inicio > fin) {
                    int temp = inicio;
                    inicio = fin;
                    fin = temp;
                }

                boolean iguales = true;

                for (int j = inicio; j < fin; j++) {
                    if (linea.charAt(j) != linea.charAt(j + 1)) {
                        iguales = false;
                        break;
                    }
                }

                System.out.println(iguales ? "SI" : "NO");
            }
            System.out.println();
        }
    }
}
