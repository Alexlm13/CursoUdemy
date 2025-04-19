package Bucles;

import java.util.Scanner;

public class ONCEAplicacionCalculadora {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Calculadora ***");

        int opc;
        float num1;
        float num2;
        float resultado;

        do {

            System.out.print("""
                    *** Calculadora en Java ***
                    ---------------------------
                    Opera que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir

                    Escoge una opción:\s""");
            opc=entrada.nextInt();

            switch (opc) {
                case 1:
                    //SUMA DE LOS NUMEROS
                    System.out.println("Indique los números a sumar");
                    System.out.print("Número 1: ");
                    num1=entrada.nextFloat();
                    System.out.print("Número 2: ");
                    num2=entrada.nextFloat();
                    resultado=num1+num2;
                    System.out.println("El resultado es: "+resultado);

                    break;

                case 2:
                    //RESTA DE LOS NUMEROS
                    System.out.println("Indique los números a restar");
                    System.out.print("Número 1: ");
                    num1=entrada.nextFloat();
                    System.out.print("Número 2: ");
                    num2=entrada.nextFloat();
                    resultado=num1-num2;
                    System.out.println("El resultado es: "+resultado);

                    break;
                
                case 3:
                    //MULTIPLICACION DE LOS NUMEROS
                    System.out.println("Indique los números a multiplicar");
                    System.out.print("Número 1: ");
                    num1=entrada.nextFloat();
                    System.out.print("Número 2: ");
                    num2=entrada.nextFloat();
                    resultado=num1*num2;
                    System.out.println("El resultado es: "+resultado);
                    
                    break;
                    
                case 4:
                    //DIVISION DE LOS NUMEROS, EL DIVIDENDO NO PUEDE SER 0
                    System.out.println("Indique los números a dividir");
                    System.out.print("Número 1: ");
                    num1=entrada.nextFloat();
                    System.out.print("Número 2: ");
                    num2=entrada.nextFloat();
                    
                    if (num2==0) {
                        System.out.println("El dividendo no puede ser 0.");
                    }else{
                        resultado=num1/num2;
                        System.out.println("El resultado es: "+resultado);
                    }
                    break;
                    
                case 5:
                    System.out.println("Saliendo de la calculadora... Hasta pronto!");
                    break;

                default:
                    System.out.println("La opción es inválida, pulse otra opción");
                    break;
            }
        } while (opc!=5);

    }
}