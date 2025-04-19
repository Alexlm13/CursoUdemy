package Cadena_de_Caracteres;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        // \n salto de linea
        String cadena1="Hola\nMundo";
        System.out.println("Cadena con salto de linea: "+cadena1);

        //\t tabulador
        cadena1="\tHola\tMundo";
        System.out.println("Cadena con tabulacion: "+cadena1);

        //\' para añadir comilla simple
        cadena1="\'Hola\' Mundo";
        System.out.println("Cadena con comilla simple: "+cadena1);

        // \" para añadir comilla doble
        cadena1="\"Hola\" Mundo";
        System.out.println("Cadena con comillas: "+cadena1);

        // \\ Para añadir barra inversa
        cadena1="\\Hola\\ Mundo";
        System.out.println("Cadena con barra inversa: "+cadena1);
    }
}
