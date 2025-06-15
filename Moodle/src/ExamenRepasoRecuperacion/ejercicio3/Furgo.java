package ExamenRepasoRecuperacion.ejercicio3;

public class Furgo extends Comercial {

    //ATRIBUTOS
    private int nPlazas, KMLIMITE = 2000;
    private static int totalFurgonetas = 0;
    private boolean baca, puertaLateral;

    //METODO CONSTRUCTOR
    public Furgo(String matricula, String marca, String modelo, long kmRecorridos, int cargaMax, double volumen, int nPlazas, boolean baca, boolean puertaLateral) {
        super(matricula, marca, modelo, kmRecorridos, cargaMax, volumen);
        this.nPlazas=nPlazas;
        this.baca=baca;
        this.puertaLateral=puertaLateral;
        totalFurgonetas++;
    }

    // METODO DEVOLVER HEREDADO
    @Override
    public void devolver() {
        if (alquilado) {
            System.out.println("Su furgoneta ha sido devuelta");
            alquilado=false;
            kmRecorridos+=500;
            if (kmRecorridos>KMLIMITE) {
                System.out.println("Su furgoneta supero el límite de km recorridos");
            }
        } else {
            System.out.println("La furgoneta no se puede devolver porque no está alquilada");
        }
    }


    //GETTERS Y SETTERS
    public int getnPlazas() {
        return nPlazas;
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }

    public int getKMLIMITE() {
        return KMLIMITE;
    }

    public void setKMLIMITE(int kMLIMITE) {
        KMLIMITE = kMLIMITE;
    }

    public static int getTotalFurgonetas() {
        return totalFurgonetas;
    }

    public static void setTotalFurgonetas(int totalFurgonetas) {
        Furgo.totalFurgonetas = totalFurgonetas;
    }

    public boolean isBaca() {
        return baca;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public boolean isPuertaLateral() {
        return puertaLateral;
    }

    public void setPuertaLateral(boolean puertaLateral) {
        this.puertaLateral = puertaLateral;
    }

    @Override
    public String toString() {
        return super.toString()+", Número plazas= "+nPlazas+", baca= "+baca+", Puerta lateral= "+puertaLateral;
    }

}
