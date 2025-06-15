package ExamenRepasoRecuperacion.ejercicio1;

public class Punto {
    private double y, x;

    public Punto(double y, double x){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
