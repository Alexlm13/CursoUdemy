package MatricesArrays;

public class DosRecorrerMatriz {
    public static void main(String[] args) {
        /*final var FILAS = 2;
        final var COLUMNAS = 3;

        var array=new int[FILAS][COLUMNAS];

        // Modificando valores
        array[0][0]=100;
        array[0][1]=200;
        array[0][2]=300;
        array[1][0]=400;
        array[1][1]=500;
        array[1][2]=600;

        //Recorriendo una matriz
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println("Valor ["+i+"]["+j+"]: "+array[i][j]);
            }
        }*/

        //SIMPLIFICADO
        var matriz=new int[][]{
            {100,200,300},
            {400,500,600}
        };

        //Recorriendo una matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.println("Valor ["+i+"]["+j+"]: "+matriz[i][j]);
            }
        }
    }
}
