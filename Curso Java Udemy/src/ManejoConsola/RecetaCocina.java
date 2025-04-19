package ManejoConsola;

import java.util.*;

public class RecetaCocina {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("*** Recetas de cocina ***");
        System.out.print("Ingresa el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        String ingredientes=entrada.nextLine();
        System.out.print("Ingresa el tiempo de preparación (min): ");
        int minutos=entrada.nextInt();
        System.out.print("Ingrese la dificultad: ");
        entrada.nextLine();
        String dificultad=entrada.nextLine();

        System.out.println("--- Receta ---");
        System.out.println("\tNombre de la receta: "+nombre);
        System.out.println("\tIngredientes: "+ingredientes);
        System.out.println("\tTiempo de preparación: "+minutos+" minutos");
        System.out.println("\tDificultad: "+dificultad);

    }
}
