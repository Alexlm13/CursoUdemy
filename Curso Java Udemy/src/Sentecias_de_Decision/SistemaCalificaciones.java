package Sentecias_de_Decision;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Sistema de calificaciones ***");

        System.out.print("Indique su nota de calificación: ");
        int nota = entrada.nextInt();

        if(nota>=0 && nota<6){
            System.out.println("Su calificación es: F");
        } else if (nota>=6 && nota<7){
            System.out.println("Su calificación es: D");
        } else if (nota>=7 && nota<8){
            System.out.println("Su calificación es: C");
        } else if (nota>=8 && nota<9){
            System.out.println("Su calificación es: B");
        } else if (nota>=9 && nota<=10){
            System.out.println("Su calificación es: A");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
