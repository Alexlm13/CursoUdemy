package DeclaracionMetodos.ejercicio2;

import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class MayorMenor {
    private Scanner entrada;
    private int a, b, c;

    public void pedirNumero(){
        entrada=new Scanner(System.in);
        System.out.println("Introduzca los 3 valores necesarios para comparar cual es mayor");
        System.out.print(">>>>> ");
        a=entrada.nextInt();
        System.out.print(">>>>> ");
        b=entrada.nextInt();
        System.out.print(">>>>> ");
        c=entrada.nextInt();

        mayorQue();
        
        int menor=menorQue(a, b, c);
        System.out.println("El número menor es: "+menor);
    }

    public void mayorQue(){
        if (a>b && a>c) {
            System.out.println("El número mayor es: "+a);
        } else {
            if (b>a && b>c) {
                System.out.println("El número mayor es: "+b);
            } else {
                System.out.println("El número mayor es: "+c);
            }
        }
    }

    public int menorQue(int a, int b, int c){
        int menor;
        if(a<b && a<c){
            menor=a;
        } else {
            if (b<c){
                menor=b;
            }else{
                menor=c;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        MayorMenor numeros=new MayorMenor();
        numeros.pedirNumero();
    }
}
