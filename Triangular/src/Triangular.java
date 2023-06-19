import java.util.Scanner;

public class Triangular {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        
        while (dimension != 0) {
            Boolean superior = true;
            Boolean inferior = true;

            for (int i=0; i < dimension; i++) {
                for (int j=0; j < dimension; j++) {
                    int num = sc.nextInt();
                    if ( i != j && i < j && num != 0) {
                        superior = false;
                    } else if ( i != j && i > j && num != 0) {
                        inferior = false;
                    }
                }
            }    

            if (superior || inferior) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            dimension = sc.nextInt();
        }
    }
}
