import java.util.Scanner;

public class UnaDola {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();

        for (int i=0; i < casos; i++) {
            
            String[] peregrinos = {};
            String nombre = sc.next();
            
            while (!nombre.equals("F")) {
                String[] aux = new String[peregrinos.length + 1];
                System.arraycopy(peregrinos, 0, aux, 0, peregrinos.length);
                aux[aux.length-1] = nombre;
                peregrinos = aux;

                nombre = sc.next();
            }

            int camas = sc.nextInt();
            int palabras = sc.nextInt();
            if (camas == 0) {
                System.out.println("NADIE TIENE CAMA");
            } else if (camas >= peregrinos.length) {
                System.out.println("TODOS TIENEN CAMA");
            } else {
                while (camas < peregrinos.length) {

                }
            }

        }
    }
}
