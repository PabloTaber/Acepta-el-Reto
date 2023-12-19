import java.util.Scanner;
import java.util.Arrays;

public class A254 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroEsquiadores = sc.nextInt();

		while (numeroEsquiadores != 0) {
			int[] esquiadores = new int[numeroEsquiadores];
			int[] esquis = new int[numeroEsquiadores];
			int suma = 0;

			//Se carga el array de esquiadores
			for (int i = 0; i < numeroEsquiadores; i++) {
				esquiadores[i] = sc.nextInt();
			}

			//Se carga el array de esquis
			for (int i = 0; i < numeroEsquiadores; i++) {
				esquis[i] = sc.nextInt();
			}

			//Se ordenan los arrays.
			Arrays.sort(esquiadores);
			Arrays.sort(esquis);


			for (int i = 0; i < numeroEsquiadores; i++) {
				suma += Math.abs(esquiadores[i] - esquis[i]);
			}

			System.out.println(suma);
			numeroEsquiadores = sc.nextInt();
		}
	}
}
