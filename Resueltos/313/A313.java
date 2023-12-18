import java.util.Scanner;

public class A313 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            int saldo = teclado.nextInt();
            int cambio = teclado.nextInt();
            saldo += cambio;
            
            System.out.println(saldo >= 0 ? "SI" : "NO");
        }
    }
}