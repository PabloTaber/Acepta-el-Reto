import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A109 {

    //Actualiza la clasificación con los datos de un partido.
    static void actualizarClasificacion(String equipo1, int sets1, String equipo2, int sets2, Map<String, Integer> clasificacion) {
        if (sets1 > sets2) {
            clasificacion.put(equipo1, clasificacion.get(equipo1)==null ? 2 : clasificacion.get(equipo1) + 2);
            clasificacion.put(equipo2, clasificacion.get(equipo2)==null ? 1 : clasificacion.get(equipo2) + 1);
        }else{
            clasificacion.put(equipo1, clasificacion.get(equipo1)==null ? 1 : clasificacion.get(equipo1) + 1);
            clasificacion.put(equipo2, clasificacion.get(equipo2)==null ? 2 : clasificacion.get(equipo2) + 2);
        }
    }

    //Devuelve un String con el nombre del equipo ganador o empate si lo hay.
    static String calcularGanador(Map<String, Integer> clasificacion) {
        Set<String> claves = clasificacion.keySet();
        int max = Integer.MIN_VALUE;
        String ganador = "";

        for (String k : claves) {
            if (clasificacion.get(k) > max) {
                max = clasificacion.get(k);
                ganador = k;
            }else if (clasificacion.get(k) == max) {
                ganador = "EMPATE";
            }
        }
        return ganador;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String categoria = sc.next();

        while (!categoria.equals("FIN")) {
            
            Map<String,Integer> clasificacion = new HashMap<>();
            int partidosJugados = 0;

            while (true){

                String equipo1 = sc.next();
                if (equipo1.equals("FIN")) break; //Sale del bucle interno al detectar el primer FIN.
                int sets1 = sc.nextInt();
                String equipo2 = sc.next();
                int sets2 = sc.nextInt();

                actualizarClasificacion(equipo1, sets1, equipo2, sets2, clasificacion);
                partidosJugados++;
                 
            }

            int numeroEquipos = clasificacion.size();
            int totalPartidos = (numeroEquipos * (numeroEquipos - 1)) / 2 * 2;
            System.out.println(calcularGanador(clasificacion) + " " + (totalPartidos - partidosJugados));

            categoria = sc.next();
        }
    }
}
