/*import java.util.Scanner;

public class Cuerda {

    public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);
        int n, best, sum1, sum2, left, right, leftSide;
        boolean valid;
        int[] arr = new int[300_001];

        while (s.hasNext()) {
            n = s.nextInt();
            sum1 = sum2 = left = right = leftSide = 0;
            best = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                sum1 += arr[i];
            }

            valid = true;
            for (int i = 0; i < n && valid; i++) {
                sum1 -= arr[i];
                sum2 += arr[i];
                if (Math.abs(sum2 - sum1) == best) {
                    valid = false;
                }
                else if (Math.abs(sum2 - sum1) < best) {
                    best = Math.abs(sum2 - sum1);
                    left = sum2;
                    right = sum1;
                    leftSide = i + 1;
                }
            }

            System.out.println(
                    valid
                        ? (leftSide + " " + left + " " + right)
                        : "NO JUEGAN"
            );
        }

    }

}*/
























import javax.swing.JOptionPane;

import java.util.Scanner;

public class Cuerda {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        
        while (sc.hasNext()) {
            int pesoTotal = 0;
            int pesoDerecha = 0;
            int pesoIzquierda = 0;
            int alumnosIzquierda = 0;
            int alumnosDerecha = 0;
            int alumnos = sc.nextInt();
            int[] fila = new int[alumnos];
            
            for (int i=0; i < alumnos; i++) {
                fila [i] = sc.nextInt();
                pesoTotal += fila[i];
            }

            for (int i=0; i < alumnos; i++) {
                pesoIzquierda += fila[i];
                if (pesoIzquierda > (pesoTotal/2)) {
                    alumnosIzquierda = i + 1;
                    break;
                }
            }

            for (int i=alumnos -1; i > -1; i--) {
                pesoDerecha += fila[i];
                if (pesoDerecha > (pesoTotal/2)) {
                    alumnosDerecha = alumnos - i;
                    break;
                }
            }

            if ( pesoIzquierda < pesoDerecha) {
                System.out.println(alumnosIzquierda + " " + pesoIzquierda + " " + (pesoTotal - pesoIzquierda));
            }else if (pesoIzquierda > pesoDerecha) {
                System.out.println((alumnos - alumnosDerecha) + " " + (pesoTotal - pesoDerecha) + " " + pesoDerecha);
            }else{
                System.out.println("NO JUEGAN");
            } 
            
        }       
    }       
}

