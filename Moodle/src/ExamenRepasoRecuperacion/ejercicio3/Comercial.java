package ExamenRepasoRecuperacion.ejercicio3;

public abstract class Comercial extends Vehiculo{
    
    //ATRIBUTOS
    protected int cargaMax;
    protected static int totalComerciales=0;
    protected double volumen;

    //METODO CONSTRUCTOR
    public Comercial(String matricula, String marca, String modelo, long kmRecorridos, int cargaMax, double volumen) {
        super(matricula, marca, modelo, kmRecorridos);
        this.cargaMax=cargaMax;
        this.volumen=volumen;
        totalComerciales++;
    }

    //GETTERS Y SETTERS
    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public static int getTotalComerciales() {
        return totalComerciales;
    }

    public static void setTotalComerciales(int totalComerciales) {
        Comercial.totalComerciales = totalComerciales;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return super.toString()+", Carga Máxima= "+cargaMax+", Volumen"+volumen;
    }
}
