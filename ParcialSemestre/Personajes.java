package programacion.ParcialSemestre;
import java.util.ArrayList;
class Personaje {
    private String nombre;
    private int salud;
    private int nivel;

    public Personaje(String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = 1;
    }

    public void atacar(){
        System.out.println(nombre + "esta atacando");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getSalud(){
        return salud;
    }
    public void setSalud(int salud){
        this.salud = salud;
    }

    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}

class Guerrero extends Personaje {
    private int fuerza;
    private int defensa;
    public Guerrero(String nombre, int salud, int fuerza, int defensa){
        super(nombre, salud);
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public void usarEspada(){
        System.out.println(getNombre() + "esta usando la espada");
    }
    public void gritarDesafio(){
        System.out.println(getNombre() + "esta gritando desafio");
    }
    public void gritarGuerra(){
        System.out.println(getNombre() + "esta gritando guerra");
    }
}

class Mago extends Personaje {
    private int mana;
    private int inteligencia;
    ArrayList<hechizo> hechizos = new ArrayList<>();
public Mago(String nombre, int salud, int mana, int inteligencia){
      super(nombre, salud);
         this.mana = mana;
         this.inteligencia = inteligencia;
}

    public void recuperarMana(){
        System.out.println(getNombre() + "esta recuperando mana");
    }

    public void lanzarHechizo(String [] hechizos){
    if (hechizos.equals("Bola de fuego")){
    System.out.println(getNombre() + "esta lanzando hechizo");
    }
    }
}
