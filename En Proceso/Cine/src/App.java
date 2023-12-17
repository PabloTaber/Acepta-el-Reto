import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        Queue<Integer> cola = new LinkedList<>();
        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            int espectadores = sc.nextInt();

            int espectadoresEnSuPuerta = 0;
            boolean puertaAbierta = false;
            
            //cargo la cola de espectadores.
            for (int j = 0; j < espectadores; j++) {1
                cola.offer(sc.nextInt());
            }

            //voy desencolando gente hasta acabar la cola o hasta llegar al primer impar.
            while (!cola.isEmpty()) {
                int butaca = cola.poll();
                if (butaca%2==0) {
                    espectadoresEnSuPuerta++;
                }else{
                    puertaAbierta = true;
                    break;
                }
            }
            //sigo desencolando lo que queda de cola hasta acabar la cola o encontrar un par.
            while(!cola.isEmpty()) {
                int butaca = cola.poll();
                if (butaca%2==0) {
                    puertaAbierta = false;
                    break;
                }
            }

            System.out.println(puertaAbierta ? "SI " + espectadoresEnSuPuerta : "NO");
        }
    }
}
