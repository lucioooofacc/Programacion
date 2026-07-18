package programacion.ParcialSemestre;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int capacidad;
    private List<String> items = new ArrayList<>();

    public Inventario (int capacidad){
        this.capacidad = capacidad;
    }

    public void agregarItem(String item){
        if (items.size() < capacidad){
            items.add(item);
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public String[] consultarInventario(){
        return items.toArray(new String[0]);
    }

    public int  getCapacidad(){
        return capacidad;
    }
}

