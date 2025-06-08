package DeclaracionClaseDefinicionObjetos.ProblemasPropuestos.ejercicio1;

import java.util.*;

public class Empleado {
    Scanner entrada;
    private String nombre;
    private int sueldo;

    //METODOS
    
    public void inicializar(){
        entrada=new Scanner(System.in);
        System.out.println("Cómo se llama usted?");
        System.out.print(">>>> ");
        nombre=entrada.nextLine();

        System.out.println("Cuánto cobra usted?");
        System.out.print(">>>> ");
        sueldo=entrada.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);
        impuestos();
    }

    public void impuestos(){
        if (sueldo>3000) {
            System.out.println("Usted debe pagar impuestos.");
        } else {
            System.out.println("Usted no paga impuestos.");
        }
    }

    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.inicializar();
        empleado.imprimir();
    }
}
