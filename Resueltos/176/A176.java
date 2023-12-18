import java.util.Scanner;

public class Buscaminas {
    
    //metodo que cuenta las minas que hay alrededor de una posicion dada.
    public static int contarMinasAlrededor(char[][] tablero, int fila, int columna) {
        int recuento = 0;

        for (int i=Math.max(0, fila-1); i < Math.min(tablero.length, fila+2); i++) {
            for (int j=Math.max(0, columna-1); j < Math.min(tablero[i].length, columna+2); j++) {
                if (tablero[i][j] == '*') {
                    recuento++;
                }
            }
        }
        return recuento;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int columnas = sc.nextInt();
        int filas = sc.nextInt();
        
        while (columnas !=0 && filas !=0) {
            char[][] tablero = new char[filas][columnas];
            int minas = 0;

            //Se carga el array tablero con la entrada.
            for (int i=0; i < filas; i++) {
                String lineaEntrada = sc.next(); 
                for (int j=0; j < columnas; j++) {                    
                    tablero[i][j] = lineaEntrada.charAt(j);
                }
            }

            for (int i=0; i < filas; i++) {
                for (int j=0; j < columnas; j++) {  
                    if (tablero[i][j] == '-' && contarMinasAlrededor(tablero,i,j) > 5) {
                        minas++;
                    }
                }
            }

            System.out.println(minas);
            columnas = sc.nextInt();
            filas = sc.nextInt();
        }
    }
}
