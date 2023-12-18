import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class A270 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numeroEjercicios = Integer.parseInt(sc.nextLine());

        while (numeroEjercicios != 0) {
            Map<String, Integer> evaluacion = new TreeMap<>();

            for (int i = 0; i < numeroEjercicios; i++) {
                String alumno = sc.nextLine();
                String valoracion = sc.nextLine();
                int nota = valoracion.equals("CORRECTO") ? 1 : -1;
                evaluacion.put(alumno, evaluacion.containsKey(alumno) ? nota : evaluacion.get(alumno) + nota);
            }

            Set<String> alumnos = evaluacion.keySet();

            for (String alumno : alumnos) {
                if (evaluacion.get(alumno) != 0) {
                    System.out.println(alumno + ", " + evaluacion.get(alumno));
                }
            }

            System.out.println("---");
            numeroEjercicios = Integer.parseInt(sc.nextLine());
        }
    }
}
