package UD6HerenciaEnJava.ejercicio1;

import UD6HerenciaEnJava.ejercicio2.Informatico;
import UD6HerenciaEnJava.ejercicio2.Ingeniero;

public class TestPersona {
    public static void main(String[] args) {
        Informatico p1=new Informatico("11111111A", 1.75, 25);
        Informatico p2=new Informatico();
       

        System.out.println("Persona por defecto: ");
        System.out.println(p1);
        System.out.println();
        System.out.println("Persona personalizada: ");
        System.out.println(p2);
    }
}
