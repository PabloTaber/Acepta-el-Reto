import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int billetes = sc.nextInt();
        int ladrones = sc.nextInt();

        while (billetes != 0) {
            //Creo una lista de listas de enteros para ir almacenando los billetes que se dan a cada ladron.
            List<List<Integer>> listaLadrones = new LinkedList<>();
            
            //Sabiendo el numero de ladrones, creo una lista para cada uno de ellos.
            for (int i = 0; i < ladrones; i++) {
                List<Integer> lista = new LinkedList<>();
                listaLadrones.add(lista);
            }

            //Creo una cola de billetes y la cargo con los billetes.
            //Utilizo una cola para ir repartiendo los billetes de modo que el primero en entrar por teclado es el primero en repartirse.
            Queue<Integer> monton = new LinkedList<>();
            for (int i = 0; i < billetes; i++) {
                monton.offer(sc.nextInt());
            }

            //Vacio la cola repartiendo los billetes entre cada una de las listas de los ladrones.
            int contador = 0;
            while (!monton.isEmpty()) {
                listaLadrones.get(contador).add(monton.poll());
                if (contador < ladrones - 1) {
                    contador++;
                }else{
                    contador = 0;
                }
            }

            //Recorro la lista de listas, y para cada una de ellas calculo el total y genero la impresión.
            for (List<Integer> lista : listaLadrones) {
                int total = 0;
                for (Integer billete : lista) {
                    total += billete;
                }
                System.out.print(total + ":");
                
                for (int i = 0; i < lista.size(); i++) {
                    System.out.print(" " + lista.get(i));
                }
                System.out.println();
            }

            System.out.println("---");
            billetes = sc.nextInt();
            ladrones = sc.nextInt();
        }
    }
}
