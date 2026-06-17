package programacion.ejercicios;
class Personaje {
    private String nombre;
    private int salud;
    private int inteligencia;
    private int escudo;

    public Personaje(String nombre, int salud, int  inteligencia, int escudo) {
        this.nombre = nombre;
        this.salud = salud;
        this.inteligencia = inteligencia;
        this.escudo = escudo;

    }

    public void atacar(){
        System.out.println(nombre + " esta atacando.");
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

    public int getInteligencia(){
        return inteligencia;
    }

    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }
    public int getEscudo(){
        return escudo;
    }
    public void setEscudo(int escudo){
        this.escudo = escudo;
    }
}

class Guerrero extends Personaje{
    public Guerrero(String nombre, int salud,  int  inteligencia, int escudo) {
        super(nombre, salud, inteligencia, escudo);
    }

    public void usarEspada(){
        System.out.println(getNombre() + " esta usando una espada");
    }
}

class Mago extends Personaje{
    private int mana;
    public Mago(String nombre, int salud,   int  inteligencia, int escudo, int mana) {
        super(nombre, salud, inteligencia, escudo);
        this.mana = mana;
    }
    public void lanzarHechizo(){
        System.out.println(getNombre() + " esta lanzando un hechizo");
    }
    public int getMana(){
        return mana;
    }
}


public class Videojuego{
public static void main(String[] args) {
    Mago miMago = new Mago("Pablo Shazam", 100, 70, 80, 50);
    miMago.lanzarHechizo();
    System.out.println(miMago.getNombre() + " tiene " + miMago.getMana() + " de mana");

    Guerrero miGuerrero = new Guerrero ("Hercules", 70, 30, 90);
    miGuerrero.usarEspada();
    miGuerrero.atacar();
}
}