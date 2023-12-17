import java.util.Scanner;

public class A140 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String numero = sc.next();

        while (Integer.parseInt(numero) >= 0) {
            char[] digitos = numero.toCharArray();
            int suma = 0;

            for (int i=0; i < digitos.length; i++) {
                System.out.print(digitos[i]);
                System.out.print(i == digitos.length-1?" = ":" + ");
                suma += Integer.parseInt("" + digitos[i]);
            }

            System.out.println(suma);
            numero = sc.next();
        }
    }
}
