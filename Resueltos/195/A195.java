import java.util.Arrays;
import java.util.Scanner;

public class A195 {
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);
        double[] puntuaciones = new double[7];


        while (sc.hasNext()) {

            for (int i = 0; i < puntuaciones.length; i++) {
                puntuaciones[i] = sc.nextDouble();
            }

            Arrays.sort(puntuaciones);
            double suma = 0;

            for (int i = 2; i < 5; i++) {
                suma += puntuaciones[i];
            }

            System.out.println((int)(suma * 2));
        }
    }
}
