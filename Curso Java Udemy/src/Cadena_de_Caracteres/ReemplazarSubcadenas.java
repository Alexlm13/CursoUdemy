package Cadena_de_Caracteres;

public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar cadenas
        String cadena="Hola Mundo";
        System.out.println("Cadena original: "+cadena);

        //Reemplazar "Mundo" por "a todos"
        String nuevaCadena=cadena.replace("Mundo", "a todos.");
        System.out.println("Nueva cadena: "+nuevaCadena);

        //Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("Nueva cadena: "+nuevaCadena);
    }
}
