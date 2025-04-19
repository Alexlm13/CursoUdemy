package Cadena_de_Caracteres;

public class MetodosDeCadenas{
    public static void main(String[] args) {
        String cadena1="Hola Mundo";

        //obtener el largo de una cadena
        int longitud = cadena1.length();
        System.out.println("Longitud= "+longitud);

        //reemplazar caracteres
        String nuevaCadena=cadena1.replace('o', 'a');
        System.out.println("Nueva cadena = "+nuevaCadena);

        //Convertir a mayusculas
        String mayusculas=cadena1.toUpperCase();
        System.out.println("Mayusculas = "+mayusculas);

        //Convertir a minusculas
        System.out.println("Minusculas = "+cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        String cadena2=" Alejandro López  ";
        System.out.println("Cadena 2 con espacios = "+cadena2);
        System.out.println("Cadena 2 sin espacios = "+ cadena2.trim());
    }
}