import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class A101 {

    // Este método devuelve true si el array es esotérico y false si no lo es.
    // Recibe como parámetros el array y la constante mágica.
    public static Boolean esEsoterico(int[][] cuadrado, int constanteMagica) {
        int constanteMagica2 = 4 * constanteMagica / cuadrado.length;
        int n = cuadrado.length;
        int sumaLados = 0;
        int centro = 0;
        List<Integer> listaValores = new LinkedList<>();

        // Se recorre todo el cuadrado añadiendo todos los elementos a la lista de
        // valores.
        // Si el valor que se va a añadir ya está en la lista o sale del rango del
        // cuadrado
        // devuelve false.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (listaValores.contains(cuadrado[i][j]) || cuadrado[i][j] < 1 || cuadrado[i][j] > n * n) {
                    return false;
                } else {
                    listaValores.add(cuadrado[i][j]);
                }
            }
        }

        // Como no hay elementos repetidos en la lista se comprueba si su tamaño es
        // distinto
        // del cuadrado del tamaño de las filas/columnas del cuadrado.
        if (listaValores.size() != cuadrado.length * cuadrado.length) {
            return false;
        }

        // Calculo la suma de las esquinas y compruebo si es distinto de
        // constanteMagica2.
        int sumaEsquinas = cuadrado[0][0] + cuadrado[0][n - 1] + cuadrado[n - 1][0] + cuadrado[n - 1][n - 1];
        if (sumaEsquinas != constanteMagica2) {
            return false;
        }

        // Se comprueba si el tamaño del array es par o impar para hacer los calculos
        // que corresponda.
        if (n % 2 != 0) {
            int posicionCentro = n / 2;

            sumaLados = cuadrado[0][posicionCentro] + cuadrado[posicionCentro][0] + cuadrado[posicionCentro][n - 1]
                    + cuadrado[n - 1][posicionCentro];

            centro = cuadrado[posicionCentro][posicionCentro] * 4;

            if (sumaLados != constanteMagica2 || centro != constanteMagica2) {
                return false;
            }

        } else {
            int posicionCentro2 = n / 2;
            int posicionCentro1 = posicionCentro2 - 1;

            sumaLados = cuadrado[0][posicionCentro1] + cuadrado[posicionCentro1][0] + cuadrado[posicionCentro1][n - 1]
                    + cuadrado[n - 1][posicionCentro1]
                    + cuadrado[0][posicionCentro2] + cuadrado[posicionCentro2][0] + cuadrado[posicionCentro2][n - 1]
                    + cuadrado[n - 1][posicionCentro2];
            System.out.println(sumaLados);

            centro = cuadrado[posicionCentro1][posicionCentro1] + cuadrado[posicionCentro1][posicionCentro2]
                    + cuadrado[posicionCentro2][posicionCentro1] + cuadrado[posicionCentro2][posicionCentro2];
            System.out.println(centro);

            if (sumaLados != 2 * constanteMagica2 || centro != constanteMagica2) {
                return false;
            }
        }

        // Si llegamos hasta aqui es porque se cumplen todos los requisitos para ser
        // Esoterico.
        return true;
    }

    // Este método devuelve true si el array es diabolico y false si no lo es.
    // Recibe como parámetros el array y la constante mágica.
    public static Boolean esDiabolico(int[][] cuadrado, int constanteMagica) {
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < cuadrado.length; i++) {
            int fila = 0;
            int columna = 0;

            for (int j = 0; j < cuadrado[i].length; j++) {
                fila += cuadrado[i][j];
                columna += cuadrado[j][i];
            }

            // Se comprueba si cada fila y cada columna suman lo mismo que la primera fila
            // del cuadrado.
            if (fila != constanteMagica || columna != constanteMagica) {
                return false;
            }

            // Se calculan la suma de las 2 diagonales.
            diagonalPrincipal += cuadrado[i][i];
            diagonalSecundaria += cuadrado[i][cuadrado.length - 1 - i];
        }

        // Se comprueba si las 2 diagonales suman lo mismo que la primera fila del
        // cuadrado.
        if (diagonalPrincipal != constanteMagica || diagonalSecundaria != constanteMagica) {
            return false;
        }

        // Si se llega hasta aqui es porque todas las filas, columnas y diagonales suman
        // igual que la primera fila.
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = sc.nextInt();

        while (tamaño != 0) {
            int constanteMagica = 0;
            int[][] cuadrado = new int[tamaño][tamaño];

            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    cuadrado[i][j] = sc.nextInt();
                    if (i == 0) {
                        constanteMagica += cuadrado[i][j];
                    }
                }
            }

            Boolean diabolico = esDiabolico(cuadrado, constanteMagica);
            if (diabolico) {
                Boolean esoterico = esEsoterico(cuadrado, constanteMagica);
                System.out.println(esoterico ? "ESOTERICO" : "DIABOLICO");
            } else {
                System.out.println("NO");
            }

            tamaño = sc.nextInt();
        }
    }
}
