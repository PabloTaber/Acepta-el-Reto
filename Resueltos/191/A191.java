import java.util.Scanner;

public class A191 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int nCompartimentos = sc.nextInt(); //número de compartimentos del acuario (>0).
            int capacidad = sc.nextInt();       //la capacidad en litros del más grande (>0).
            int decremento = sc.nextInt();      //la diferencia de litros entre dos compartimentos adyacentes (≥0).
            int total = 0;

            for (int j = 0; j < nCompartimentos; j++) {
                total += capacidad;
                capacidad -= decremento;
            } 
            System.out.println(total);
        }
    }
}
