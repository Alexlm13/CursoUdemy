package Sentecias_de_Decision;

import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** LA CASA DE LOS ESPEJOS ***");

        System.out.print("Cuántos años tienes? ");
        int edad=entrada.nextInt();
        entrada.nextLine(); //LIMPIAR CACHE
        System.out.print("Tienes miedo a la oscuridad?(true/false) ");
        boolean miedo=Boolean.parseBoolean(entrada.nextLine());


        if (!miedo && edad>=10) {
            System.out.println("Puedes entrar a la casa de los espejos.");
        } else {
            System.out.println("No puedes entrar en la casa de los espejos.");
        }
    }
}
