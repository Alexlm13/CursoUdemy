package Funciones;

import java.util.Scanner;

public class FuncionPar {
    // Funcion para saber si un numero es par
    static boolean esPar(int num){
        /*if (num%2==0) {
            return true;
        } else {
            return false;
        }*/
        return (num%2==0)?true:false;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Proporciona un valor numérico: ");
        int num=entrada.nextInt();
        System.out.println("El número es par? "+esPar(num));
    }
}
