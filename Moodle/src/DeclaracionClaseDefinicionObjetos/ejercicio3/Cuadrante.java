package DeclaracionClaseDefinicionObjetos.ejercicio3;

import java.util.*;

public class Cuadrante {
    private Scanner entrada;
    double y, x;

    public void llamada(){
        entrada=new Scanner(System.in);
        System.out.println();
        System.out.print("Introduzca el valor de x: >>> ");
        x=entrada.nextDouble();
        System.out.println();
        System.out.print("Introduzca el valor de y: >>> ");
        y=entrada.nextDouble();
    }

    public void cuadrar(){
        if (x>0 && y>0) {
            System.out.println("Su punto está en el primer cuadrante");
        } else{
            if (x<0 && y>0) {
                System.out.println("Su punto está en el segundo cuadrante");
            }else{
                if (x>0 && y<0) {
                    System.out.println("Su punto está en el tercer cuadrante");
                } else{
                    if (x<0 && y<0) {
                        System.out.println("Su punto está en el cuarto cuadrante");
                    }else{
                        System.out.println("El punto no se encuentra en ningún cuadrante");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Cuadrante p1=new Cuadrante();
        p1.llamada();
        p1.cuadrar();
    }
}
