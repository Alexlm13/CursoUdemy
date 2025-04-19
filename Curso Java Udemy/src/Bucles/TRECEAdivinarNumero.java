package Bucles;

import java.util.Random;
import java.util.Scanner;

public class TRECEAdivinarNumero {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();
        System.out.println("*** Adivina el número ***");
        System.out.println("Escriba un número del 1 al 50");

        int numAleatorio=random.nextInt(50)+1;
        int num=entrada.nextInt();

        while (num!=numAleatorio) {
            System.out.println("Número incorrecto!");
            if (num<numAleatorio) {
                System.out.println("Su número es bajo, pruebe uno más alto.");
                num=entrada.nextInt();
            } else {
                System.out.println("Su número es alto, pruebe con uno más bajo.");
                num=entrada.nextInt();
            }
        }

        System.out.println("""
                Enhorabuena!
                Acertaste el número
                """);
    }
}
