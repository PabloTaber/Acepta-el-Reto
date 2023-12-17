import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A127 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            List<String> listaPeregrinos = new ArrayList<>();
            String entrada = sc.next();

            while (!entrada.equals("F")) {
                listaPeregrinos.add(entrada);
                entrada = sc.next();
            }

            int camas = sc.nextInt();
            int palabras = sc.nextInt();

            if (camas == 0) {
                System.out.println("NADIE TIENE CAMA");
                continue;
            } else if (camas >= listaPeregrinos.size()) {
                System.out.println("TODOS TIENEN CAMA");
                continue;
            } else {
                int contador = 0;
                int indice = 0;
                while (camas < listaPeregrinos.size()) {
                    contador++;
                    if (contador % palabras == 0) {
                        listaPeregrinos.remove(indice);
                    } else {
                        indice++;
                    }

                    if (indice >= listaPeregrinos.size()) {
                        indice = 0;
                    }

                }
            }

            for (int j=0; j < listaPeregrinos.size(); j++) {
                if ( j == listaPeregrinos.size() - 1){
                    System.out.println(listaPeregrinos.get(j));
                } else {
                    System.out.print(listaPeregrinos.get(j) + " ");
                }   
            }
        }
    }
}
