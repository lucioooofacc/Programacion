package programacion.ParcialSemestre;

public class objetosSecundarios {
}

 class hechizo{
    private String nombre;
    private int costo;

    public hechizo(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;

    }

     static void main() {
        hechizo hechizos = new hechizo("Bola de fuego", 20);
     }
}