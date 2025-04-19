package Sentecias_de_Decision;

import java.util.Scanner;

public class IdentificaEstacionAño2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Estación del año ***");

        System.out.print("Indique en que mes estamos (1-12): ");
        int mes=entrada.nextInt();

        switch (mes) {
            case 1, 2, 12 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10, 11 -> System.out.println("Otoño");
            default -> System.out.println("Estacion desconocida "+mes);
        }
    }
}