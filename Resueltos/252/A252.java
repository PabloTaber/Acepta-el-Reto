import java.util.Scanner;

public class A252{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();

		while(!frase.equals("XXX")){
			frase = frase.toUpperCase().replace(" ","");
			int i = 0;
			
            while(i < frase.length() / 2){

                if(frase.charAt(i) == frase.charAt(frase.length() - i - 1)) {
                    i++;
                }else{
                    break;
                }		
			}

            System.out.println((i == frase.length() / 2) ? "SI" : "NO");
		    frase = teclado.nextLine();
		}
	}
}