package ArrayList;
import java.util.*;

public class Listas {
    public static void main(String[] args) {
        List miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        // miLista.add("Domingo");

        for (Object elemento:miLista) {
            System.out.println("Día de la semana: "+elemento);
        }

        
    }
}
