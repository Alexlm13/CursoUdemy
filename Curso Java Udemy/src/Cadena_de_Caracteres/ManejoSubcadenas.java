package Cadena_de_Caracteres;

public class ManejoSubcadenas {
    public static void main(String[] args) {
        //tema subcadenas
        String cadena1="Hola Mundo";

        System.out.println("Cadena original: "+cadena1);

        //subcadena
        String subcadena1 = cadena1.substring(0,4);
        System.out.println("La subcadena es: "+subcadena1);
        String subcadena2 = cadena1.substring(5, 10);
        System.out.println("La subcadena 2 es: "+subcadena2);
    }
}
