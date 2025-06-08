package DeclaracionMetodos.ejercicio1;

import java.util.*;

public class TablaMultiplicar {
    public void tomarValores(){
        Scanner entrada=new Scanner(System.in);
        int valor;
        do {
            System.out.println("Ingrese un valor");
            System.out.print(">>>> ");
            valor=entrada.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }

    public void calcular(int v){
        for (int i = v; i < v*10; i=i+v) {
            System.out.print(i+"-");
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar t1=new TablaMultiplicar();
        t1.tomarValores();
    }
}