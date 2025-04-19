package ManejoConsola;

public class FormatoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formato de Cadenas ***");
        String nombre="Alejandro";
        int edad= 29;
        double salario=25000.50d;

        // String.format
        String mensaje= String.format("Nombre: %s\nEdad: %d\nSalario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s\nEdad: %d\nSalario: %.2f%n", nombre, edad, salario);


        int numeroEmpleado=23;
        // formateo
        mensaje="""
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNº Empleado: %04d
                \tEdad: %d años
                \tSalario: %.2f Euros/año
                """.formatted(nombre,numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNº Empleado: %04d
                \tEdad: %d años
                \tSalario: %.2f Euros/año
                """, nombre, numeroEmpleado, edad, salario);
    }
}
