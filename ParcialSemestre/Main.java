package programacion.ParcialSemestre;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        int op;
        do{
            System.out.println("Elija un personaje");
            System.out.println("1. Guerrero");
            System.out.println("2. Mago");
            op = input.nextInt();
            input.nextLine();
            switch (op){
                case 1:
                    System.out.println("Ingrese nombre de guerrero: ");
                    String name_war = input.nextLine();


                    Guerrero guerrero = new Guerrero(name_war, 100, 80, 40);
                    guerrero.usarEspada();
                    guerrero.gritarDesafio();

                    System.out.println("Coloquele nombre a su mascota: ");
                    String pet_name =  input.nextLine();

                    Mascota mascota = new Mascota(pet_name, 100);
                    guerrero.asignarMascota(mascota);
                    mascota.asignarGuerrero(guerrero);
                    mascota.acompaniar();

                    Inventario inventario = new Inventario(5);

                    for (int i = 0; i < inventario.getCapacidad(); i++) {
                        System.out.println("Ingrese el item " + (i + 1) + " de " + inventario.getCapacidad() + ": ");
                        String item = input.nextLine();
                        inventario.agregarItem(item);
                    }

                    System.out.println("Inventario lleno: " + Arrays.toString(inventario.consultarInventario()));
                break;

                case 2:
                    System.out.println("Ingrese el nombre de su mago: ");
                    String wizard_name  = input.nextLine();
                    input.nextLine();

                    Mago mago = new Mago (wizard_name, 100, 70, 40);
                    mago.recuperarMana();

                    System.out.println("Defina su objeto magico: ");
                    String magic_obj = input.nextLine();
                    System.out.println("Defina el tipo de arma que es su objeto magico: ");
                    String type_obj = input.nextLine();

                    ObjetoMagico objeto = new ObjetoMagico(magic_obj, type_obj, 60, 5);
                    mago.usarObjetoMagico(objeto);
                    objeto.usar();
                    System.out.println("Potencia de " + magic_obj + " "+  objeto.getPotencia());

                    Inventario inventario_mag = new Inventario(5);

                    for (int i = 0; i < inventario_mag.getCapacidad(); i++) {
                        System.out.println("Ingrese el item " + (i + 1) + " de " + inventario_mag.getCapacidad() + ": ");
                        String item = input.nextLine();
                        inventario_mag.agregarItem(item);
                    }

                    System.out.println("Inventario lleno: " + Arrays.toString(inventario_mag.consultarInventario()));
                break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 3);
    }
}

