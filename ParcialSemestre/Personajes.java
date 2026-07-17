package programacion.ParcialSemestre;
import java.util.ArrayList;
import java.util.List;

class Personaje {
    private String nombre;
    private int salud;
    private int nivel;
    private Inventario inventario;

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
    public Inventario getInventario(){
        return inventario;
    }
    public void setInventario(Inventario inventario){
        this.inventario = inventario;
    }
}

class Guerrero extends Personaje {
    private int fuerza;
    private int defensa;
    private Mascota mascota;
    public Guerrero(String nombre, int salud, int fuerza, int defensa){
        super(nombre, salud);
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public void usarEspada(){
        System.out.println(getNombre() + " ha hecho " + (fuerza + getNivel()) + " de daño");
    }
    public void gritarDesafio(){
        System.out.println(getNombre() + " esta gritando desafio! Su defensa aumenta a " + (defensa + 1));
    }
    public void gritarGuerra(){
        System.out.println(getNombre() + " esta gritando guerra, su fuerza esta a " +  (fuerza + 3));
    }
    public void asignarMascota(Mascota mascota){
        this.mascota = mascota;
    }
}

class Mago extends Personaje {
    private int mana;
    private int inteligencia;
    private List<ObjetoMagico> objetos = new ArrayList<>();
    private List<String> hechizosConocidos = new ArrayList<>();
public Mago(String nombre, int salud, int mana, int inteligencia){
      super(nombre, salud);
         this.mana = mana;
         this.inteligencia = inteligencia;
}

    public void recuperarMana(){
        System.out.println(getNombre() + " esta recuperando mana");
    }

    public void usarObjetoMagico(ObjetoMagico objeto){
        objeto.usar();
    }

    public void aprenderHechizo(String hechizo) {
        hechizosConocidos.add(hechizo);
    }

    public void lanzarHechizos(String hechizo){
    if (!hechizosConocidos.contains(hechizo)){
        System.out.println(getNombre() + " no conoce el hechizo " + hechizo);
    } else if (mana < 10){
        System.out.println(getNombre() + " no tiene mana suficiente");
    } else{
        mana -= 10;
        System.out.println(getNombre() + " lanza " + hechizo + " (mana restante: " + mana + ")");
    }
    }

    public void invocarElemento(String elemento){
    if (mana < 20){
        System.out.println(getNombre() + " no tiene mana suficiente para invocar");
    } else {
        mana -= 20;
        System.out.println(getNombre() + " invoca al elemental de " + elemento);
    }
    }

}