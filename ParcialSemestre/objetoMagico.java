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
        durabilidad = durabilidadMaxima;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}

