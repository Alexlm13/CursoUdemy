package UD6HerenciaEnJava.ejercicio6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNacim;

    public Persona(String nombre, String apellidos, GregorianCalendar fechaNacim) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = new GregorianCalendar();
    }

    // Método getNombre
    public String getNombre() {
        return nombre;
    }

    // Método getApellidos
    public String getApellidos() {
        return apellidos;
    }

    // Método getFechaNacim
    public GregorianCalendar getFechaNacim() {
        return this.fechaNacim;
    }

    // Método setNombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setApellidos
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Método setFechaNacim
    public void setFechaNacim(GregorianCalendar fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public void mostrar() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String Stringfecha = formatoFecha.format(this.fechaNacim.getTime());
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", Stringfecha);
    }
}
