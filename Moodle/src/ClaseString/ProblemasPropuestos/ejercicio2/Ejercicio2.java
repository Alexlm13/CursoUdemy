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

        //Imprimir de forma inversa
        System.out.print("4. Cadena inversa: ");
        for (int i = cadena.length()-1 ; i>=0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();

        //Imprimir cada caracter del string con un guion
        System.out.print("5. Caracteres con guión: ");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
            if (i<cadena.length()-1 && cadena.charAt(i)!=' ' && cadena.charAt(i+1)!=' ') {
                System.out.print("-");
            }
        }
        System.out.println();

        //Imprimir la cantidad de vocales
        int contador=0;
        System.out.print("6. Imprimir vocales: ");
        for (int i = 0; i < cadena.length(); i++) {
            char c= Character.toLowerCase(cadena.charAt(i));
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es de "+contador);

        //Verificar que una cadena se lee igual hacia delante que hacia atras
        System.out.print("7. Cadena palindromo: "); 
        String frase=cadena.toLowerCase();
        frase=frase.replace(" ","");

        boolean esPalindromo=true;
        for (int i = 0, j=frase.length()-1; i < j; i++, j--) {
            if (frase.charAt(i)!=frase.charAt(j)) {
                esPalindromo=false;
                break;
            }
        }
        if (esPalindromo) {
                System.out.println("Es un palíndromo.");
            } else {
                System.out.println("No es un palíndromo.");
            }
    }
}
