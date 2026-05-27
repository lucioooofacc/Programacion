package programacion.ejercicios;
import java.security.SecureRandom;

public class Articulo {
    private String codigo;
    private String nombre;
    private String origen;
    private int precio;
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
        System.out.println("Precio: " + "$" + precio);
        System.out.println("Descripcion: " + descripcion);
    }

    public int setPrecio() {
            int numero = (int)(Math.random() * 200) + 1;
        return(numero);
    }

//    public void calcularDesc(Articulo...) {
//        boolean descuento = Articulo.p.descripcion.equals("Producto de China");
//        System.out.println("Tienes un 10% de descuento! Precio final de: " + (precio - precio*0.10));
//    }

public static void calcularDesc(Articulo... articulos) {
    for (Articulo p : articulos) {
        if (p.descripcion.equals("Producto de China")) {
            double precioFinal = p.precio - p.precio * 0.10;
            System.out.println(p.nombre + " tiene/n 10% de descuento. Precio final: $" + precioFinal);
        } else {
            System.out.println(p.nombre + " no tiene/n descuento.");
        }
    }
}

    public static void main(String[] args) {

        Articulo p = new Articulo("Arroz", "Blue Patna", "Producto de Uruguay");
        p.getDatos();
        calcularDesc(p);
        System.out.println();

        Articulo p1 = new Articulo("Fideos Ramen", "Nisin", "Producto de China");
        p1.getDatos();
        calcularDesc(p1);
        System.out.println();

        Articulo p2 = new Articulo("Alfajor","Portezuelo", "Producto de Uruguay" );
        p2.getDatos();
        calcularDesc(p2);
    }
}
