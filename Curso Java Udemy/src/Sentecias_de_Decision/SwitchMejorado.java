package Sentecias_de_Decision;

import java.util.Scanner;

public class SwitchMejorado {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Switch Mejorado ***");
        System.out.println("Indique el dia de la semana (1-7): ");
        int dia=entrada.nextInt();
        
        switch(dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día invalido: "+dia);
        };
    }
}
