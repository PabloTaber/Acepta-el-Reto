import java.util.Scanner;

public class Ajedrez {
    
    static void dibujarLineaBorde(int tamaño) {
        System.out.print("|");
        for (int i=0; i < (8*tamaño); i++){
            System.out.print("-");
        }
        System.out.println("|");
    }

    static void dibujarLineaBlanca(int tamaño, char c) {
        System.out.print("|");
        for (int i=0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j=0; j < tamaño; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j=0; j < tamaño; j++) {
                    System.out.print(c);
                }  
            }
        }
        System.out.println("|");
    }

    static void dibujarLineaNegra(int tamaño, char c) {
        System.out.print("|");
        for (int i=0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j=0; j < tamaño; j++) {
                    System.out.print(c);
                }
            } else {
                for (int j=0; j < tamaño; j++) {
                    System.out.print(" ");
                }  
            }
        }
        System.out.println("|");
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int tamaño = sc.nextInt();
        while (tamaño != 0) {
            char c = sc.next().charAt(0);
            dibujarLineaBorde(tamaño);
            for (int i=0; i < 4; i++) {
                for (int j=0; j < tamaño; j++) {
                    dibujarLineaBlanca(tamaño, c);
                }
                for (int k=0; k < tamaño; k++) {
                    dibujarLineaNegra(tamaño, c);
                } 
            }
            dibujarLineaBorde(tamaño);
            tamaño = sc.nextInt();
        }
    }
}
