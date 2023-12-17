import java.util.Scanner;

public class A151 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        
        while (dimension != 0) {
            Boolean matriz = true;
            for (int i=0; i < dimension; i++) {
                for (int j=0; j < dimension; j++) {
                    int num = sc.nextInt();
                    if (i == j && num != 1 ) {
                        matriz = false;
                    } else if (i != j && num != 0) {
                        matriz = false;
                    }
                }
            }

            if (matriz) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            dimension = sc.nextInt();
        }
    }
}
