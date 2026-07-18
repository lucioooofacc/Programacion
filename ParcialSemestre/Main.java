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
            System.out.println("3. Salir");
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

                    int accion_war;
                    do {
                        System.out.println("\nQue queres hacer, " + guerrero.getNombre() + "?");
                        System.out.println("1. Atacar");
                        System.out.println("2. Usar espada");
                        System.out.println("3. Gritar desafio");
                        System.out.println("4. Gritar guerra");
                        System.out.println("5. Ver salud");
                        System.out.println("0. Volver al menu principal");
                        System.out.print("Ingrese su opcion aqui: ");
                        accion_war = input.nextInt();
                        input.nextLine();

                        switch (accion_war){
                            case 1: guerrero.atacar(); break;
                            case 2: guerrero.usarEspada(); break;
                            case 3: guerrero.gritarDesafio(); break;
                            case 4: guerrero.gritarGuerra(); break;
                            case 5: System.out.println("Salud de " + guerrero.getNombre() + ": " + guerrero.getSalud()); break;
                            case 0: System.out.println("Volviendo al menu principal..."); break;
                            default: System.out.println("Opcion no valida");
                        }
                    } while (accion_war != 0);
                break;

                case 2:
                    System.out.println("Ingrese el nombre de su mago: ");
                    String wizard_name  = input.nextLine();

                    Mago mago = new Mago (wizard_name, 100, 70, 40);

                    System.out.println("Defina su objeto magico: ");
                    String magic_obj = input.nextLine();
                    System.out.println("Defina el tipo de arma que es su objeto magico: ");
                    String type_obj = input.nextLine();

                    objetoMagico objeto = new objetoMagico(magic_obj, type_obj, 200, 5);
                    System.out.println("Potencia de " + magic_obj + " "+  objeto.getPotencia());

                    int accion_mag;
                    do {
                        System.out.println("\nQue queres hacer, " + mago.getNombre() + "?");
                        System.out.println("1. Atacar");
                        System.out.println("2. Recuperar mana");
                        System.out.println("3. Invocar elemento");
                        System.out.println("4. Usar objeto magico");
                        System.out.println("5. Reparar objeto magico");
                        System.out.println("6. Ver salud");
                        System.out.println("7. Establecer inventario");
                        System.out.println("0. Volver al menu principal");
                        System.out.print("Ingrese su opcion aqui: ");
                        accion_mag = input.nextInt();
                        input.nextLine();

                        switch (accion_mag){
                            case 1: mago.atacar(); break;
                            case 2: mago.recuperarMana(); break;
                            case 3:
                                System.out.print("Que elemento desea invocar? (Fuego, Agua, Tierra...): ");
                                String elemento = input.nextLine();
                                mago.invocarElemento(elemento);
                            break;
                            case 4: mago.usarObjetoMagico(objeto); break;
                            case 5:
                                objeto.reparar();
                                System.out.println(magic_obj + " ha sido reparado");
                            break;
                            case 6: System.out.println("Salud de " + mago.getNombre() + ": " + mago.getSalud()); break;
                            case 7:
                                Inventario inventario_mag = new Inventario(5);
                                for (int i = 0; i < inventario_mag.getCapacidad(); i++) {
                                    System.out.println("Ingrese el item " + (i + 1) + " de " + inventario_mag.getCapacidad() + ": ");
                                    String item = input.nextLine();
                                    inventario_mag.agregarItem(item);
                                }
                                System.out.println("Inventario lleno: " + Arrays.toString(inventario_mag.consultarInventario()));
                                break;
                            case 0: System.out.println("Volviendo al menu principal..."); break;
                            default: System.out.println("Opcion no valida");
                        }


                    } while (accion_mag != 0);

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

