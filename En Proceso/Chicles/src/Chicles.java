import java.util.Scanner;

public class Chicles {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int envoltoriosCambio = teclado.nextInt();
        int chiclesRegalo = teclado.nextInt();
        int chiclesComprados = teclado.nextInt();

        while (envoltoriosCambio != 0 || chiclesRegalo != 0 || chiclesComprados != 0) {

            int chiclesComidos = chiclesComprados;
            int envoltoriosRestantes = chiclesComprados;
            
            if (chiclesRegalo == 0 || chiclesComprados == 0) {                                              //Si no regalan chicles -> devuelve en valor de los chiclesComprados y los envoltorios.
                System.out.println(chiclesComidos + " " + envoltoriosRestantes);                 
            }else if (envoltoriosCambio <= chiclesRegalo && chiclesComprados >= envoltoriosCambio) {        //Si compramos suficientes chicles para poder cambiar y dan más o igual chicles por envoltorio.
                System.out.println("RUINA");                                                             //La empresa va a la ruina.
            }else{
                while (envoltoriosRestantes >= envoltoriosCambio) {                       
                    int chiclesRegalados = (envoltoriosRestantes / envoltoriosCambio)*chiclesRegalo;
                    chiclesComidos += chiclesRegalados;
                    envoltoriosRestantes = chiclesRegalados + (envoltoriosRestantes % envoltoriosCambio); 
                }
                System.out.println(chiclesComidos + " " + envoltoriosRestantes);  
            } 
            
            envoltoriosCambio = teclado.nextInt();
            chiclesRegalo = teclado.nextInt();
            chiclesComprados = teclado.nextInt(); 
        }
    }
}
