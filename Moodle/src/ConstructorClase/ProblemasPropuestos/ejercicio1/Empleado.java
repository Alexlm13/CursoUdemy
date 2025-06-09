package ConstructorClase.ProblemasPropuestos.ejercicio1;

import java.util.*;

public class Empleado {
    private Scanner entrada;
    private String nombre;
    private int sueldo;
    
    public Empleado(){
        entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        System.out.print(">>>> ");
        nombre=entrada.nextLine();
        System.out.println("Ingrese su sueldo");
        System.out.print(">>>> ");
        sueldo=entrada.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);
        impuestos();
    }

    public void impuestos(){
        if (sueldo>3000) {
            System.out.println("Usted debe pagar impuestos");
        } else {
            System.out.println("Usted no debe pagar impuestos");
        }
    }

    public static void main(String[] args) {
        Empleado emp1=new Empleado();
        emp1.mostrarDatos();
    }
}
