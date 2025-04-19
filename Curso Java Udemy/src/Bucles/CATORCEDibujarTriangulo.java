package Bucles;

import java.util.Scanner;

public class CATORCEDibujarTriangulo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Dibujar un triángulo ***");

        System.out.println("Cuántas filas quieres?");
        int numeroFilas=entrada.nextInt();

        //Iteramos sobre cada fila del triángulo
        for (int i = 1; i <= numeroFilas; i++) {
            String espacios=" ".repeat(numeroFilas-i);
            String asterisco="*".repeat(2*i-1);
            System.out.println(espacios+asterisco);
        }
        
    }
}
