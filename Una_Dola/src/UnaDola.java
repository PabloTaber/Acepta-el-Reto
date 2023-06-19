import java.util.Scanner;
import java.util.ArrayList;

public class UnaDola {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i=0; i < casos; i++) {
            ArrayList<String> peregrinos = new ArrayList<String>();
            String nombre = sc.next();
            
            while (!nombre.equals("F")) {
                peregrinos.add(nombre);
                nombre = sc.next();
            }

            int camas = sc.nextInt();
            int palabras =sc.nextInt();

            if (camas == 0) {
                System.out.println("NADIE TIENE CAMA");
            } else if ( camas >= peregrinos.size()) {
                System.out.println("TODOS TIENEN CAMA");
            } else {
                int contador = 1;
                while (camas < peregrinos.size()) {
                    for (int j=0; j < peregrinos.size(); j++) {
                        if (camas >= peregrinos.size()) {
                            break;
                        } else if (contador == palabras) {
                            peregrinos.remove(j);
                            contador = 1;
                            j--;
                        } else {
                            contador++;
                        }
                        
                    }
                }

                for (int j=0; j < peregrinos.size(); j++) {
                    if ( j == peregrinos.size() - 1){
                        System.out.println(peregrinos.get(j));
                    } else {
                        System.out.print(peregrinos.get(j) + " ");
                    }   
                }
            }
        }
    }
}



