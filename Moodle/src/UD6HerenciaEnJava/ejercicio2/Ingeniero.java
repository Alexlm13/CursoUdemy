package UD6HerenciaEnJava.ejercicio2;

import UD6HerenciaEnJava.ejercicio1.Persona;

public abstract class Ingeniero extends Persona{

    public Ingeniero(String nif, double altura, int edad){
        super(nif, altura, edad);
    }
    
    public Ingeniero(){
        super();
    }

    @Override
    public void comer() {
        System.out.println("El ingeniero está comiendo");
        
    }

    @Override
    public void hablar() {
        System.out.println("El ingeniero está hablando");
        
    }


    public abstract void razonar();

    public abstract void trabajarEnGrupo();
}
