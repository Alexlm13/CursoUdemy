package ConstructorClase.ejercicio1;

import java.util.*;

public class Operarios {
    Scanner entrada;
    int[] sueldos;

    public Operarios(){
        entrada=new Scanner(System.in);
        sueldos=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el sueldo correspondiente");
            System.out.print(">>>> ");
            sueldos[i]=entrada.nextInt();
        }
    }

    public void mostrar(){
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println(sueldos[i]);
        }
    }

    public static void main(String[] args) {
        Operarios sueldos=new Operarios();
        sueldos.mostrar();
    }
}
