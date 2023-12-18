import java.util.Scanner;

class NodoArbol {
    int dato;
    NodoArbol[] hijos; // un array de nodos

    public NodoArbol(int dato) {// no haría falta escribirlo
        this.dato = dato;
        hijos = new NodoArbol[dato];
    }
}

class Arbol {
    public NodoArbol raiz;
    String[] arbolString;
    int posArray = 0;

    public Arbol(String[] arbolString) {
        raiz = null;
        this.arbolString = arbolString;
        this.crearArbol();
    }

    void imprimirArbol(NodoArbol raiz, String tab) {
        System.out.println(tab + raiz.dato);
        if (raiz.hijos != null) {
            for (NodoArbol nodo : raiz.hijos) {
                imprimirArbol(nodo, tab + "\t");
            }
        }
    }

    private void crearArbol() {
        // la raiz está en arbolString[0]
        int dato = Integer.parseInt(arbolString[0]);
        raiz = new NodoArbol(dato);
        ayudanteCrearArbol(raiz);

    }

    private void ayudanteCrearArbol(NodoArbol padre) {
        for (int i = 0; i < padre.hijos.length; i++) {
            posArray++;
            int dato = Integer.parseInt(arbolString[posArray]);
            padre.hijos[i] = new NodoArbol(dato);
            ayudanteCrearArbol(padre.hijos[i]);
        }
    }

    public int calcularAltura() {
        return ayudanteCalcularAltura(raiz);
    }

    private int ayudanteCalcularAltura(NodoArbol nodo) {
        if (nodo.dato == 0) {
            return 1;
        } else {
            int alturaMaxima = Integer.MIN_VALUE;
            for (NodoArbol hijo : nodo.hijos) {
                int alturaHijo = ayudanteCalcularAltura(hijo);
                if (alturaHijo > alturaMaxima) {
                    alturaMaxima = alturaHijo;
                }
            }
            return alturaMaxima + 1;
        }
    }
}

public class A310 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nCasos; i++) {
            String[] entrada = sc.nextLine().split(" ");
            Arbol arbol = new Arbol(entrada);
            System.out.println(arbol.calcularAltura());
        }
    }
}