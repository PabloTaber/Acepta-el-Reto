import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A214 {

    static void insertarRey(Map<String, Integer> mapa, String nombre) {
        if (!mapa.containsKey(nombre)) {
            mapa.put(nombre, 1);
        } else {
            mapa.put(nombre, mapa.get(nombre) + 1);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numeroReyes = sc.nextInt();

        while (numeroReyes != 0) {
            Map<String, Integer> listaReyes = new TreeMap<>();

            for (int i = 0; i < numeroReyes; i++) {
                insertarRey(listaReyes, sc.next());
            }

            int numeroSucesores = sc.nextInt();

            for (int i = 0; i < numeroSucesores; i++) {
                String nombre = sc.next();
                insertarRey(listaReyes, nombre);
                System.out.println(listaReyes.get(nombre));
            }

            System.out.println();
            numeroReyes = sc.nextInt();
        }
    }
}
