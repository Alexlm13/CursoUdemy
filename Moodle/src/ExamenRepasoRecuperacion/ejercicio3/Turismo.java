package ExamenRepasoRecuperacion.ejercicio3;

public class Turismo extends Vehiculo {
    //ATRIBUTOS
    private String color;
    private int nPlazas, nPuertas, KMLIMITE=1000;
    private static int totalTurismos=0;

    //METODO CONSTRUCTOR
    public Turismo(String matricula, String marca, String modelo, long kmRecorridos, int nPlazas, int nPuertas, String color) {
        super(matricula, marca, modelo, kmRecorridos);
        this.color=color;
        this.nPlazas=nPlazas;
        this.nPuertas=nPuertas;
        this.kmRecorridos=kmRecorridos;
        totalTurismos++;
    }

    //METODO DEVOLVER HEREDADO DE VEHICULO
    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("El turismo ha sido devuelto");
            alquilado=false;
            kmRecorridos+=100;
            if (kmRecorridos>KMLIMITE) {
                System.out.println("Su turismo supero el límite de km recorridos");
            }
        } else {
            System.out.println("El turimos no se puede devolver porque no está alquilado");
        }
    }

    //GETTERS Y SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    public static int getTotalTurismos() {
        return totalTurismos;
    }

    public static void setTotalTurismos(int totalTurismos) {
        Turismo.totalTurismos = totalTurismos;
    }

    //METODO toString HEREDADO DE VEHICULO AÑADIENDO OTROS ATRIBUTOS
    @Override
    public String toString() {
        return super.toString()+", color= "+color+", Número plazas= "+nPlazas+", Número puertas= "+nPuertas;
    }

}
