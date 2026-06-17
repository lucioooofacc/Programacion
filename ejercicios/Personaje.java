public class Personaje {
    private String nombre;
    private int salud;

    public Personaje(String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;
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
}

public static class Guerrero extends Personaje{
    public Guerrero(String nombre, int salud){
        super(nombre, salud);
    }

    public void usarEspada(){
        System.out.println(getNombre() + " esta usando una espada");
    }
}

public static class Mago extends Personaje{
    public Mago(String nombre, int salud){
        super(nombre, salud);
    }

    public void lanzarHechizo(){
        System.out.println(getNombre() + "esta lenzando un hechizo");
    }
}

public static void main(String[] args) {
    Mago miMago = new Mago("Pablo Shazam", 100);
    miMago.getNombre();
    miMago.lanzarHechizo();

    Guerrero miGuerrero = new Guerrero ("Hercules", 70);
    miGuerrero.getNombre();
    miGuerrero.usarEspada();

}