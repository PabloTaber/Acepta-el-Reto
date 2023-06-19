import java.util.Arrays;
import java.util.Scanner;

public class A100 {

    public static String OrdenarAscendente(String cadena) {
        char[] aux = cadena.toCharArray();
        Arrays.sort(aux);
        return new String(aux);
    }

    public static String OrdenarDescendente(String cadena) {
        cadena = OrdenarAscendente(cadena);
        String aux = "";

        for (int i = 0; i < cadena.length(); i++) {
            aux = cadena.charAt(i) + aux;
        }

        return aux;
    }

    // Calcula la resta de los 2 String y devuelve un String con el formato
    // correcto.
    public static String calcularResta(String cadena) {
        String numeroDes = OrdenarDescendente(cadena);
        String numeroAsc = OrdenarAscendente(cadena);
        String aux = String.valueOf(Integer.parseInt(numeroDes) - Integer.parseInt(numeroAsc));

        while (aux.length() < 4) {
            aux = "0" + aux;
        }

        return aux;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {

            String cadenaNumero = sc.next();

            // Si el numero es menor de 1000 se añaden ceros a la izquierda.
            while (cadenaNumero.length() < 4) {
                cadenaNumero = "0" + cadenaNumero;
            }

            // Si se trata de un repdigit se imprime 8.
            if ((cadenaNumero.charAt(0) == cadenaNumero.charAt(1))
                    && (cadenaNumero.charAt(1) == cadenaNumero.charAt(2))
                    && (cadenaNumero.charAt(2) == cadenaNumero.charAt(3))) {
                System.out.println("8");
            } else {
                int iteraciones = 0;
                while (!cadenaNumero.equals("6174")) {
                    cadenaNumero = calcularResta(cadenaNumero);
                    iteraciones++;
                }
                System.out.println(iteraciones);
            }
        }
    }
}
