package DeclaracionClaseDefinicionObjetos.ProblemasPropuestos.ejercicio2;

import java.util.*;

public class Operaciones {
    //ATRIBUTOS
    private Scanner entrada;
    private int num1, num2;

    //METODOS
    public void llamada(){
        entrada=new Scanner(System.in);
        System.out.println("Indica el primer valor: ");
        System.out.print(">>>> ");
        num1=entrada.nextInt();
        System.out.println();
        System.out.println("Indica el segundo valor: ");
        System.out.print(">>>> ");
        num2=entrada.nextInt();
    }

    public int suma(){
        int resultado1;
        resultado1=num1+num2;
        return resultado1;
    }

    public int resta(){
        int resultado2;
        resultado2=num1-num2;
        return resultado2;
    }

    public int multi(){
        int resultado3;
        resultado3=num1*num2;
        return resultado3;
    }

    public int division(){
        int resultado4;
        resultado4=num1/num2;
        return resultado4;  
    }

    public void imprimir(){
        System.out.println("El resultado de la suma es: "+suma());
        System.out.println("El resultado de la resta es: "+resta());
        System.out.println("El resultado de la multiplación es: "+multi());
        System.out.println("El resultado de la división es: "+division());
    }

    public static void main(String[] args) {
        Operaciones op1=new Operaciones();
        op1.llamada();
        op1.imprimir();
    }

}
