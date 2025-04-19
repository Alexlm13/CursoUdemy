package Operadores;

import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*** Sistema de descuentos VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;

        System.out.println("Cuántos productos has comprado hoy? ");
        var cantidadProductos=Integer.parseInt(entrada.nextLine());

        System.out.println("Eres miembro de la tienda? (true/false)");
        var membresia=Boolean.parseBoolean(entrada.nextLine());

        var descuento=cantidadProductos >= NO_PRODUCTOS_DESCUENTO && membresia;

        System.out.println("Tienes acceso al descuento VIP? "+descuento);        
    }
}
