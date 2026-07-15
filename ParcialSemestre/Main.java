package programacion.ParcialSemestre;
public class Main {
    public static void main (String []args){
        Guerrero guerrero = new Guerrero("Pablo Shazam", 100, 70, 80);
        guerrero.usarEspada();

        Mascota mascota = new Mascota("Firulais", 100);
        Mascota.acompaniar();


    }
}
