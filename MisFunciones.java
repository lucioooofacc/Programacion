package programacion;
public class MisFunciones {

    public static double suma_element(double[] lista) {
        double sum = 0;
        for (int i = 0; i < lista.length; i++) {
            sum += lista[i];
        }
        return sum;
    }

    public static double encontrar(double[] lista, double d) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == d) {
                return i;
            }
        }
        return -1;
    }

    public static double promedio(double[] lista) {
        double sum = 0;
        for (int i = 0; i < lista.length; i++) {
            sum += lista[i];
        }
        double total = sum / lista.length;
        return total;
    }

    public static double mayor_array(double[] lista) {
        double mayor = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] >= mayor) {
                mayor = lista[i];
            }
        }
        return mayor;
    }

    {
    }
}