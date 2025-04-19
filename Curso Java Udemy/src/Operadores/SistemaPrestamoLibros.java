package Operadores;

import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Sistema de préstamo de Libros ***");

        final var DISTANCIA_PERMITIDA_KM=3;

        System.out.print("Cuentas con credencial de estudiante? (true/false) ");
        var credencial=Boolean.parseBoolean(entrada.nextLine());

        System.out.println("A cuántos kilometros vives de la biblioteca? ");
        var distancia = Integer.parseInt(entrada.nextLine());

        var prestamo= credencial || distancia <= DISTANCIA_PERMITIDA_KM;

        System.out.println("Tienes derecho a préstamo? "+prestamo);
    }
}
