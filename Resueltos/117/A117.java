import java.util.Scanner;

public class A117{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		
		for(int i = 0; i < num; i++){
			teclado.next();
			String nombre = teclado.next();
			System.out.println("Hola, " + nombre + ".");
		}
	}
}
