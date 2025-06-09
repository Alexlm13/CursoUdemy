package ClaseString.ProblemasPropuestos.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena;

        System.out.println("Introduzca una cadena: ");
        cadena=entrada.nextLine();

        //Mitad de la cadena (sin bucle)
        int mitad=cadena.length()/2;
        String mitadCadena=cadena.substring(0, mitad);
        System.out.println("1 (Sin bucle). La mitad de la cadena es: "+mitadCadena);
        
        //Mitad de la cadena (con bucle)
        System.out.print("2 (Con bucle). La mitad de la cadena es: ");
        for (int i = 0; i < cadena.length()/2; i++) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();


        //Imprimir el último carácter de la cadena.
        char ultimo=cadena.charAt(cadena.length()-1);
        System.out.println("3. El último carácter de la cadena es: "+ultimo);
    }
}
