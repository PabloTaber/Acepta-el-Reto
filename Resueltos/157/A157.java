import java.util.Scanner;

public class A157 {
	public static void main(String[] args){
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31}; //0 - 11
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int dia;
		int mes;
		int diasRestantes = 0;

		for (int i = 0;i < num;i++){
			dia = teclado.nextInt();
			mes = teclado.nextInt();
			diasRestantes = diasMes[mes-1]-dia;
			for (int j = mes; j < 12; j++){
				diasRestantes += diasMes[j];
			}
		System.out.println(diasRestantes);
		}
	}
}
