import java.util.Scanner;

public class A217{
  
	public static void main(String[] args){
    Scanner teclado=new Scanner(System.in);
		int num=teclado.nextInt();

		while (num != 0) {
			System.out.println((num % 2 == 0) ? "DERECHA" : "IZQUIERDA");
			num = teclado.nextInt();
		}
	}
}
