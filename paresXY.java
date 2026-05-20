package programacion;

public class paresXY {
    public static void main(String[] args) {
        int x = 10;
        int y = 40;
        int contador = 0;

        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 2 == 0)
                    contador++;
            }
            System.out.println(contador);

        }
        else {
            for (int i = y; i <= x; i++) {
                if (i % 2 == 0)
                    contador++;
            }
            System.out.println(contador);
        }
    }
}