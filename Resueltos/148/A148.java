import java.util.Scanner;

public class A148{
	public static void main(String[] args){

		Scanner teclado=new Scanner(System.in);
		final int minutosDia=24*60;	

		String entrada=teclado.nextLine();
		int horas=Integer.parseInt(entrada.substring(0,entrada.indexOf(':')));
		int minutos=Integer.parseInt(entrada.substring(entrada.indexOf(':')+1));

		while(horas!=0||minutos!=0){
			System.out.println(minutosDia-(horas*60+minutos));	
			entrada=teclado.nextLine();
			horas=Integer.parseInt(entrada.substring(0,entrada.indexOf(':')));
			minutos=Integer.parseInt(entrada.substring(entrada.indexOf(':')+1));
		}
	}
}
