package Funciones;

public class FuncionRecursiva {
    //Imprimir 1 al 5 de forma recursiva con funcion

    static void recursiva(int num){
        //caso base
        if (num==1) {
            System.out.print(num+" ");
        } else {
            //caso recursivo
            recursiva(num-1);
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        recursiva(10);
    }
}
