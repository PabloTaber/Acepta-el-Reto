import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class A300 {

	//Función para iniciar un mapa con las vocales todas a false.
	public static Map<Character, Boolean> inicializarMap () {
		Map<Character, Boolean> mapa = new HashMap<>();
		mapa.put('a', false);
		mapa.put('e', false);
		mapa.put('i', false);
		mapa.put('o', false);
		mapa.put('u', false);
		return mapa;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nPalabras = teclado.nextInt();

		for (int i = 0; i < nPalabras; i++) {
			String palabra = teclado.next();
			Map<Character, Boolean> vocales = inicializarMap();
			
			//Recorro todas las letras de la palabra y cada vez que encuentra una vocal la pone a true en el mapa.
			for (char letra : palabra.toCharArray()) { 
				if (vocales.containsKey(letra)) {
					vocales.put(letra, true);
				}
			}

			//Recorro el mapa buscando si hay alguna vocal al false.
			boolean todoTrue = true;
			for (boolean valor : vocales.values()) {
				if (!valor) {
					todoTrue = false;
					break;
				}
			}

			System.out.println(todoTrue ? "SI" : "NO");
		}
	}
}