package ManejoConsola;

import java.util.*;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Nombre = "+nombre);
    }
}
