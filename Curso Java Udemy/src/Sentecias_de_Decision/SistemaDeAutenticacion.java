package Sentecias_de_Decision;

import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("**** Sistema de Autenticación ****");
        
        final var USUARIO="admin";
        final var CONTRASEÑA="123";

        System.out.print("Ingrese su usuario: ");
        String usuario=entrada.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña=entrada.nextLine();

        if (usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA)) {
            System.out.println("Bienvenido al sistema");
        } else if (!usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA)) {
            System.out.println("Usuario inválido.");
        } else if (usuario.equals(USUARIO) && !contraseña.equals(CONTRASEÑA)){
            System.out.println("Contraseña inválida.");
        } else {
            System.out.println("Usuario y contraseña inválidos.");
        }
    }
}
        
