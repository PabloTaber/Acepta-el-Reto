import java.util.Arrays;
import java.util.Scanner;

public class A100 {

    public static String OrdenarAscendente(String numero) {
        char[] caracteresOrdenados = numero.toCharArray();
        Arrays.sort(caracteresOrdenados);
        return new String(caracteresOrdenados);
    }

    public static String OrdenarDescendente(String numero) {
        numero = OrdenarAscendente(numero);
        String caracteresOrdenados = "";

        for (int i = 0; i < numero.length(); i++) {
            caracteresOrdenados = numero.charAt(i) + caracteresOrdenados;
        }

        return caracteresOrdenados;
    }

    public static String calcularResta(String numero) {
        String numeroDes = OrdenarDescendente(numero);
        String numeroAsc = OrdenarAscendente(numero);
        numero = String.valueOf(Integer.parseInt(numeroDes) - Integer.parseInt(numeroAsc));

        while (numero.length() < 4) {
            numero = "0" + numero;
        }

        return numero;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {

            String numero = sc.next();

            // Si el numero es menor de 1000 se añaden ceros a la izquierda.
            while (numero.length() < 4) {
                numero = "0" + numero;
            }

            // Si se trata de un repdigit se imprime 8.
            if ((numero.charAt(0) == numero.charAt(1))
                    && (numero.charAt(1) == numero.charAt(2))
                    && (numero.charAt(2) == numero.charAt(3))) {
                System.out.println("8");
            } else {
                int iteraciones = 0;
                while (!numero.equals("6174")) {
                    numero = calcularResta(numero);
                    iteraciones++;
                }
                System.out.println(iteraciones);
            }
        }
    }
}
