import java.util.Scanner;

public class Cubifinito {
    
    static void calcularCubifinito(long num) {
        
        if (num == 1) {
            System.out.println(num + " -> cubifinito.");
        } else {
            long total=0;
            String numero = Long.toString(num);
            for (int i=0; i < numero.length(); i++) {
                double cubo = Math.pow(Character.getNumericValue(numero.charAt(i)), 3);
                total += cubo;
            }

            if (total == num) {
                System.out.println(num + " - " + total + " -> no cubifinito.");
            } else {
                System.out.print(num + " - ");
                calcularCubifinito(total);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        long entrada = sc.nextLong();

        while (entrada != 0) {
            calcularCubifinito(entrada);
            entrada = sc.nextLong();
        }
    }
}
