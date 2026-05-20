package programacion.ejercicios;

import java.util.*;
public class ComprendidoDos {
    public static boolean numero (int n, int a, int x){
        return (n>x && n<a) || (n<x && n>a);
}

void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa el primer numero del rango: ");
    int x = input.nextInt();
    System.out.println("Ingresa el segundo numero del rango: ");
    int a = input.nextInt();
    System.out.println("Ingresa numero a comparar: ");
    int n = input.nextInt();

    if (numero(n, a, x)){
        System.out.println("Esta comprendido");

    } else{
        System.out.println("No lo está");
    }
}
}
