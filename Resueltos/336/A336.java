import java.util.Scanner;

public class A336 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int casos = sc.nextInt();
            int[] pesos = new int[casos];
            int pesoTotalIzq = 0;
            int pesoTotalDer = 0;
            int alumnosIzq = 0;
            
            for (int i = 0; i < casos; i++) {
                pesos[i] = sc.nextInt();
                pesoTotalDer += pesos[i];
            }

            int pesoDiferencia = 0;
            int pesoDiferenciaMin = Integer.MAX_VALUE;

            for (int i = 0; i < pesos.length; i++) {
                pesoTotalIzq += pesos[i];
                pesoTotalDer -= pesos[i];
                pesoDiferencia = Math.abs(pesoTotalIzq - pesoTotalDer); 
                if (pesoDiferencia < pesoDiferenciaMin) {
                    pesoDiferenciaMin = pesoDiferencia;
                    alumnosIzq++;
                }else{
                    pesoTotalIzq -= pesos[i];
                    pesoTotalDer += pesos[i];
                    break;
                }
            }

            System.out.println(pesoDiferencia == pesoDiferenciaMin ? "NO JUEGAN" : alumnosIzq + " " + pesoTotalIzq + " " + pesoTotalDer);
        }
    }
}
