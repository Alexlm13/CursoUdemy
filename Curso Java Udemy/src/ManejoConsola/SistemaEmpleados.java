package ManejoConsola;

import java.util.*;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");
        Scanner entrada = new Scanner(System.in);

        //Nombre del empleado
        System.out.println("Nombre del empleado: ");
        String nombreEmpleado = entrada.nextLine();

        //Edad del empleado
        System.out.println("Edad del empleado: ");
        int edadEmpleado = Integer.parseInt(entrada.nextLine());

        //Salario del empleado
        System.out.println("Salario del empleado: ");
        double salarioEmpleado = Double.parseDouble(entrada.nextLine());

        //Jefe de departamento
        System.out.println("Es jefe de departamento? (true/false): ");
        boolean esJedeDepartamento=Boolean.parseBoolean(entrada.nextLine());

        //imprimir la informacion
        System.out.println("Datos del empleado: ");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: "+edadEmpleado+" años");
        //System.out.println("\tSalario: "+salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jede de departamento? "+esJedeDepartamento);
    }
}
