import java.util.Scanner;
import java.util.Arrays;

public class A161 {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		while (numero != 0) {
			int posicionMediana = 0;	
			int[] serie = new int[numero]; 
			
			for (int i=0; i<numero; i++) {
				serie[i] = teclado.nextInt();
			}
			
			Arrays.sort(serie);
			posicionMediana = numero/2;
      System.out.println ((numero % 2 == 0) ? (serie[posicionMediana]+serie[posicionMediana-1]) : serie[posicionMediana]*2);

			numero = teclado.nextInt();
		}
	}
}
