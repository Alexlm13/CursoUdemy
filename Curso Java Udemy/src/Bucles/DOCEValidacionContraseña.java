package Bucles;

import java.util.Scanner;

public class DOCEValidacionContraseña {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("*** Validación de contraseña ***");

        System.out.println("Ingresa una contraseña de al menos 6 carácteres");
        String contraseña=entrada.nextLine();

        while (contraseña.length()<6) {
            System.out.println("La contraseña es demasiado corta, debe tener al menos 6 carácteres.");
            System.out.println("Ingresa de nuevo la contraseña");
            contraseña=entrada.nextLine();
        }
        System.out.println("La contraseña es válida.");
    }
}
