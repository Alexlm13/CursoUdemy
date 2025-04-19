package Operadores;

import java.util.*;

public class GeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion Ticket de Venta ***");
        var entrada = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var leche=Double.parseDouble(entrada.nextLine());

        System.out.print("Precio pan: ");
        var pan=Double.parseDouble(entrada.nextLine());

        System.out.print("Precio lechuga: ");
        var lechuga=Double.parseDouble(entrada.nextLine());

        System.out.print("Precio plátanos: ");
        var platanos=Double.parseDouble(entrada.nextLine());

        System.out.println("Aplicar algún descuento (%)?");
        var descuentoPorcentaje=Integer.parseInt(entrada.nextLine());

        //Calculo del subtotal(sin impuestos)
        var subtotal=leche+pan+lechuga+platanos;

        //Aplicamos descuento
        var descuento = subtotal*(descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subtotalDescuento= subtotal-descuento;

        //Calculo con impuestos 21%
        var impuesto = subtotalDescuento*0.21;

        //Calculo total de la compra
        var compra = subtotalDescuento+impuesto;

        //ticket
        System.out.printf("""
                %n-------- TICKET DE VENTA --------
                %n---------------------------------
                Subtotal: Euros %.2f
                Desciento: Euros %.2f (%d%%)
                Impuesto (21%%): Euros %.2f
                Costo total de la compra: Euros %.2f
                """, subtotal,descuento, descuentoPorcentaje, impuesto, compra);
    }
}
