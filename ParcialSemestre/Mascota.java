package programacion.ParcialSemestre;
public class Mascota {

    private String nombre;
    private int lealtad;
    private Guerrero guerrero;

    public Mascota(String nombre, int lealtad) {
        this.nombre = nombre;
        this.lealtad = lealtad;
    }

    public int getLealtad() {
        return lealtad;
    }

    public void setLealtad(int lealtad) {
        this.lealtad = lealtad;
    }

    public void asignarGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

    public void acompaniar() {
        System.out.println(nombre + " esta acompañando a " + guerrero.getNombre());
    }
}

