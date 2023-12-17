import java.util.Scanner;

class Comida implements Comparable<Comida> {
    String comida;
    double valor;

    public Comida(String comida, double valor) {
        this.comida = comida;
        this.valor = valor;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = this.valor + valor;
    }

    @Override
    public int compareTo(Comida otra) {
        return Double.compare(this.valor, otra.valor);
    }
}

public class Bar {

    public static void cargarDatosVentas(Comida[] lista, String letraComida, double importeComida) {
        switch (letraComida) {
            case "D":
                lista[0].setValor(importeComida);
                break;
            case "A":
                lista[1].setValor(importeComida);
                break;
            case "M":
                lista[2].setValor(importeComida);
                break;
            case "I":
                lista[3].setValor(importeComida);
                break;
            case "C":
                lista[4].setValor(importeComida);
                break;
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Comida[] lista = { new Comida("DESAYUNOS", 0),
                    new Comida("COMIDAS", 0),
                    new Comida("MERIENDAS", 0),
                    new Comida("CENAS", 0),
                    new Comida("COPAS", 0) };

            String letraComida = sc.next();
            double importe = sc.nextDouble();
            double media = 0;
            int contadorMax = 0;
            int contadorMin = 0;
            int indiceMax = 0;
            int indiceMin = 0;
            int dia = 0;

            // Se carga el array con toda la comida,
            while (!letraComida.equals("N")) {
                dia++;
                media += importe;
                cargarDatosVentas(lista, letraComida, importe);
                letraComida = sc.next();
                importe = sc.nextDouble();
            }

            double maximo = Math.max(lista[0].valor,
                    Math.max(lista[1].valor, Math.max(lista[2].valor, Math.max(lista[3].valor, lista[4].valor))));
            double minimo = Math.min(lista[0].valor,
                    Math.min(lista[1].valor, Math.min(lista[2].valor, Math.min(lista[3].valor, lista[4].valor))));
            media = media / dia;

            for (int i = 0; i < lista.length; i++) {
                if (lista[i].valor == maximo) {
                    indiceMax = i;
                    contadorMax++;
                }
                if (lista[i].valor == minimo) {
                    indiceMin = i;
                    contadorMin++;
                }
            }

            if (contadorMax > 1) {
                System.out.print("EMPATE");
            } else {
                System.out.print(lista[indiceMax].comida);
            }
            if (contadorMin > 1) {
                System.out.print("#EMPATE");
            } else {
                System.out.print("#" + lista[indiceMin].comida);
            }

            if (lista[1].valor > media) {
                System.out.println("#SI");
            } else {
                System.out.println("#NO");
            }
        }
    }
}
