package programacion.ejercicios;

import java.security.SecureRandom;

public class Articulo {
    private String codigo;
    private String nombre;
    private String origen;
    private double precio;
    private String descripcion;

    public Articulo(String nombre, String origen, double precio, String descripcion) {
        this.codigo = generarNroSerie();
        this.nombre = nombre;
        this.origen = origen;
        setPrecio(precio);
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

    public void setPrecio(){
    }
}