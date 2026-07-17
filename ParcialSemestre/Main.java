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
            System.out.print("Ingrese su opcion aqui: ");
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
                break;

                case 2:
                    System.out.println("Ingrese el nombre de su mago: ");
                    String wizard_name  = input.nextLine();

                    Mago mago = new Mago (wizard_name, 100, 70, 40);
                    mago.recuperarMana();

                    System.out.println("Defina su objeto magico: ");
                    String magic_obj = input.nextLine();
                    System.out.println("Defina el tipo de arma que es su objeto magico: ");
                    String type_obj = input.nextLine();

                    objetoMagico objeto = new objetoMagico(magic_obj, type_obj, 200, 5);
                    System.out.println("Potencia de " + magic_obj + " "+  objeto.getPotencia());

                    System.out.println("Desea establecer su inventario? (true/false)");
                    boolean answer1 = input.nextBoolean();
                    input.nextLine();

                    if (answer1){
                        Inventario inventario_mag = new Inventario(5);

                        for (int i = 0; i < inventario_mag.getCapacidad(); i++) {
                            System.out.println("Ingrese el item " + (i + 1) + " de " + inventario_mag.getCapacidad() + ": ");
                            String item = input.nextLine();
                            inventario_mag.agregarItem(item);
                        }

                        System.out.println("Inventario lleno: " + Arrays.toString(inventario_mag.consultarInventario()));
                    }

//                    System.out.println("Desea establecer sus hechizos? true/false");
//                    boolean answer_spells = input.nextBoolean();
//
//                            if(answer_spells){
//                                System.out.println("Cuantos hechizos desea saber?: ");
//                                int cant = input.nextInt();
//
//                                for (int i = 0; i < hechizos.length; i++) {
//                                    System.out.println("Ingrese el hechizo numero " + (i + 1) + ":");
//                                    hechizos[i] = input.nextLine();
//                                }
//                            }
//                    System.out.println("Sus opciones son: " + Arrays.toString(hechizos));
                break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 3);
    }
}

