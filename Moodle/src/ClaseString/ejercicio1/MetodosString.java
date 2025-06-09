package ClaseString.ejercicio1;

import java.util.Scanner;

public class MetodosString {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String c1, c2;
        System.out.println("Ingrese una cadena");
        c1=entrada.nextLine();
        System.out.println("Ingrese otra cadena");
        c2=entrada.nextLine();

        //equals
        if (c1.equals(c2)==true) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //equalsIngoreCase
        if (c1.equalsIgnoreCase(c2)==true) {
            System.out.println("Las cadenas son iguales ignorando mayúsculas y minúsculas");
        } else {
            System.out.println("No son iguales ignorando mayúsculas y minúsculas");
        }

        //compareTo
        if (c1.compareTo(c2)==0) {
            System.out.println("Las cadenas son iguales");
        } else {
            if (c1.compareTo(c2)>0) {
                System.out.println(c1+" es mayor que "+c2);
            } else {
                System.out.println(c2+" es mayor que "+c1);
            }
        }

        //charAt
        char carac1=c1.charAt(0);
        System.out.println("El primer caracter de "+c1+" es "+carac1);

        //length
        int largo=c1.length();
        System.out.println("El largo de la cadena "+c1+" es de "+largo+" caracter/es");

        //substring
        String c3=c1.substring(0,3);
        System.out.println("Los primeros 3 caracteres de "+c1+" son "+c3);

        //indexOf
        int pos=c1.indexOf(c2);
        if (pos==-1) {
            System.out.println(c2+" no está contenido en "+c1);
        } else {
            System.out.println(c2+" está contenido en "+c1+" a partir de la posición "+pos);
        }

        //toUpperCase
        System.out.println(c1+" convertido a mayúsculas es "+c1.toUpperCase());
        
        //toLowerCase
        System.out.println(c1+" convertido a minúsculas es "+c1.toLowerCase());
    }
}
