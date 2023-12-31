import java.util.Scanner;

public class A271 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int cabeza = sc.nextInt();
            int numeroParejas = sc.nextInt();

            if (cabeza == 0 && numeroParejas == 0) {
                return;
            }

            for (int i = 0; i < numeroParejas; i++) {
                int pareja1 = sc.nextInt();
                int pareja2 = sc.nextInt();
                if ((pareja1 >= pareja2 && pareja1 <= cabeza) || (pareja1 <= pareja2 && pareja1 >= cabeza)) {
                    cabeza = pareja1;
                } else if ((pareja2 >= pareja1 && pareja2 <= cabeza) || (pareja2 <= pareja1 && pareja2 >= cabeza)) {
                    cabeza = pareja2;
                }
                System.out.println(cabeza);
            }
        }
    }
}