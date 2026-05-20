package programacion;

public class Bhaskara {
    static void main() {
        double a = 1, b = -5, c = 6;
        double bcuadro;

        bcuadro = Math.pow(b,2);
        double raiz = bcuadro - 4*a*c;

        double raizb = Math.sqrt(raiz);
        double mas = -b+raizb;
        double menos = -b-raizb;
        double div=2*a;
                double r1=mas/div;
        double r2=menos/div;

        System.out.println("Estan son las raices: " + r1  + " y " + r2);

    }
}
