package Funciones;

import java.util.Scanner;

public class FuncionSumar {
    static int sumar(int a, int b){
        int resultado=a+b;
        return resultado;
    }

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       System.out.println("Ingresa dos números.");
       int a=entrada.nextInt(), b=entrada.nextInt();

       int resultado=sumar(a, b);

       System.out.println("La suma de los números dados es: "+resultado);
    }
}
