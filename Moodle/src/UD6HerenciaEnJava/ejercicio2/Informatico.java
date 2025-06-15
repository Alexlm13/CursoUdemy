package UD6HerenciaEnJava.ejercicio2;

public class Informatico extends Ingeniero {

    public Informatico(String nif, double altura, int edad){
        super(nif, altura, edad);
    }

    public Informatico(){
        super();
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        super.comer();
    }

    @Override
    public void hablar() {
        // TODO Auto-generated method stub
        super.hablar();
    }

    @Override
    public void razonar() {
        System.out.println("El informático está razonando");
        
    }

    @Override
    public void trabajarEnGrupo() {
        System.out.println("El informático está trabjando en grupo");
        
    }

    public void crearPrograma(){
        System.out.println("Puedo crear un programa");
    }
    
    @Override
    public String toString() {
        return "Informático:\n"+super.toString();
    }
}
