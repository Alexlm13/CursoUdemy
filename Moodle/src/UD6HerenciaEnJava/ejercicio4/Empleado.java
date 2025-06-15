package UD6HerenciaEnJava.ejercicio4;

public abstract class Empleado {
    protected String nombre;

    //CONSTRUCTOR POR DEFECTO
    public Empleado(){

    }

    //CONSTRUCTOR CON PARAMETROS
    public Empleado(String nombre){
        this.nombre=nombre;
    }

    //GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado "+nombre;
    }
}
