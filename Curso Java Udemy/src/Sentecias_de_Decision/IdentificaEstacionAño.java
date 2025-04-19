package Sentecias_de_Decision;

import java.util.Scanner;

public class IdentificaEstacionAño {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Estación del año ***");

        System.out.print("Indique en que mes estamos (1-12): ");
        int mes=entrada.nextInt();
        String estacion="";

        if (mes==1 ||  mes==2 ||  mes==12) {
            estacion="Invierno";
            System.out.println("Estamos en: "+estacion);
        } else if (mes==3 || mes==4 || mes==5) {
            estacion="Primavera";
            System.out.println("Estamos en: "+estacion);
        } else if (mes==6 || mes==7 || mes==8) {
            estacion="Verano";
            System.out.println("Estamos en: "+estacion);
        } else if (mes==9 || mes==10 || mes==11) {
            estacion="Otoño";
            System.out.println("Estamos en: "+estacion);
        } else {
            System.out.println("El valor introducido no es correcto.");
        }
    }
}
