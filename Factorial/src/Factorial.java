import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    
    public static BigInteger calcularFactorial(int n) {
        
        if ( n== 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(calcularFactorial(n - 1));
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        System.out.println(calcularFactorial(n));



        /* 
        int p = sc.nextInt();
        while (p.intValue() > 0 && n.intValue() > 0) {
            if (calcularFactorial(n).mod(p).equals(cero)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            p = sc.nextBigInteger();
            n = sc.nextBigInteger();
        }*/
    }
}
