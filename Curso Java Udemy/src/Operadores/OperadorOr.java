package Operadores;

public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador or ***");
        // or regresa true si cualquiera de los valores es true
        boolean a=true, b=false;
        boolean resultado = a||b;
        System.out.println("El resultado de a||b: "+resultado);
        resultado = b||a;
        System.out.println("El resultado de b||a: "+resultado);
        resultado = a||a;
        System.out.println("El resultado de a||a: "+resultado);
        resultado = b||b;
        System.out.println("El resultado de b||b: "+resultado);
    }
}
