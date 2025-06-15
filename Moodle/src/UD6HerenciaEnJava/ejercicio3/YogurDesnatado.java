package UD6HerenciaEnJava.ejercicio3;

public class YogurDesnatado extends Yogur{
    
    private double caloriasDesnatado;

    public YogurDesnatado(){
        super();
    }

    @Override
    public double getCalorias() {
        return super.getCalorias()/2;
    }

    @Override
    public String toString() {
        
        return "Las calorías del yogur desnatado es de: "+getCalorias();
    }
}
