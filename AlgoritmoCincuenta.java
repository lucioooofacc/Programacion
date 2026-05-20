package programacion;

import java.util.*;
class AlgoritmoCincuenta {
    public static int ContarNumeros() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int contador = 0;

        while (num != 50) {
            System.out.println("Ingrese un numero: ");
            num = input.nextInt();
            contador++;
        }
        return contador;
    }

    static void main() {
        int mostrar = ContarNumeros();
        System.out.println("Tu cantidad de numeros ingresados: " + mostrar);
    }

}
