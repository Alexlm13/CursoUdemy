package ConstructorClase.ejercicio3;

import java.util.*;

public class TablaMultiplicar {
    private int a, b;

    public TablaMultiplicar(int a, int b){
        this.a=a;
        this.b=b;
    }

    public TablaMultiplicar(int a){
        this.a=a;
        b=10;
    }

    public void mostrar(){
        System.out.println("Tabla de multiplicar del "+a);
        for (int i = 1; i <= b; i++) {
            int resultado=i*a;
            System.out.println(a+"x"+i+" = "+resultado);
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar t1=new TablaMultiplicar(2);
        TablaMultiplicar t2=new TablaMultiplicar(3, 7);

        t1.mostrar();
        System.out.println("");
        t2.mostrar();
    }
}
