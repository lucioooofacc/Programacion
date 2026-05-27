package programacion.ejercicios;
import java.security.SecureRandom;

public class Articulo {
    private String codigo;
    private String nombre;
    private String origen;
    private String precio;
    private String descripcion;

    public Articulo(String nombre, String origen, String descripcion) {
        this.codigo = generarNroSerie();
        this.nombre = nombre;
        this.origen = origen;
        this.precio = setPrecio();
        this.descripcion = descripcion;
    }

    private String generarNroSerie() {
        SecureRandom random = new SecureRandom();
        String caracteres = "123456789";
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
        System.out.println("Origen: " + origen);
        System.out.println("Precio: " + precio);
        System.out.println("Descripcion: " + descripcion);
    }

    public String setPrecio() {
            int numero = (int)(Math.random() * 200) + 1;
        return("$" + numero);
    }


    static void main() {

        Articulo p = new Articulo("Arroz", "BluePatna", "Producto de Uruguay");
        p.getDatos();

        System.out.println();


        Articulo p1 = new Articulo("Fideos Ramen", "Nisin", "Producto de China");
        p1.getDatos();
        boolean descuento = p1.descripcion.equals("China");
        System.out.println(descuento);

        System.out.println();
    }
}
