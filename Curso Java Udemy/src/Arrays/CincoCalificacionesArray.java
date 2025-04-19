package Arrays;

import java.util.Scanner;

public class CincoCalificacionesArray {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        // Pedimos el largo del array
        // y creamos el array con el valor que le hemos proporcionado.
        System.out.print("Cuántas calificaciones quieres añadir? ");
        int largo=entrada.nextInt();
        int[] array= new int[largo];

        int suma=0;

        for (int i = 0; i < largo; i++) {
            System.out.print("Calificacion ["+i+"]: ");
            array[i]=entrada.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }

        System.out.println("La media de sus calificaciones es: "+suma/largo);
    }
}
