import java.util.Scanner;
import java.util.Stack;

public class A141 {

    static boolean esBalanceado(char[] entrada) {
        Stack<Character> pila = new Stack<>();

        for (char c : entrada) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.empty()) {
                    return false;
                }
                if ( c == ')' && pila.peek() == '(') {
                    pila.pop();
                } else if (c == ']' && pila.peek() == '[') {
                    pila.pop();
                } else if (c == '}' && pila.peek() == '{')
                    pila.pop();
            }
        }

        return pila.empty();
    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            
            char[] entrada = sc.nextLine().toCharArray();
            System.out.println(esBalanceado(entrada)?"YES":"NO");     
        }
    }
}
