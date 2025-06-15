package ExamenRepasoRecuperacion.ejercicio3;

public class Camion extends Comercial {

    //ATRIBUTOS
    private boolean volquete, cerrado;
    private static int totalCamiones=0;
    private int KMLIMITE=2500;
    
    //METODO CONSTRUCTOR
    public Camion(String matricula, String marca, String modelo, long kmRecorridos, int cargaMax, double volumen, boolean volquete, boolean cerrado) {
        super(matricula, marca, modelo, kmRecorridos, cargaMax, volumen);
        this.volquete=volquete;
        this.cerrado=cerrado;
        totalCamiones++;
    }

    //METODO DEVOLVER HEREDADO
    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("Se camión ha sido devuelto");
            alquilado=false;
            kmRecorridos+=1000;
            if (kmRecorridos>KMLIMITE) {
                System.out.println("Su camión superó el límite de km recorridos");
            }
        } else {
            System.out.println("El camión no se puede devolver porque no está alquilado");
        }
    }

    //GETTERS Y SETTERS
    public boolean isVolquete() {
        return volquete;
    }

    public void setVolquete(boolean volquete) {
        this.volquete = volquete;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

    public static void setTotalCamiones(int totalCamiones) {
        Camion.totalCamiones = totalCamiones;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    @Override
    public String toString() {
        return super.toString()+", Volquete= "+volquete+", Cerrado= "+cerrado;
    }
    
}
