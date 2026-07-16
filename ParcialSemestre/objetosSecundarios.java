package programacion.ParcialSemestre;
import java.util.ArrayList;
import java.util.List;

public class objetosSecundarios {
}

class Mascota{
    private String nombre;
    private int lealtad;
    private Guerrero guerrero;

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

    public void asignarGuerrero(Guerrero guerrero){
        this.guerrero = guerrero;
    }

    public void acompaniar(){
        System.out.println(nombre + " esta acompañando a " + guerrero.getNombre());
    }
}

class Inventario{
    private int capacidad;
    private List<String> items = new ArrayList<>();

    public Inventario (int capacidad){
        this.capacidad = capacidad;
    }

    public void agregarItem(String item){
        if (items.size() < capacidad){
            items.add(item);
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public String[] consultarInventario(){
        return items.toArray(new String[0]);
    }

    public int  getCapacidad(){
        return capacidad;
    }
}

class ObjetoMagico{
    private String nombre;
    private String tipo;
    private int potencia;
    private int durabilidad;
    private int durabilidadMaxima;

    public ObjetoMagico(String nombre, String tipo, int potencia, int durabilidad){
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
}