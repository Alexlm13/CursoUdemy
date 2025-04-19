package Operadores;

public class OperadoresLogicos{
    public static void main(String[] args) {
        System.out.println("*** Operador and ***");
        boolean a=true, b=false;
        // and regresa true si ambos valores son true
        boolean resultado=a&&b;
        System.out.println("resultado a&&b: "+resultado);
        resultado=b&&a;
        System.out.println("resultado b&&a: "+resultado);
        resultado=a&&a;
        System.out.println("resultado a&&a: "+resultado);
        resultado=b&&b;
        System.out.println("resultado b&&b: "+resultado);

    }
}