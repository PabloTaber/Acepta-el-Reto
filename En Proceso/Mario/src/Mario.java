import java.util.Scanner;

public class Mario {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i=0; i < casos; i++) {
            int arriba = 0;
            int abajo = 0;
            int saltos = sc.nextInt();
            int actual = sc.nextInt();
            for (int j=0; j < saltos - 1; j++) {
                int siguiente = sc.nextInt();
                if (actual > siguiente) {
                    abajo++;
                }else if (actual < siguiente) {
                    arriba++;
                }
                actual = siguiente;
            }
            System.out.println(arriba + " " + abajo);
        }
    }
}
