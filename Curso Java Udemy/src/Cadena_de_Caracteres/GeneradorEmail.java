package Cadena_de_Caracteres;

public class GeneradorEmail {
    public static void main(String[] args) {
        String nombre=" Alejandro López Martínez ";
        String empresa="IES Iliberis";
        String dominio=".com";

        System.out.println("*** Generador de Email ***");
        System.out.print("Nombre usuario: ");
        System.out.println(nombre);

        System.out.print("Nombre usuario normalizado: ");
        System.out.println(nombre.toLowerCase().replace(' ','.'));
        
        System.out.println(" ");
        
        System.out.print("Nombre empresa:   ");
        System.out.println(empresa);
        System.out.println("Extension del dominio: "+dominio);
        System.out.println("Dominio de email normalizado: "+"@"+empresa.toLowerCase().replace(' ', '.')+dominio);
        
        System.out.println(" ");

        System.out.print("Email final generado: ");
        System.out.println(nombre.toLowerCase().replace(' ','.')+"@"+empresa.toLowerCase().replace(' ', '.')+dominio);
    }
}
