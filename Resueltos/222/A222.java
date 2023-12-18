import java.util.Scanner;

public class A222 {

    public static void main(String[] args) throws Exception {

        final Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int numero = sc.nextInt();
            int exp = sc.nextInt();
            int resultado = 0;
            int potencia = 1;

            for (int i = 0; i <= exp; i++) {
                resultado += potencia;
                resultado %= 1000007;
                potencia *= numero;
                potencia %= 1000007;
            }
            System.out.println(resultado);
        }
    }
}
