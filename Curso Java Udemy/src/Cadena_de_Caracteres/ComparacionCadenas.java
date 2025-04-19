package Cadena_de_Caracteres;

public class ComparacionCadenas {
    public static void main(String[] args) {
        String cadena1="Java";
        String cadena2="Java";
        String cadena3= new String("Java");

        //COMPARACION DE CADENAS == COMPARAN LA REFERENCIA
        System.out.print("La cadena 1 es igual en referencia a la cadena 2: ");
        System.out.println(cadena1==cadena2);

        //Comparamos cadena 1 con cadena 3(referencias)
        System.out.print("Cadena 1 es igual en referencia a cadena 3: ");
        System.out.println(cadena1 == cadena3);

        //Comparar contenido usaremos metodo equals
        System.out.print("Cadena 1 es igual en contenido a cadena 3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
