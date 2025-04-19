package Bucles;

public class QUINCEBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        //Ejemplo break, imprimir solo el primer numero par
        for(int num = 1; num<10; num++){
            if(num%2==0){
                System.out.print(num + " ");
                break;
            }
        }

        // Ejemplo con continue. Imprimir solo numeros pares, ignorar impares
        System.out.println("\nPalabra continue: ");
        for(int num2=1; num2<10; num2++){
            if (num2%2==1) { //numero impar
                continue; //salta a la siguiente iteracion
            }
            System.out.print(num2+" "); //numeros par
        }
    }
}
