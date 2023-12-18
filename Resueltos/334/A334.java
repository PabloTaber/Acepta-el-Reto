import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A334 {

    //Función que inicializa un mapa con las terminaciones de 2 letras.
    public static Map<String, String> inicializarMapa() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("IX", "GALO");
        mapa.put("US", "ROMANO");
        mapa.put("IC", "GODO");
        mapa.put("AS", "GRIEGO");
        mapa.put("UM", "ROMANO");
        mapa.put("AF", "NORMANDO");
        mapa.put("IS", "BRETON");
        mapa.put("OS", "BRETON");
        mapa.put("AX", "BRETON");
        mapa.put("EZ", "HISPANO");

        return mapa;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nCasos; i++) {
            String nombre = sc.nextLine();
            Map<String, String> terminaciones = inicializarMapa();

            //Se obtienen las 2 últimas letras de la entrada.
            String ultimasDosLetras = nombre.length() >= 2 ? nombre.substring(nombre.length() - 2) : "";
            //Se comprueba si las 2 últimas letras están en el mapa y se recupera su valor.
            String exitenUltimasDosLetras = terminaciones.get(ultimasDosLetras);

            if (nombre.startsWith("MAC")) {
                System.out.println((nombre.endsWith("A") || exitenUltimasDosLetras != null) ? "MULATO" : "PICTO");
            } else {
                if (nombre.endsWith("A")) {
                    System.out.println("INDIO");
                } else {
                    System.out.println(exitenUltimasDosLetras != null ? exitenUltimasDosLetras : "PLUS ULTRA");
                }
            }
        }
    }
}
