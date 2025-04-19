package Sentecias_de_Decision;

import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Revisar si un número es positivo ***");

        System.out.println("Deme un número");
        int num=entrada.nextInt();

        if (num>0) {
            System.out.println("Su número es positivo");
        } else if (num<0) {
            System.out.println("Su número es negativo");
        } else{
            System.out.println("Su número es cero");
        }
    }
}
