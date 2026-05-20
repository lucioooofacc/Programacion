package programacion.ejercicios;

import java.util.*;
public class AlgoritmoPrecio {
    static void main() {
        Scanner input = new Scanner(System.in);
        int pmax = 4000, pmin = 2500;
        System.out.println("Ingresa el precio del producto: ");
        int precio = input.nextInt();

        if (precio>pmin && precio<pmax){
            System.out.println("Este es tu precio final en dolares: " + precio*1.22/40 + "USD");
        }
        else if (precio>pmax){
            System.out.println("Este es tu precio final en dolares: " + precio*0.85/40 + "USD");
        } else{
            System.out.println("Este es tu precio final en dolares: " + precio*0.95/40 + "USD");

        }
    }
}
