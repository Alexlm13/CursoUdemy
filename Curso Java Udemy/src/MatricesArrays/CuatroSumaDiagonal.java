package MatricesArrays;

import java.util.Scanner;

public class CuatroSumaDiagonal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("Indique cuantas filas quiere: ");
        int filas=entrada.nextInt();
        System.out.print("Indique cuantas columnas quiere: ");
        int columnas=entrada.nextInt();

        int[][] array= new int[filas][columnas];
        int sumaDiagonal=0;

        // Damos valores al array
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor["+i+"]["+j+"]: ");
                array[i][j]=entrada.nextInt();

            }
        }

        // Sumamos en diagonal
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (array[i]==array[j]) {
                    sumaDiagonal+=array[i][j];
                }
            }
        }

        System.out.println("Suma diagonal del array es: "+sumaDiagonal);
    }
}
