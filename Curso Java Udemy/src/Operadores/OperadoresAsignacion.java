package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("**** Operadores Asignacion ****");
        //Asignacion =
        int miNumero;
        miNumero=10;

        //Asignacion compuesto
        // +=
        miNumero += 5; // miNumero= miNumero +5;
        System.out.println(miNumero);
        // -=, *=, /= y %=
        miNumero*=2;
        System.out.println(miNumero);

        //Asignacion de variable multiples
        int a=10, b=15, c=20;
        System.out.printf("a=%d, b=%d, c=%d",a,b,c);
    }

}
