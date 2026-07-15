package programacion.ParcialSemestre;
public class objetosSecundarios {
}

 class Mascota{
    private String nombre;
    private int lealtad;

    public Mascota (String nombre, int lealtad){
        this.nombre = nombre;
        this.lealtad = lealtad;
    }

    public int getLealtad(){
        return lealtad;
    }

    public void setLealtad(int lealtad){
        this.lealtad = lealtad;
    }

    public void acompaniar(){
        System.out.println(nombre + " esta acompañando a " + Personaje.getNombre());
    }
 }

 class Inventario{
    private int[] capacidad;
    public Inventario (int capacidad){
        this.capacidad = new int[]{capacidad};
    }

    public void agregarItem(String item){
        if (capacidad)
    }

    public void consultarInventario(String[]){

    }
 }

 class objetoMagico{
    private String nombre;
    private String tipo;
    private int durabilidad;
    private int potencia;

    public objetoMagico(String nombre, String tipo, int durabilidad, int potencia){
        this.nombre = nombre;
        this.tipo = tipo;
        this.durabilidad = durabilidad;
        this.potencia = potencia;
    }




 }