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

    public static void listaMayores(claseAuto... autos) {
        boolean[] usado = new boolean[autos.length];

        System.out.println("Lista");

        for (int posicion = 1; posicion <= autos.length; posicion++) {
            int indiceMayor = -1;

            for (int i = 0; i < autos.length; i++) {
                if (!usado[i]) {
                    if (indiceMayor == -1 ||
                            autos[i].marca.length() > autos[indiceMayor].marca.length()) {
                        indiceMayor = i;
                    }
                }
            }
            usado[indiceMayor] = true;
            System.out.println(posicion + " - " + autos[indiceMayor].marca + " (" + autos[indiceMayor].marca.length() + " caracteres)");
        }
    }

    public void acelerar() {
        int numero = (int)(Math.random() * 180) + 1;
        System.out.println("Estas yendo a " + numero + "km/h");
    }

    public void frenar() {
        System.out.println("Estas frenado, revisa que tus espejos esten bien antes de acelerar");
    }

    public void getDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
        System.out.println("Numero de serie: " + nro_serie);
        System.out.println("Tipo combustible: " + tipoCombus);
    }

    private void cambiarAnio(int num){
        if (num != this.anio){
            this.anio = num;
            System.out.println("Se ha cambiado el año del vehiculo");
        }

    }
    static void main() {
        Scanner input = new Scanner(System.in);

//        System.out.println("Ingrese marca: ");
//        String mar = input.nextLine();
//        System.out.println("Ingrese modelo: ");
//        String mod = input.nextLine();
//        System.out.println("Ingrese color: ");
//        String colo = input.nextLine();
//        System.out.println("Ingrese año: ");
//        int year = input.nextInt();
//        input.nextLine();
//        System.out.println("Tipo de combustible: ");
//        String combu = input.nextLine();
//
//
//        claseAuto a = new claseAuto(mar, mod, colo, year, combu);
//        a.getDatos();
//        a.acelerar();
//        System.out.println(mar.length());
//        System.out.println();

        claseAuto a1 = new claseAuto("Nissan", "Note", "Azul", 2026, "Nafta");
        a1.getDatos();
        a1.frenar();
        System.out.println("Tu marca tiene tantos caracteres: " + a1.marca.length());
        System.out.println();

        claseAuto a2 = new claseAuto("Volskwagen", "Gol", "Azul", 2019, "Nafta");
        a2.getDatos();
        a2.acelerar();
        a2.cambiarAnio(2017);
        System.out.println("Año actual: " + a2.anio);
        System.out.println("Tu marca tiene tantos caracteres: " + a2.marca.length());
        System.out.println();

        claseAuto.listaMayores(a1, a2);
    }



}
