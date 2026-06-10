package programacion.ejercicios;
import java.util.*;
import java.security.SecureRandom;

public class articuloDos {

    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private String origen;
    private double peso;

    public articuloDos(String nombre, String descripcion, String origen) {
        this.codigo = setNroCodigo();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = setPrecio();
        this.origen = origen;
        this.peso = setPeso();
    }

    private String setNroCodigo() {
        SecureRandom random = new SecureRandom();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        int longitud = 9;
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return sb.toString();
    }

    public void getDatos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio + " USD");
        System.out.println("Origen: " + origen);
        System.out.println("Peso: " + peso + "kg");
    }

    private double setPrecio() {
        double numero = (Math.random() * 250) + 1;
        return Math.round(numero * 100.0) / 100.0;
    }

    private double setPeso() {
        double pesaje = (Math.random() * 20) + 1;
        return Math.round(pesaje * 100.0) / 100.0;
    }

    public static double pasarAPesos(articuloDos... precios) {
        double precioUYU = 0;
        for (articuloDos p : precios) {
            precioUYU = p.precio * 40;
        }
        return Math.round(precioUYU * 100.0) / 100.0;
    }

    public static double calcularMasIVA(articuloDos... iva) {
        double precioIVA = 0;
        for (articuloDos p : iva) {
            precioIVA = p.precio + (p.precio*23)/100;
        }
        return Math.round(precioIVA * 100.0) / 100.0;
    }


    public static void mostrarSegunOrig(articuloDos... articulos) {
        for (articuloDos p : articulos) {
            double precioEnPesos = pasarAPesos(p);
            if (p.origen.equalsIgnoreCase("Producto de China") && (precioEnPesos > 5000 && precioEnPesos < 9999)) {
                System.out.println("El producto " + p.nombre + " es de China y se encuentra en el rango de precio");
            }
        }
    }

    static void main(String []args) {
        Scanner input = new Scanner(System.in);
        articuloDos p = new articuloDos("Arroz", "Blue Patna", "Producto de China");
        p.getDatos();
        System.out.println("Precio en UYU: " + pasarAPesos(p));
        System.out.println("Precio + IVA: " + calcularMasIVA(p) + " USD");
        mostrarSegunOrig(p);
        System.out.println();

        articuloDos p1 = new articuloDos("Leche", "Parmalat", "Producto de Uruguay");
        p1.getDatos();
        System.out.println("Precio en UYU: " + pasarAPesos(p1));
        System.out.println("Precio + IVA: " + calcularMasIVA(p1) + " USD");
        mostrarSegunOrig(p1);
        System.out.println();

        System.out.println("Ingrese nombre de producto: ");
        String nom = input.nextLine();
        System.out.println("Ingrese marca de producto: ");
        String mar = input.nextLine();
        System.out.println("Ingrese origen de producto: ");
        String ori = input.nextLine();

        articuloDos p2 = new articuloDos(nom, mar, ori);
        p2.getDatos();
        System.out.println("Precio en UYU: " + pasarAPesos(p2));
        System.out.println("Precio + IVA: " + calcularMasIVA(p2) + " USD");
        mostrarSegunOrig(p2);
        System.out.println();

    }
}
