package Operadores;

public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador not ***");
        boolean a=false;
        boolean b=true;
        // operador not ! invierte el valor logico
        boolean resultado = !a;
        System.out.println("Resultado de !a: "+resultado);
        resultado = !b;
        System.out.println("Resultado de !b: "+resultado);
    }
}
