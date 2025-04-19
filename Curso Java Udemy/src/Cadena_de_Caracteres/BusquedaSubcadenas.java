package Cadena_de_Caracteres;

public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOf - Devuelve el indice de la primera aparicion de la subcadena
        String cadena1="Hola Mundo";
        //subcadena de "Hola"
        int indice1=cadena1.indexOf("Hola");
        System.out.println("Indice 1: "+indice1);

        //lasIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        //subcadena de "Mundo"
        int indice2=cadena1.lastIndexOf("Mundo");
        System.out.println("Indice 2: "+indice2);

        //Subcadena no encontrada devuelve -1
        //int indice3=cadena1.indexOf("Java");
        int indice3=cadena1.lastIndexOf("Java");
        System.out.println("Indice 3: "+ indice3);
    }
}
