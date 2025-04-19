package Operadores;

import java.util.*;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("**** Sistema de Autenticacion ****");

        final var USUARIO="admin";
        final var CONTRASEÑA = "123";

        System.out.print("Cual es tu usuario? ");
        var usuario=entrada.nextLine();

        System.out.print("Cual es tu contraseña? ");
        var contraseña=entrada.nextLine();

        boolean confirmacion = usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA);

        System.out.println("Los datos son correctos? "+confirmacion);
    }
}
