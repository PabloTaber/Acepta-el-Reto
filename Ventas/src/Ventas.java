import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double importe = sc.nextDouble();
        String[] dias = {"MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};

        while (importe != -1) {
            int max = 0;
            int min = 0;
            double importeMax = importe;
            double importeMin = importe;
            double media = importe;
            Boolean empateMax = false;
            Boolean empateMin = false;
            
            for (int i=1; i < 6; i++) {
                
                importe = sc.nextDouble();
                media += importe;

                if (importe < importeMin) {
                    importeMin = importe;
                    min = i;
                    empateMin = false;
                } else if (importe == importeMin) {
                    empateMin = true;
                } else if (importe > importeMax) {
                    importeMax = importe;
                    max = i;
                    empateMax = false;
                } else if (importe == importeMax) {
                    empateMax = true;
                } 
            }

            media = media / 6;

            if (empateMax) {
                System.out.print("EMPATE ");
            } else {
                System.out.print(dias[max] + " ");
            }
            
            if (empateMin) {
                System.out.print("EMPATE ");
            } else {
                System.out.print(dias[min] + " ");
            }

            if (importe > media) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            
            importe = sc.nextDouble();
        }
    }
}
