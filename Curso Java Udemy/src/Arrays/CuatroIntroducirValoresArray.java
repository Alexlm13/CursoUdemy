package Arrays;

import java.util.Scanner;

public class CuatroIntroducirValoresArray {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Introducir valores a un Array ***");

        // Pedimos el largo del array
        System.out.print("Cómo de largo quieres el array? ");
        int largo=entrada.nextInt();
        int[] enteros = new int [largo];

        // Añadimos lo valores
        for (int i = 0; i < largo; i++) {
            System.out.print("Dame valores enteros ["+i+"] = ");
            enteros[i]=entrada.nextInt();
            
        }

        // Imprimir los valores;
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }

    }
}
