import java.util.Scanner;

public class Goteras {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();

        for (int i=0; i < nCasos; i++) {
            int gotas = sc.nextInt();
            //int horas = gotas / 3600;
            //int minutos = (gotas % 3600) / 60;
            //int segundos = gotas % 60;
            
            System.out.println(String.format("%02d", gotas / 3600) + ":" + String.format("%02d", (gotas % 3600) / 60) + ":" + String.format("%02d", gotas % 60));
        }
    }
}
