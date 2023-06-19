import java.util.Scanner;

public class Piscinas {

    static int calcularViajes(int piscina, int barreño, int perdida) {
        if (perdida >= barreño && piscina > barreño) {
            return Integer.MAX_VALUE;
        } else if (barreño >= piscina) {
            return 1;
        } else {
            int viajes = 0;
            while (piscina > 0) {
                int viajesNecesarios = piscina / barreño;
                viajes += viajesNecesarios;
                piscina -= viajesNecesarios * barreño;
                piscina += viajesNecesarios * perdida;
                if (piscina > 0 && piscina < barreño) {
                    viajes++;
                    break;
                }
            }
            return viajes;
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int capacidadMiPiscina = sc.nextInt();
            int capacidadMiBarreño = sc.nextInt();
            int perdidaMiPiscina = sc.nextInt();
            int capacidadSuPiscina = sc.nextInt();
            int capacidadSuBarreño = sc.nextInt();
            int perdidaSuPiscina = sc.nextInt();

            if (capacidadMiPiscina == 0 || capacidadSuPiscina == 0) {
                break;
            }

            int viajesMiPiscina = calcularViajes(capacidadMiPiscina, capacidadMiBarreño, perdidaMiPiscina);
            int viajesSuPiscina = calcularViajes(capacidadSuPiscina, capacidadSuBarreño, perdidaSuPiscina);

            if (viajesMiPiscina == viajesSuPiscina) {
                System.out.println("EMPATE " + viajesMiPiscina);
            } else if (viajesSuPiscina > viajesMiPiscina) {
                System.out.println("YO " + viajesMiPiscina);
            } else {
                System.out.println("VECINO " + viajesSuPiscina);
            }
        }
    }
}
