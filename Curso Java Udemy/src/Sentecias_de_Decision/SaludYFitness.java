package Sentecias_de_Decision;

import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Aplicacion de Salud y Fitness ***");
        final var META_PASOS_DIARIOS=10000;
        final var CALORIAS_POR_PASO=0.04; //Valor aproximado en Kcal

        System.out.print("Por favor, indique cómo se llama: ");
        String nombre=entrada.nextLine();

        System.out.print("Cuántos pasos ha dado hoy? ");
        var pasos=Integer.parseInt(entrada.nextLine());

        var caloriasQuemadas=pasos*CALORIAS_POR_PASO;
        var meta=(pasos>=META_PASOS_DIARIOS)?"Si! :D":"No... ;(";

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorías quemadas: %.2f kcal
                Meta de pasos alcanzada: %s
                ---------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombre, pasos, caloriasQuemadas, meta, META_PASOS_DIARIOS);
    }
}
