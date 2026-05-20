package programacion;

public class Comprendido {
    public static boolean numero(int n){
        for (int i=25; i<=180;i++);
        return (n>=25 && n<=180);
    }
    static void main() {
        int n=800;
        if(numero(n)){
            System.out.println(n + " esta entre 25 y 180");
        } else {
            System.out.println(n + " no esta comprendido entre 25 y 180");
        }
    }
}
