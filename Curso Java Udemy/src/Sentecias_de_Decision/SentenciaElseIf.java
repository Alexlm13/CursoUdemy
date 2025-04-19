package Sentecias_de_Decision;

public class SentenciaElseIf {
    public static void main(String[] args) {
        System.out.println("*** Sentencia Else if ***");
        var edad=14;

        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad <18) {
            System.out.println("Eres adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
