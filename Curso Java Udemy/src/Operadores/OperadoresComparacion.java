package Operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparacion ***");
        int a=3, b=2;

        //Igualdad ==
        boolean resultado = a==b;
        System.out.println("Resultado de a==b: "+resultado);
        
        //Distinto !=
        resultado = a!=b;
        System.out.println("Resultado de a != b: "+resultado);

        //Mayor que >
        resultado=a>b;
        System.out.println("a es mayor que b: "+resultado);

        //Mayor o igual >=
        resultado=a>=b;
        System.out.println("a es mayor o igual que b: "+resultado);

        //Menor que <
        resultado=a<b;
        System.out.println("a es menor que b: "+resultado);

        //menor o igual <=
        resultado=a<=b;
        System.out.println("a es menor o igual que b: "+resultado);
    }
}
