import java.util.Scanner;
import java.math.BigInteger;

public class ContarFinal {

    public static String quitarPuntos(String numero) {
        String sinPuntos = "";
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) != '.') {
                sinPuntos = sinPuntos + numero.charAt(i);
            }
        }
        return sinPuntos;
    }

    public static String ponerPuntos(String numero) {
        String conPuntos = "";
        int j = 1;
        for (int i = numero.length() - 1; i > -1; i--) {
            if (j % 3 == 0 && i != 0) {
                conPuntos = numero.charAt(i) + conPuntos;
                conPuntos = "." + conPuntos;
            } else {
                conPuntos = numero.charAt(i) + conPuntos;
            }
            j++;
        }
        return conPuntos;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNext()) {
            String numero = quitarPuntos(teclado.next());
            BigInteger numLargo = new BigInteger(numero).add(new BigInteger("1"));
            numero = numLargo.toString();
            numero = ponerPuntos(numero);
            System.out.println(numero);
        }
    }
}
