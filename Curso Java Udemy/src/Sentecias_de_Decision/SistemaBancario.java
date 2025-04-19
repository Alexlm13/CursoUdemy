package Sentecias_de_Decision;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Sistema Bancario ***");

        System.out.print("Deseas salir del sistema? (true/false) ");
        boolean salir=Boolean.parseBoolean(entrada.nextLine());

        if (!salir) {
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
