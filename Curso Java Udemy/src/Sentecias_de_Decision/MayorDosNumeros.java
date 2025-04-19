package Sentecias_de_Decision;

import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Comparador de números ***");

        System.out.println("Vamos a comprarar 2 números");
        System.out.print("Indique el primer número: " );
        int num1=entrada.nextInt();
        entrada.nextLine();
        System.out.print("Indique el segundo número: ");
        int num2=entrada.nextInt();

        if (num1>num2) {
            System.out.println("El número "+num1+" es mayor que "+num2);
        } else {
            System.out.println("El número "+num1+" es menor que "+num2);
        }
    }
}
