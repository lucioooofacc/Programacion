package programacion.ejercicios;
import static programacion.ejercicios.MisFunciones.*;
import java.util.*;
public class MenuArray {


    public static void main() {
        Scanner input = new Scanner(System.in);
        int cant;
        double[] lista = new double[0];

        int op;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1_Definir lista");
            System.out.println("2_Mostrar desde la primera posicion hasta la ultima");
            System.out.println("3_Mostrar desde la ultima posicion hasta la primera");
            System.out.println("4_Mostrar la sumatoria de los numeros del array");
            System.out.println("5_Buscar un valor dentro del array");
            System.out.println("6_Promedio de valores del array");
            System.out.println("7_El valor mas grande del array");
            System.out.println("8_Salir");
            System.out.println("Ingrese su opcion aqui: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese tamaño del array: ");
                    cant = input.nextInt();
                    lista = new double[cant];

                    for (int i = 0; i < lista.length; i++) {
                        System.out.println("Ingrese el numero de la posicion #" + (i + 1) + ":");
                        lista[i] = input.nextDouble();
                    }
                    break;


                case 2:
                    System.out.println("Este es el orden" + Arrays.toString(lista));
                    break;

                case 3:
                    for (int i = lista.length - 1; i >= 0; i--){
                        System.out.print(lista[i] + ", ");
                    }
                    break;
                case 4:
                    System.out.println("La sumatoria es: " + (suma_element(lista)));
                    break;
                case 5:
                    System.out.println("Ingrese valor a buscar: ");
                    double d = input.nextDouble();
                    double posicion = encontrar (lista, d);

                    if (posicion != -1){
                        System.out.println("Valor encontrado en la posicion #" + (posicion + 1));
                    } else {
                        System.out.println("El valor no se encuentra en el Array");
                    }
                    break;
                case 6:
                    System.out.println("El promedio es: " + (promedio(lista)));
                    break;
                case 7:
                    System.out.println("Este es el mmayor: " + mayor_array(lista));
                    break;
                case 8:
                    System.out.println("Adios!");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
            if (op != 8) {
                System.out.println("\nPresione ENTER para continuar...");
                input.nextLine();
                input.nextLine();
            }
        } while (op != 8);
    }
}



