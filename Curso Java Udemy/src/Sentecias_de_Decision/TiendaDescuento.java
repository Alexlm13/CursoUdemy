package Sentecias_de_Decision;

import java.util.Scanner;

public class TiendaDescuento {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Tienda Descuento ***");

        System.out.print("Cuánto ha gastado en su compra? ");
        double compra=entrada.nextDouble();

        entrada.nextLine(); //LIMPIAR CACHE

        System.out.print("Es usted miembro?(true/false) ");
        boolean miembro=Boolean.parseBoolean(entrada.nextLine());

        final var COMPRA_DESCUENTO=1000.00;
        double descuento=0.0;

        if (compra>=COMPRA_DESCUENTO && miembro) {
           descuento=0.1;
           
        } else if (miembro) {
            descuento=0.05;

        } else{
            descuento=0;
        }

        if (descuento!=0) {
            double valorDescuento=compra*descuento;
            double valorFinal=compra-valorDescuento;
            System.out.printf("""
                    %nTienes un descuento del %.0f%%
                    Su compra es de: %.2f euros
                    Su descuento: %.2f euros
                    Su importe a pagar: %.2f euros%n
                    """,descuento*100, compra, valorDescuento, valorFinal);
        } else {
            System.out.println("No tienes descuento, hazte miembro.");
        }
    }
}
