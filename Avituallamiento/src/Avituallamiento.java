import java.util.Scanner;

public class Avituallamiento {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int altitudActual = sc.nextInt();
        
        while (altitudActual != -1){
            int puntoAvituallamiento= 0;                        //Marca el punto de avituallamiento, si lo hay.
            int kmLlanosMax = 0;                                //Marca el máximo de kilometros llanos.
            int pkActual = 0;                                   //Variable para ir llevando el pk en que estamos.
            int kmLlanosAct = 0;                                //Variable para ir llevando los kilometros llanos que nos vamos encontrando.
            int pk = 0;                                         //Variable que marca el primer punto cuando encontramos un llano.
            boolean primero = false;
            int altitudSiguiente = sc.nextInt();

            while (altitudSiguiente != -1) {
                
                if  (altitudActual == altitudSiguiente) {       //Si el punto actual y el siguiente son iguales.
                    kmLlanosAct ++;                             //Sumamos un kilometro llano.
                    if (!primero) {                             //Si la variable primero está a false, marcamos el punto pk.
                        primero = true;
                        pk = pkActual;
                    }
                    if (kmLlanosAct > kmLlanosMax) {            //Si los km llanos actuales son mayores que los que tenemos ya guardados.
                        puntoAvituallamiento = pk;              //marcamos el punto de avituallamiento.
                        kmLlanosMax = kmLlanosAct;              //Y actualizamos los km llanos maximos.
                    }
                }else{            
                    kmLlanosAct = 0;
                    primero = false;
                }
                pkActual++;
                altitudActual = altitudSiguiente;
                altitudSiguiente = sc.nextInt();
            }

            if (kmLlanosMax == 0) {
                System.out.println("HOY NO COMEN");
            }else{
                System.out.println(puntoAvituallamiento + " " + kmLlanosMax);
            }

            altitudActual = sc.nextInt();
        }
    }
}

/* ====== Solución con array =========

import java.util.Scanner;

public class Avituallamiento {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int altitud = sc.nextInt();

        while (altitud != -1){
            int pkAvituallamiento = 0;
            int kmAvituallamiento = 0;
            int[] etapa = {altitud};
    
            altitud = sc.nextInt();
                
            //Creamos un array dinamico para ir cargando los pk hasta encontrar el -1.
            int i = 1;
            while (altitud != -1){
                int[] aux = new int[etapa.length + 1];
                System.arraycopy(etapa, 0, aux, 0,etapa.length);
                etapa = aux;
                etapa[i] = altitud;
                i++;
                altitud = sc.nextInt();
            }
                
            //Primer bucle para recorrer todo el array etapa, menos la ultima posicion.
            for (int j=0; j < etapa.length - 1; j++) {
                int pkActual = etapa[j];
                int kmLlanos = 0;
                
                for (int k=j+1; k < etapa.length; k++) {
                    int pkSiguiente = etapa[k];
                    if (pkActual == pkSiguiente) {
                        kmLlanos++;
                    }else{
                        break;
                    }
                }

                if (kmLlanos > kmAvituallamiento) {
                    pkAvituallamiento = j;
                    kmAvituallamiento = kmLlanos;
                }
            }

            if (kmAvituallamiento == 0) {
                System.out.println("HOY NO COMEN");
            }else{
                System.out.println(pkAvituallamiento + " " + kmAvituallamiento);
            }

            altitud = sc.nextInt();
        }
    }
}*/