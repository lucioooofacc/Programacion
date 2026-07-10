package programacion.ParcialSemestre;
class Personaje {
    private String nombre;
    private int salud;
    private int nivel;

    public Personaje(String nombre, int salud, int nivel){
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
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

}
