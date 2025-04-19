package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a=3, b=-2, resultado;
        boolean c=true;
        
        //Operador unario +
        resultado= +a;
        System.out.println(resultado);
        
        //Operador unario -
        resultado= -a;
        System.out.println(resultado);
        
        //Operador unario incremento ++ y decremento --
        //Pre-incremento
        a=3;
        resultado= ++a;//Primero se incrementa el valor
        System.out.println(resultado);
        //Post-incremento
        a=3;
        resultado=a++;//Primero se usa el valor y despues se incrementa
        System.out.println("Resultado de a++: "+resultado);
        System.out.println("a se incrementa ahora: "+a);

        //Pre-decremento
        b=-2;
        resultado=--b;//Primero se incrementa y despues se usa el valor
        System.out.println("Resultado de --b: "+resultado);
        //Post-decremento
        b=-2;
        resultado=b--;//Primero se usa el valor y despues de incrementa.
        System.out.println("Resultado de b-- : "+resultado);
        System.out.println("b se incremente ahora: "+b);
    }
}
