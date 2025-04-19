package MatricesArrays;

public class UnoEjemploMatrices {
    public static void main(String[] args) {
        // Definimos una matriz

        int[][] array= new int[2][3];

        // Modificando valores
        array[0][0]=100;
        array[0][1]=200;
        array[0][2]=300;
        array[1][0]=400;
        array[1][1]=500;
        array[1][2]=600;
        
        //accedemos a los valores
        System.out.println("Valor de [0][0]: "+array[0][0]);
    }
}
