import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int numeroPisos = sc.nextInt();
        int numeroLetras = sc.nextInt();
        int asistentes = sc.nextInt();

        while ( numeroPisos != 0 || numeroLetras != 0 || asistentes != 0 ) {
            Set<String> viviendas = new TreeSet<>();

            for (int i = 0; i < asistentes; i++) {
                String piso = sc.next();
                String letra = sc.next();
                viviendas.add(piso + letra);
            }

            int numeroViviendasTotales = numeroPisos*numeroLetras;
            int cuorum = (int) Math.ceil((double) numeroViviendasTotales / 2);
            int numeroViviendasPresentes = viviendas.size();
           
            System.out.println(numeroViviendasPresentes >= cuorum ? "EMPEZAMOS" : "ESPERAMOS");  
        
            numeroPisos = sc.nextInt();
            numeroLetras = sc.nextInt();
            asistentes = sc.nextInt();
        }
    }
}
