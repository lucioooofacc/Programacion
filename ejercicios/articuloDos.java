package programacion.ejercicios;
import com.sun.source.tree.UsesTree;

import java.util.*;
import java.security.SecureRandom;

import static programacion.ejercicios.Articulo.calcularDesc;

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
        System.out.println("Peso: " + peso);
    }

    public double setPrecio() {
        double numero = (double) (Math.random() * 250) + 1;
        return numero;
    }

    public double setPeso() {
        double pesaje = (double) (Math.random() * 20) + 1;
        return pesaje;
    }

    public static double pasarAPesos(articuloDos... precios) {
        double precioUYU = 0;
        for (articuloDos p : precios) {
            precioUYU = p.precio * 40;
        }
        return precioUYU;
    }


    public static void mostrarSegunOrig(articuloDos... articulos) {
        for (articuloDos p : articulos) {
            if (p.descripcion.equalsIgnoreCase("Producto de China") && p.precio*40>=5000 && p.precio*40<=9999 ) {
                System.out.println("Es de china: " + p.nombre + "y esta en el rango de precio");

            }


        }
    }

    static void main(String []args) {
        articuloDos p = new articuloDos("Arroz", "Blue Patna", "Producto de Uruguay");
        p.getDatos();
        System.out.println("Precio en uyu" + pasarAPesos(p));
        System.out.println();

    }
}
