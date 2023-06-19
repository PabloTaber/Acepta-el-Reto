import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Tortitas {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> torre = new Stack<>();
        Queue<Integer> colaAux = new LinkedList<>();
        
        //leo por teclado el primer numero.
        int numero = sc.nextInt();

        //si es igual a 0 se acabo.
        while (numero != 0) {
            //meto el primer elemento en la pila.
            if (numero == -1 && sc.nextInt() == 0) {
                break;
            } 
            torre.push(numero);
            //Leo el segundo elemento.
            numero = sc.nextInt();
        
            //Si es distinto de -1 meto más elementos en la torre hasta que sea -1.
            while (numero != -1) {
                torre.push(numero);
                numero = sc.nextInt();
            }
            
            //Leo por teclado el numero de volteos.
            int volteos = sc.nextInt();

            for (int i = 0; i < volteos; i++) {
                //Para cada volteo leo el numero de tortitas que se dan la vuelta.
                int nTortitas = sc.nextInt();
                //Saco las nTortitas de la Pila y las meto en una cola, para que la de más arriba pase a estar primera de la cola.
                for (int j = 0; j < nTortitas; j++) {
                    colaAux.add(torre.pop());
                }
                //Vacio la cola metiendo las nTortitas nuevamente en la Pila.
                while (!colaAux.isEmpty()) {
                    torre.push(colaAux.poll());
                }
            }

            System.out.println(torre.peek());

            numero = sc.nextInt();
        }
    }
}
