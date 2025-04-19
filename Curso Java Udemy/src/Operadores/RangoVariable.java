package Operadores;

import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Proporciona un dato entero: ");
        var dato = Integer.parseInt(entrada.nextLine());

        // Revisamos si está dentro de rango 1 - 10
        var dentroRango= dato>= 1 && dato <=10;
        System.out.println("Variable dentro de rango 1 y 10? "+dentroRango);

        // Revisamos la logica inversa, si esta fuera de rango
        var fueraRango= !(dato>= 1 && dato <=10);
        System.out.println("Variable fuera de rango 1 y 10? "+fueraRango);
    }
}
