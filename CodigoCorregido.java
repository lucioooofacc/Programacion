package programacion;

public class CodigoCorregido {
    static void main() {

        int numero = -5; //agrego ";"

        if (numero == 10){ //doble "es igual"
            System.out.println("El numero es 10");
        } else {
            System.out.println("El numero no es 10"); //agrego ";"
        }

        int contador = 0;

        while (contador < 5){ //agrego parentesis
            contador = contador + 1; //cambio por un simbolo de mas, sino queda bucle infinito
        }
        System.out.println("Contador: " + contador); //lo pongo fuera del bucle para que sollo muestre el mensaje una vez

        if (numero > 0){ //agrego llave
            System.out.println("positivo");
    } else { //agrego llave
            System.out.println("negativo");
        }
}
    }
