import java.util.Scanner;

public class A219{
  
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int num = teclado.nextInt();

		for(int i = 0; i < num; i++){
      int boletos = 0;
			int decimosAdministracion = teclado.nextInt();
			
      for(int j = 0; j < decimosAdministracion; j++){
				int numerosDecimo = teclado.nextInt();
        if(numerosDecimo % 2 == 0) {
					boletos++;
        }
			}
      
		  System.out.println(boletos);		
		}
	}

}
