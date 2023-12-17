import java.util.Scanner;

public class Hyperpar {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();

        while (!numero.startsWith("-")) {
            for (int i=0; i < numero.length(); i++) {
                int num = Integer.parseInt(numero.substring(i,i+1));
                if ( num % 2 != 0) {
                    System.out.println("NO");
                    break;
                } else if ( i == numero.length() - 1) {
                    System.out.println("SI");
                }
            }
            numero = sc.next();
        }
    }
}
