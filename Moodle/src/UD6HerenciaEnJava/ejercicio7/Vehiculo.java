package UD6HerenciaEnJava.ejercicio7;

public abstract class Vehiculo {
    protected static int vehiculosCreados=0;
    protected int KMTOTALES;
    protected int KMRECORRIDOS;

    //METODO CONSTRUCTOR
    public Vehiculo(int KMRECORRIDOS, int KMTOTALES){
        this.KMRECORRIDOS=KMRECORRIDOS;
        this.KMTOTALES=KMTOTALES;
        vehiculosCreados++;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public int getKMTOTALES() {
        return KMTOTALES;
    }

    public void setKMTOTALES(int kMTOTALES) {
        KMTOTALES = kMTOTALES;
    }

    public int getKMRECORRIDOS() {
        return KMRECORRIDOS;
    }

    public void setKMRECORRIDOS(int kMRECORRIDOS) {
        KMRECORRIDOS = kMRECORRIDOS;
    }

    //METODO ANDAR
    public void andar(){
    };
}
