import java.util.Arrays;
import java.util.Scanner;

public class A331 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nPilotos = sc.nextInt();

        while (nPilotos != 0) {
            int [] posGanada = new int[nPilotos];
            String[] nombrePilotos = new String[nPilotos];
            int [] posParrilla = new int[nPilotos];
            String[] nombreParrila = new String[nPilotos];
            Boolean imposible = false;

            for (int i = 0; i < nPilotos; i++) {
                posGanada[i] = sc.nextInt() + i + 1;
                if (posGanada[i] < 1 || posGanada[i] > 26) {
                    imposible = true;
                }
                nombrePilotos[i] = sc.nextLine();
            }

            System.arraycopy(posGanada, 0, posParrilla, 0, nPilotos);
            Arrays.sort(posParrilla);

            for (int i = 0; i < nPilotos - 1; i++) {
                if (posParrilla[i] == posParrilla[i+1]) {  
                    imposible = true;
                }
            }

            if (!imposible) {
                for (int i=0; i< nPilotos; i++) {
                    for (int j=0; j < nPilotos; j++) {
                        if (posGanada[i] == posParrilla[j]) {
                             nombreParrila[j] = nombrePilotos[i];   
                        }
                    }
                } 

                for (int i=0; i< nPilotos; i++) {
                    System.out.println(posParrilla[i] + nombreParrila[i]);
                }

            }else{
                System.out.println("IMPOSIBLE");
            }

            System.out.println("-----");
            nPilotos = sc.nextInt();
        }
    }
}
