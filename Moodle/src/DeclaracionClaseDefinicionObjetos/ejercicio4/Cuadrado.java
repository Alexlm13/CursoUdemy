package DeclaracionClaseDefinicionObjetos.ejercicio4;

import java.util.*;

public class Cuadrado {
    private Scanner entrada;
    int lado;

    public void llamada(){
        entrada=new Scanner(System.in);
        System.out.println("¿Cuánto vale el lado del cuadrado?");
        System.out.print(">>>> ");
        lado=entrada.nextInt();
    }

    public void perimetro(){
        int resultado;
        resultado=lado*4;
        System.out.println("El perímetro del cuadrado es: "+resultado);
    }

    public void superficie(){
        int resultado;
        resultado=lado*lado;
        System.out.println("La superficie del cuadrado es: "+resultado);
    }

    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.llamada();
        cuadrado.perimetro();
        cuadrado.superficie();
    }
}
