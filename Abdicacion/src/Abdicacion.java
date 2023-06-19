import java.util.Scanner;

public class Abdicacion {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int nReyes = sc.nextInt();
        
        while (nReyes != 0) {
            String[] nombreReyes = new String[nReyes];
            
            for (int i=0; i < nReyes; i++) {
                nombreReyes[i] = sc.next();
            }
            int nSucesores = sc.nextInt();
            String[] nombreSucesores = new String[nSucesores];
            int[] numeroSucesor = new int[nSucesores];

            for (int i=0; i < nSucesores; i++) {
                nombreSucesores[i] = sc.next();
            }

            for (int i=0; i < nSucesores; i++) {
                for (int j=0; j < nReyes; j++) {
                    if (nombreSucesores[i].equals(nombreReyes[j])) {
                        numeroSucesor[i]++;
                    } 
                }
                for (int j=i+1; j < nSucesores; j++) {
                    if (nombreSucesores[i].equals(nombreSucesores[j])) {
                        numeroSucesor[j]++;
                    }
                }
                System.out.println(numeroSucesor[i]+1);
            }
            System.out.println();
            nReyes = sc.nextInt();
        }
    }
}
