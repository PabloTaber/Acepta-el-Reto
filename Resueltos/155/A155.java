import java.util.Scanner;

public class A155 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ancho = entrada.nextInt();
		int alto = entrada.nextInt();
		
        while (! (ancho < 0 ||alto < 0)) {
			System.out.println(ancho * 2 + alto * 2);
			ancho = entrada.nextInt();
			alto = entrada.nextInt();
		}
	}
}
