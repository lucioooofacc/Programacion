package programacion;

public class Bisiesto {
    public static boolean Bisiesto(int anio){
    return (anio%4==0) && ((anio%100!=0) ||(anio%400==0));
    }
    static void main() {
        int anio=2024;

        if (Bisiesto(anio)){
            System.out.println("Es bisiesto");
        } else{
            System.out.println("No lo es");
        }
    }
}
