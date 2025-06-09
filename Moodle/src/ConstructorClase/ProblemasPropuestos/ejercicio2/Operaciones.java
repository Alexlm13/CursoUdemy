package ConstructorClase.ProblemasPropuestos.ejercicio2;

import java.util.*;

public class Operaciones {
    private int n1, n2;

    public Operaciones(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }

    public int suma(){
        int resultado;
        resultado=n1+n2;
        return resultado;
    }
    public int resta(){
        int resultado;
        resultado=n1-n2;
        return resultado;
    }
    public int multi(){
        int resultado;
        resultado=n1*n2;
        return resultado;
    }
    public int division(){
        int resultado;
        resultado=n1/n2;
        return resultado;
    }

    public void mostrarResultados(){
        System.out.println("El resultado de la suma: "+suma());
        System.out.println("El resultado de la resta: "+resta());
        System.out.println("El resultado de la multiplicación: "+multi());
        System.out.println("El resultado de la división: "+division());
    }

    public static void main(String[] args) {
        Operaciones op1=new Operaciones(6, 2);
        op1.mostrarResultados();
    }
}
