package programacion.ejercicios;
import java.security.SecureRandom;
import java.util.*;

public class claseAuto {
    String marca;
    String modelo;
    String color;
    int anio;
    String nro_serie;
    String tipoCombus;

    public claseAuto(String marca, String modelo, String color, int anio, String tipoCombus) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.tipoCombus = tipoCombus;
        this.nro_serie = generarNroSerie(); 
    }

    private String generarNroSerie() {
        SecureRandom random = new SecureRandom();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int longitud = 8;
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return sb.toString();
    }

    public void acelerar() {
        int numero = (int)(Math.random() * 180) + 1;
        System.out.println("Estas yendo a " + numero + "km/h");
    }

    public void frenar() {
        System.out.println("Estas frenado, revisa que tus espejos esten bien antes de acelerar");
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
        System.out.println("Numero de serie: " + nro_serie);
        System.out.println("Tipo combustible: " + tipoCombus);
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese marca: ");
        String mar = input.nextLine();
        System.out.println("Ingrese modelo: ");
        String mod = input.nextLine();
        System.out.println("Ingrese color: ");
        String colo = input.nextLine();
        System.out.println("Ingrese año: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Tipo de combustible: ");
        String combu = input.nextLine();

    
        claseAuto a = new claseAuto(mar, mod, colo, year, combu);
        a.mostrarDatos();
        a.acelerar();
        System.out.println(mar.length());
        System.out.println();

        claseAuto a1 = new claseAuto("Nissan", "Note", "Azul", 2026, "Nafta");
        a1.mostrarDatos();
        a1.frenar();
        System.out.println("Nissan".length());
        System.out.println();

        claseAuto a2 = new claseAuto("Wolskvagen", "Gol", "Azul", 2019, "Nafta");
        a2.mostrarDatos();
        a2.acelerar();
        System.out.println("Nissan".length());
        System.out.println();
    }
}
