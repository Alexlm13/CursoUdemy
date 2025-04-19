package Cadena_de_Caracteres;

public class InmutabilidadCadenas {
    public static void main(String[] args) {
        String cadena1="Hola";
        System.out.println("Cadena 1 = "+cadena1);
        String cadena2=cadena1;
        cadena1="Adios.";
        System.out.println("Cadena 1 modificada = "+cadena1);
        System.out.println(cadena2+" y "+cadena1);
    }
}
