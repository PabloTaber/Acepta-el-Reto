import java.util.Scanner;

public class Conjugar {

    public static void imprimirConjugacion(String raiz, String[] tiempo) {
        String[] personas = {"yo","tu","el","nosotros","vosotros","ellos"};
        
        for (int i=0; i < personas.length; i++){
            System.out.println(personas[i] + " " + raiz + tiempo[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        String[] presenteAr = {"o","as","a","amos","ais","an"};
        String[] presenteEr = {"o","es","e","emos","eis","en"};
        String[] presenteIr = {"o","es","e","imos","is","en"};
        String[] pasadoAr = {"e","aste","o","amos","asteis","aron"};
        String[] pasadoErIr = {"i","iste","io","imos","isteis","ieron"};
        String[] futuro = {"re","ras","ra","remos","reis","ran"};
       
        
        Scanner sc = new Scanner(System.in);
        String verbo = sc.next();
        String tiempoVerbal = sc.next();

        while (!tiempoVerbal.equals("T")) {
            String raiz; 
            String terminacion = verbo.substring(verbo.length()-2);
            
            if (tiempoVerbal.equals("F")){                          //En el futuro las conjugaciones son todas iguales con una letra más en la raiz.
                raiz = verbo.substring(0, verbo.length()-1);
                imprimirConjugacion(raiz, futuro);
            }else{
                raiz = verbo.substring(0, verbo.length()-2);

                if (terminacion.equals("ar")) {
                    if (tiempoVerbal.equals("A")){
                        imprimirConjugacion(raiz, presenteAr);
                    }else if (tiempoVerbal.equals("P")) {
                        imprimirConjugacion(raiz, pasadoAr);
                    }
                }else if (terminacion.equals("er")) {
                    if (tiempoVerbal.equals("A")){
                        imprimirConjugacion(raiz, presenteEr);
                    }else if (tiempoVerbal.equals("P")) {
                        imprimirConjugacion(raiz, pasadoErIr);
                    }
                }else{
                    if (tiempoVerbal.equals("A")){
                        imprimirConjugacion(raiz, presenteIr);
                    }else if (tiempoVerbal.equals("P")) {
                        imprimirConjugacion(raiz, pasadoErIr);
                    }
                }
            }
            verbo = sc.next();
            tiempoVerbal = sc.next();
        }
    }
}
