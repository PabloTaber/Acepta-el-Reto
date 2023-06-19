import java.util.Scanner;
import java.util.Arrays;

public class CartasAbuelo {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        int casos = sc.nextInt();

        while (casos != 0) {

            for (int i=0; i < casos; i++) {
                Boolean iguales = false;
                int intervalo1 = sc.nextInt();
                int intervalo2 = sc.nextInt();

                char[] subtexto = linea.substring(Math.min(intervalo1,intervalo2), Math.max(intervalo1, intervalo2)+1).toCharArray();
                Arrays.sort(subtexto);
                
                if ( subtexto[0] == subtexto[subtexto.length-1] ) {
                    iguales = true;
                } 
             
            
                System.out.println( iguales ? "SI" : "NO");
            }
            
        System.out.println();
        sc.nextLine();
        linea = sc.nextLine();
        casos = sc.nextInt();
        }
    }
}
