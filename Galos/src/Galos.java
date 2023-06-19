import java.util.Scanner;

public class Galos {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<nCasos; i++) {
            String nombre = sc.nextLine();
            
            if (nombre.startsWith("MAC")) { 
                if (nombre.endsWith("A") || nombre.endsWith("IX") || nombre.endsWith("US") || nombre.endsWith("UM") || nombre.endsWith("IC") || nombre.endsWith("AS") || 
                    nombre.endsWith("AF") || nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX") || nombre.endsWith("EZ")) {
                    System.out.println("MULATO");
                }else{
                    System.out.println("PICTO");
                }
            }else{
                if (nombre.endsWith("A")) {
                    System.out.println("INDIO");
                }else if (nombre.endsWith("IX")) {
                    System.out.println("GALO");
                }else if (nombre.endsWith("US") || nombre.endsWith("UM")) {
                    System.out.println("ROMANO");
                }else if (nombre.endsWith("IC")) {
                    System.out.println("GODO");
                }else if (nombre.endsWith("AS")) {
                    System.out.println("GRIEGO");
                }else if (nombre.endsWith("AF")) {
                    System.out.println("NORMANDO");
                }else if (nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX")) {
                    System.out.println("BRETON");
                }else if (nombre.endsWith("EZ")) {
                    System.out.println("HISPANO");
                }else{
                    System.out.println("PLUS ULTRA");
                }
            }
        }
    }
}
