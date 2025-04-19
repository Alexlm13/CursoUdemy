package Operadores;

import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Calculamos el Area y Perimetro de un rectangulo");
        int base, altura;
        System.out.println("Ingrese la base y la altura de un rectangulo ");
        base=entrada.nextInt();
        altura=entrada.nextInt();
        int area= base*altura;
        int perimetro=2*(base+altura);
        System.out.printf("""
                %nArea y Perimetro
                %n-----------------
                Base: %d
                Altura: %d
                Area: %d
                Perimetro %d
                """,base, altura, area, perimetro);
    }
}
