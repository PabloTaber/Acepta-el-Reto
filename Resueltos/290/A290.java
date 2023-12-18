import java.util.Scanner;

class NodoArbol {
    NodoArbol nodoIzq;
    char datos;
    NodoArbol nodoDer;

    public NodoArbol(char datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null; // recien creado un nodo, no tiene hijos
    }
}

class Arbol {
    public NodoArbol raiz;
    char[] arbolString;// el arbol como una línea de
    int posArray = 0;

    public Arbol(char[] arbolString) {
        raiz = null;
        this.arbolString = arbolString;
        this.crearArbol();
    }

    public void recorridoPreorden() {
        ayudantePreorden(raiz, "");
    }

    private void ayudantePreorden(NodoArbol nodo, String tab) {
        if (nodo == null) {
            System.out.println(tab + "null");
            return;
        }
        System.out.println(tab + nodo.datos);
        tab = tab + "\t";
        ayudantePreorden(nodo.nodoIzq, tab);
        ayudantePreorden(nodo.nodoDer, tab);
    }

    private void crearArbol() {
        // la raiz está en arbolString[0]
        char dato = arbolString[0];
        if (dato == -1) {// árbol vacío
            raiz = null;
        } else {
            raiz = new NodoArbol(dato);
            ayudanteCrearArbol(raiz);
        }
    }

    private void ayudanteCrearArbol(NodoArbol padre) {
        // subarbol izquierdo del padre
        posArray++;
        char dato = arbolString[posArray];
        if (dato != '.') {// si es -1 entonces nodoIzq queda con null
            padre.nodoIzq = new NodoArbol(dato);
            ayudanteCrearArbol(padre.nodoIzq);
        }
        // subarbol derecho del padre
        posArray++;
        dato = arbolString[posArray];
        if (dato != '.') {
            padre.nodoDer = new NodoArbol(dato);
            ayudanteCrearArbol(padre.nodoDer);
        }
    }

    public int calcularAltura() {
        return ayudanteCalcularAltura(raiz);
    }

    private int ayudanteCalcularAltura(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        }else{
            return 1 + Math.max(ayudanteCalcularAltura(nodo.nodoIzq), ayudanteCalcularAltura(nodo.nodoDer));
        }
       
    }
}

public class A290 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            char[] entrada = sc.next().toCharArray();
            
            if (entrada[0] == '.'){
                System.out.println("0");
            }else{
                Arbol arbol = new Arbol(entrada);
                System.out.println(arbol.calcularAltura());
            }
        }
    }
}
