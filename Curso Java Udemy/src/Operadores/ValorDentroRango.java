package Operadores;

import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");
        //definimos los limites
        final int MINIMO=0;
        final int MAXIMO=5;
        //solicitar un valor entre 0 y 5
        System.out.println("Proporciona un dato entre 0 y 5: ");
        int dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //verificar si el dato esta dentro de rango
        boolean estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Esta dentro de rango? "+estaDentroRango);
    }
}
