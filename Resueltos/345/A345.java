import java.util.Scanner;

public class Sudoku {

    // metodo para comprobar si hay numeros repetidos dentro de una cuadricula 3x3.
    // devuelve true si hay repetidos y false si no los hay.
    public static Boolean repetidosEn3x3(int[][] sudoku, int x, int y) {

        Boolean repetidos = false;
        int[] numeros = new int[9];

        int k = 0;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                numeros[k] = sudoku[i][j];
                k++;
            }
        }

        bucleExterior: for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetidos = true;
                    break bucleExterior;
                }
            }
        }
        return repetidos;
    }

    public static void main(String[] args) throws Exception {

        final int DIMENSION = 9;
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int k = 0; k < casos; k++) {
            int[][] sudoku = new int[DIMENSION][DIMENSION];
            Boolean correcto = true;

            for (int i = 0; i < DIMENSION; i++) {
                for (int j = 0; j < DIMENSION; j++) {
                    sudoku[i][j] = sc.nextInt();
                    if (sudoku[i][j] < 1 || sudoku[i][j] > 9) {
                        correcto = false;
                    }
                }
            }

            // comprobar que no hay ningún número repetido en ninguna fila ni en ninguna
            // columna.
            bucle_Filas_Columnas: for (int i = 0; i < DIMENSION; i++) {
                // bucle para recorrer todas las filas comparando cada posición con todas las
                // siguientes.
                for (int j = 0; j < DIMENSION - 1; j++) {
                    for (int f = j + 1; f < DIMENSION; f++) {
                        if (sudoku[i][j] == sudoku[i][f] || sudoku[j][i] == sudoku[f][i]) {
                            correcto = false;
                            break bucle_Filas_Columnas;
                        }
                    }
                }
            }

            // comprobar que no hay ningún numero repetido en ninguna de las casillas 3x3.
            bucle_recuadros_3x3: for (int i = 0; i < DIMENSION; i += 3) {
                for (int j = 0; j < DIMENSION; j += 3) {
                    if (repetidosEn3x3(sudoku, i, j)) {
                        correcto = false;
                        break bucle_recuadros_3x3;
                    }
                }
            }

            System.out.println(correcto ? "SI" : "NO");
        }
    }
}
