import java.util.Scanner;

public class A362 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            int dia = teclado.nextInt();
            int mes = teclado.nextInt();

            System.out.println((dia == 25 && mes == 12) ? "SI" : "NO");
        }
    }
}
