package programacion;
import java.util.*;
public class perro {
    String nombre;
    String raza;
    int edad;
    double peso;
    String color;

    public perro (String nombre, String raza, int edad, double peso, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
    }
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    public void mostrar_datos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Color: " + color);
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nom = input.nextLine();
        System.out.println("Ingrese raza: ");
        String raz = input.nextLine();
        System.out.println("Ingrese edad: ");
        int ed = input.nextInt();
        System.out.println("Ingrese peso: ");
        double pes = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese color: ");
        String colo = input.nextLine();

        perro p = new perro (nom, raz, ed, pes, colo);
        p.mostrar_datos();
        p.ladrar();
        System.out.println();

         perro p1 = new perro ("Duke", "Cimarron", 12, 45.9, "Marron" );
         p1.mostrar_datos();
         p1.ladrar();
         System.out.println();

         perro p2 = new perro ("Otto", "Enanito", 6, 18.5, "Blanco" );
         p2.mostrar_datos();
         p2.ladrar();
    }
}
