package Sentecias_de_Decision;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Reserva de Hotel ***");

        System.out.print("Indique su nombre por favor. ");
        String nombre = entrada.nextLine();

        System.out.print("Cuántos días se hospeda? ");
        int dias = entrada.nextInt();
        entrada.nextLine(); //LIMPIAR CACHE

        System.out.print("Quiere que su habitación tenga vistas al mar? (true/false) ");
        boolean vistas = Boolean.parseBoolean(entrada.nextLine());
        String tieneVistas = (vistas)? "Si ;)":"No... :(";

        double precio=0.0;

        if (vistas==true) {
            precio=190.50*dias;    
        } else {
            precio=150.50*dias;
        }

        System.out.printf("""
                %n------- Detalles de la Reserva -------
                Nombre: %s
                Días de estancia: %d
                Precio total: %.2f euros
                Habitación con vistas al mar: %s
                """,nombre,dias,precio,tieneVistas);
    }
}
