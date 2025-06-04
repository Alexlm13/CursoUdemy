package ejercicio7;

public class Pizza {
    private String tipo;
    private String tamaño;
    private String estado;
    static int pedidas=0;
    static int servidas=0;


    //METODOS
    //constructor

    public Pizza(String tipo, String tamaño){
        this.tipo=tipo;
        this.tamaño=tamaño;
        this.estado="Pedida";
        this.pedidas++;
    }

    //set
    public void sirve(){
        if (this.estado.equals("Servida")) {
            System.out.println("Su pizza ya está servida");
        }else{
            this.estado="Servida";
            this.servidas++;
        }
    }

    //getter
    public static int getTotalServidas(){
        return servidas;
    }

    public static int getTotalPedidas() {
        return pedidas;
    }

    @Override
    public String toString() {
        return "Pizza "+this.tipo+" "+this.tamaño+", "+this.estado;
    }
}
