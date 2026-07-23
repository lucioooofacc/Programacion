package programacion.ParcialSemestre;

public class objetoMagico {
    private String nombre;
    private String tipo;
    private int potencia;
    private int durabilidad;
    private int durabilidadMaxima;

    public objetoMagico(String nombre, String tipo, int potencia, int durabilidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.durabilidad = durabilidad;
        this.durabilidadMaxima = durabilidad;
    }

    public void usar(){
        if (durabilidad > 0){
            durabilidad--;
        } else{
            System.out.println(nombre + " esta inutilizable, hay que repararlo");
        }
    }

    public void reparar(){
        if(durabilidad == durabilidadMaxima){
            System.out.println(nombre + " ya esta reparado");
        } else {
            System.out.println(nombre + " ha sido reparado");
            durabilidad = durabilidadMaxima;
        }
        System.out.println("Durabilidad actual: " + durabilidad);
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public String getNombre(){
        return nombre;
    }
}


