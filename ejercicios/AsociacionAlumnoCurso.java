package programacion.ejercicios;
class Curso {
    private String nombre;
    private String profesor;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }
}

class Alumno {
    private String nombre;
    private Curso curso; // referencia directa a un Curso

    public Alumno(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public void mostrarInscripcion() {
        System.out.println("El alumno " + nombre +
                " está inscripto en el curso de " + curso.getNombre() +
                ", dictado por " + curso.getProfesor() + ".");
    }
}


public class AsociacionAlumnoCurso {
    public static void main(String[] args) {

        Curso diseño_web = new Curso("Diseño web", "Prof. Fagundez");

        Alumno lucio = new Alumno("Lucio", diseño_web);

        lucio.mostrarInscripcion();
    }
}