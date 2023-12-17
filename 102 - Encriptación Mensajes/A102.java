import java.util.Scanner;

public class A102 {

    public static String codificar(String entrada, int desplazamiento) {
        String resultado = "";
        for (int i=0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
                if (letra >= 'a' && letra <= 'z') {
                    letra += desplazamiento;
                    if (letra > 'z') {
                        letra -=26;
                    } else if (letra < 'a') {
                        letra += 26;
                    }
                    resultado += letra;
                } else if (letra >= 'A' && letra <= 'Z') {
                    letra += desplazamiento;
                    if (letra > 'Z') {
                        letra -=26;
                    } else if (letra < 'A') {
                        letra += 26;
                    }
                    resultado += letra;
                }
        }
        return resultado;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        
        char primeraLetra = entrada.charAt(0);
        int desplazamiento = 'p' - primeraLetra;
        entrada = entrada.substring(1);
        String codificado = codificar(entrada, desplazamiento);

        while (!codificado.equals("FIN")) {
            int vocales = 0;

            for (int i=0; i < codificado.length(); i++) {
                char letra = codificado.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ) {
                    vocales++;
                }
            }
            System.out.println(vocales);

            entrada = sc.nextLine();
            primeraLetra = entrada.charAt(0);
            desplazamiento = 'p' - primeraLetra;
            entrada = entrada.substring(1);
            codificado = codificar(entrada, desplazamiento);
        }
    }
}