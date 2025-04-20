package POO.persona;

public class Persona {
    //Atributos
    private static int contadorPersonas=0;
    private int idPersona;
    private String nombre, apellido;

    // CONSTRUCTOR
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Asignamos el id unico con ayuda de la variable estatica
        this.idPersona=++Persona.contadorPersonas;
    }

    // METODOS GET Y SET

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "ID: "+this.idPersona+
               ", Nombre: "+this.nombre+
               ", Apellido: "+this.apellido+
               ", Dir. Memoria: "+super.toString();
    }

}
