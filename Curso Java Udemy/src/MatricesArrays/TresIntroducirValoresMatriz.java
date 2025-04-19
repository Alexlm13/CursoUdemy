package MatricesArrays;

import java.util.Scanner;

public class TresIntroducirValoresMatriz {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int filas, columnas;
        
        System.out.print("Añade las filas que quieras: ");
        filas=entrada.nextInt();
        System.out.print("Ahora añade las columnas: ");
        columnas=entrada.nextInt();

        var array= new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor["+i+"]["+j+"]: ");
                array[i][j]=entrada.nextInt();
            }
        }

        // Iterar los valores de la matriz.
        for (int i = 0; i < filas; i++) {
            for (int index = 0; index < columnas; index++) {
                System.out.println("Valor["+i+"]["+index+"]: "+array[i][index]);
            }
        }
    }
}
