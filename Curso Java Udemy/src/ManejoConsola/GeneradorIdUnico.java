package ManejoConsola;

import java.util.*;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Random random=new Random();

        System.out.println("Escriba su nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Escriba su apellido: ");
        String apellido=entrada.nextLine();
        System.out.println("Indique su año de nacimiento");
        String año=entrada.nextLine();
        int aleatorio=random.nextInt(9999)+1;
        
        String nombre2=nombre.toUpperCase().substring(0,2);
        String apellido2=apellido.toUpperCase().substring(0,2);
        String año2=año.substring(2,4);
        String idunico=nombre2+apellido2+año2+aleatorio;

        System.out.printf("""
                %nDetalles ID:
                --------------------------
                \tNombre: %s
                \tApellido: %s
                \tAño Nacimiento: %s
                \tNum Aleatorio: %04d
                \tID único: %s
                """, nombre2, apellido2, año2, aleatorio, idunico);
    }
}
