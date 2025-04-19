package Bucles;

import java.util.Scanner;

public class NUEVEMenuIterativo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("*** Menú Iterativo ***");

        int opc;
        do {
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    Menú:
                    ------------------
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir

                    Escoja una opción:\s""");
            opc=entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Creando tu cuenta...");
                    break;
            
                case 2:
                    System.out.println("Eliminando tu cuenta...");
                    break;
                
                case 3:
                    System.out.println("Saliendo... Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción Inválida");
                    break;
            }
            
        } while (opc!=3);
    }
}
