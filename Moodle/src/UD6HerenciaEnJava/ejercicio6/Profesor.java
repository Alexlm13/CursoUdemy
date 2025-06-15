package UD6HerenciaEnJava.ejercicio6;

import java.util.GregorianCalendar;

public class Profesor extends Persona {

    String especialidad;
    double salario;

    public Profesor(String nombre, String apellidos, GregorianCalendar fechaNacim, String especialidad, double salario) {
        super(nombre, apellidos, fechaNacim);
        // TODO Auto-generated constructor stub
        this.especialidad=especialidad;
        this.salario=salario;
    }

    // Método getEspecialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Método getSalario
    public double getSalario() {
        return salario;
    }

    // Método setSalario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método setEspecialidad
    public void setESpecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método getNombre
    @Override
    public String getNombre() {
        return "Profesor: " + this.nombre;
    }

    public void mostrar() {
        super.mostrar(); // Llamada al método “mostrar” de la superclase
        // A continuación mostramos la información “especializada” de esta subclase
        System.out.printf("Especialidad: %s\n", this.especialidad);
        System.out.printf("Salario: %7.2f euros\n", this.salario);
    }

}
