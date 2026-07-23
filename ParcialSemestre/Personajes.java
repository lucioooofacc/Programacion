package programacion.ParcialSemestre;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(nombre + " esta atacando");
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
    private int manaMax;
    private int inteligencia;
    private Inventario inventario;
    private List<objetoMagico> objetos = new ArrayList<>();
    String[] hechizos = {"Llama acalambrante", "Llamado de las tinieblas", "Agua ardiente"};
    public Mago(String nombre, int salud, int mana, int inteligencia){
      super(nombre, salud);
         this.mana = mana;
         this.manaMax = mana;
         this.inteligencia = inteligencia;
}
    public int getMana(){
        return mana;
    }

    public void recuperarMana(){
        if (mana == manaMax){
            System.out.println(getNombre() + " tiene la capacidad de mana al mango");
        } else{
        System.out.println(getNombre() + " esta recuperando mana");
        mana = manaMax;
        }
    }

    public void usarObjetoMagico(objetoMagico objeto){
        objeto.usar();
        System.out.println(objeto.getNombre() + " ha sido usado y ha hecho " + (objeto.getPotencia() + getNivel()) + " de daño");
    }


    public void invocarElemento(String elemento){
    if (mana < 20){
        System.out.println(getNombre() + " no tiene mana suficiente para invocar");
    } else {
        mana -= 20;
        System.out.println(getNombre() + " invoca al elemental de " + elemento);
    }
    }

    public Inventario getInventario(){
        return inventario;
    }
    public void setInventario(Inventario inventario){
        this.inventario = inventario;
    }

    public void lanzarHechizo(String[] hechizos, String entrada){
        if (inteligencia < 50){
            System.out.println("No eres lo suficientemente inteligente, " + getNombre());
        } else{
        String hechizoTrimeado = entrada.trim();

        for (int i = 0; i < hechizos.length; i++) {
                 if (hechizos[i].equalsIgnoreCase(hechizoTrimeado) && mana > 40){
                    System.out.println(getNombre() + " esta lanzando " + hechizos[i]);
                    return;
                }
            }
        System.out.println("No sabes ese hechizo, " + getNombre());
        }
    }
}
