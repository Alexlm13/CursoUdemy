package UD6HerenciaEnJava.ejercicio4;

public class Operario extends Empleado {
    
    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" -> Operario";
    }
}
