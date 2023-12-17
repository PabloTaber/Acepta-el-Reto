import java.util.Scanner;

public class Zapping {
    
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int canal1 = teclado.nextInt();
        int canal2 = teclado.nextInt();
        int derecha = 0;
        int izquierda = 0;

        while (canal1 != 0 || canal2 != 0) {

            if (canal1 < canal2) {
                derecha = canal2 - canal1;
                izquierda = canal1 + (99 - canal2);
            }else{
                derecha = (99 - canal1) + canal2;
                izquierda = canal1 - canal2;
            }

            System.out.println((derecha > izquierda)?izquierda:derecha);
            canal1 = teclado.nextInt();
            canal2 = teclado.nextInt();
            derecha = 0;
            izquierda = 0;
        }
        teclado.close();
    }
}
