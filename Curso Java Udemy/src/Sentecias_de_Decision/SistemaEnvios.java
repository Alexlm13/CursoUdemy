package Sentecias_de_Decision;

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Sistema de envíos ***");
        
        System.out.print("Indíque el peso de su paquete en kg: ");
        double peso=entrada.nextDouble();

        System.out.print("""
                Tipos de envío
                ----------------------
                Elija su destino:
                1) Nacional
                2) Internacional
                """);
        int destino=entrada.nextInt();
        
        switch (destino) {
            case 1:
                System.out.println("Su envío es nacional y costará: "+10*peso+" euros.");
                break;
            case 2:
                System.out.println("Su envío es internacional y costará: "+20*peso+" euros.");
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
        
    }
}
