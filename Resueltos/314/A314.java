import java.util.Scanner;

public class A314 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int casosPrueba = teclado.nextInt();
        
        for (int i=0; i < casosPrueba; i++){
            int pico = 0;
            int valle = 0;
            int nMediciones = teclado.nextInt();
            int[] temperaturas = new int[nMediciones];

            //Bucle para cargar los datos en un array con todas las temperaturas.
            for (int j=0; j < nMediciones; j++) {                   
                temperaturas[j] = teclado.nextInt();
            }

            //Compruebo las posiciones interiores del array.
            for (int j=1; j < nMediciones -1; j++) {
                if (temperaturas[j] > temperaturas[j-1] && temperaturas[j] > temperaturas[j+1]) {
                    pico++;
                }else if (temperaturas[j] < temperaturas[j-1] && temperaturas[j] < temperaturas[j+1]) {
                    valle++;
                }
            }

            //Imprimo resultado.
            System.out.println(pico + " " + valle);
        }
    }
}