package ConstructorClase.ejercicio2;

import java.util.*;

public class Alumno {
    private Scanner entrada;
    private String nombre;
    private int edad;

    public Alumno(){
        entrada=new Scanner(System.in);
        System.out.println("Introduzca su nombre y edad");
        System.out.print(">>>> ");
        nombre=entrada.nextLine();
        System.out.print(">>>> ");
        edad=entrada.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    }

    public static void main(String[] args) {
        Alumno a1=new Alumno();
        a1.mostrarDatos();
        a1.mayorEdad();
    }
}
