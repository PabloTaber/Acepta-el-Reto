import java.util.Scanner;

public class A124 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int acarreo = 0;
		int total = 0;
		int diferencia = 0;
		String num1 = teclado.next();
		String num2 = teclado.next();
		
		while (!num1.equals("0") || !num2.equals("0")) {
		    
		    if (num1.length() < num2.length()) {
		        diferencia = num2.length() - num1.length();
			  for (int i=0; i<diferencia; i++) {
				num1 = 0 + num1;
			  }	
		    }else if (num1.length() > num2.length()) {
			  diferencia = num1.length() - num2.length();
			  for (int i=0; i<diferencia; i++) {
				num2 = 0 + num2;
			  }	
		    }
			
		    for (int i=num1.length()-1; i>-1; i--) {
			  int suma = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + acarreo;
					if (suma > 9) {
						acarreo = 1;
						total++;
					}else{
						acarreo = 0;
					}
			}
			System.out.println(total);
			total = 0;
			acarreo = 0;
			num1 = teclado.next();
			num2 = teclado.next();
		}
	}
}