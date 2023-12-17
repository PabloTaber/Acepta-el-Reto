import java.util.Scanner;

public class A156 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int distancia = 0;
		int inicio = teclado.nextInt();
		while (inicio >= 0) {
			int pisoIni = teclado.nextInt();
			if (pisoIni != -1) {
				distancia = Math.abs(inicio - pisoIni);
				while (pisoIni != -1) {
					int pisoFin = teclado.nextInt();
					if (pisoFin == -1) {
						break;
					}
					distancia = distancia + Math.abs(pisoIni - pisoFin);
					pisoIni = teclado.nextInt();
					if (pisoIni == -1) {
						break;
					}
					distancia = distancia + Math.abs(pisoFin - pisoIni);
				}
			}
			System.out.println(distancia);
			distancia = 0;
			inicio = teclado.nextInt();
		}
	}
}
