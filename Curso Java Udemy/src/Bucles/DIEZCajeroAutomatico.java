package Bucles;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class DIEZCajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Cajero Automático ***");
        int opc;
        double totalCantidad=1000.00;

        do {
            System.out.print("""
                    *** Aplicacion de Cajero Autómatico ***
                    ---------------------------------------
                    Operaciones que puedes realizar

                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir

                    Escoge una opción:\s""");
            opc=entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Su saldo es de: "+totalCantidad);                
                    break;

                case 2:
                    System.out.print("Cuanto desea retirar?: ");
                    int retirar=entrada.nextInt();

                    if (retirar<=totalCantidad) {
                        totalCantidad-=retirar;
                        System.out.println("Su saldo ahora es de: "+totalCantidad);
                    } else {
                        System.out.println("No dispone del saldo suficiente");
                    }
                    break;

                case 3:
                    System.out.print("Cuánto desea ingresar?: ");
                    int ingresar=entrada.nextInt();

                    totalCantidad+=ingresar;
                    System.out.println("Su saldo ahora es de: "+totalCantidad);
                    break;
                    
                case 4:
                    System.out.println("Saliendo del cajero autómatico, hasta pronto!");
                    break;            
        
                default:
                    System.out.println("Opción inválida, seleccione otra.");
                    break;
            }
            
        } while (opc!=4);
    }
}