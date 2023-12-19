import java.util.Scanner;

public class Escapando {

    static Boolean salida;

    public static void comprobarCamino(char[][] espacio, int f, int c) {

        if (f >= 0 && f < espacio.length && c >= 0 && c < espacio[0].length) {
            if (espacio[f][c] == 'F') {
                salida = true;
            } else if (espacio[f][c] == '.') {
                espacio[f][c] = 'x';
                comprobarCamino(espacio, f + 1, c);
                comprobarCamino(espacio, f - 1, c);
                comprobarCamino(espacio, f, c + 1);
                comprobarCamino(espacio, f, c - 1);
            }
        }
    }

    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        int filaInicio = 0;
        int columnaInicio = 0;
        String linea;

        while (sc.hasNext()) {
            int filas = sc.nextInt();
            int columnas = sc.nextInt();
            char[][] espacio = new char[filas][columnas];

            for (int i=0; i < filas; i++) {
                linea = sc.next();
                for (int j=0; j < columnas; j++) {
                    espacio[i][j] = linea.charAt(j);
                    if (espacio[i][j] == 'S') {
                        filaInicio = i;
                        columnaInicio = j;
                        espacio[i][j] = '.';
                    }
                }
            }

            salida = false;
            comprobarCamino(espacio, filaInicio, columnaInicio);

            System.out.println(salida ? "SI" : "NO");
        }
    }
}
