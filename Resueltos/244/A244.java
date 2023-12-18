import java.util.Scanner;

public class A244 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int tablero = sc.nextInt();
        int nReinas = sc.nextInt();

        while (tablero != 0 || nReinas != 0) {
            int[] cx = new int[nReinas];
            int[] cy = new int[nReinas];

            for (int i = 0; i < nReinas; i++) {
                cx[i] = sc.nextInt();
                cy[i] = sc.nextInt();
            }

            Boolean atacada = false;
            bucleExterior: for (int i = 0; i < nReinas - 1; i++) {
                for (int j = i + 1; j < nReinas; j++) {
                    if (cx[i] == cx[j] || cy[i] == cy[j] || cx[i] - cy[i] == cx[j] - cy[j]
                            || cx[i] + cy[i] == cx[j] + cy[j]) {
                        atacada = true;
                        break bucleExterior;
                    }
                }
            }

            System.out.println(atacada ? "SI" : "NO");
            tablero = sc.nextInt();
            nReinas = sc.nextInt();
        }
    }
}