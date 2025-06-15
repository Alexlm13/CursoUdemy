package UD6HerenciaEnJava.ejercicio3;

public class Yogur {
    private double calorias;

    public Yogur(){
        this.calorias=120.5;
    }

    

    @Override
    public String toString() {
        return "La calorías de un yogur normal es de: "+calorias;
    }



    public double getCalorias() {
        return calorias;
    }



    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
