package ejercicio8;

public class Zona {
    private int entradasPorVender;

    //metodo constructor
    public Zona(int n){
        entradasPorVender=n;
    }

    //getter
    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    /**
     * Vende un numero de entradas
     * Comprueba si quedan entradas libres antes de realizar la venta
     * 
     * @para n numero de entradas a vender
     */
    public void vender(int n){
        if (this.entradasPorVender==0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender<n) {
            System.out.println("Sólo quedan "+this.entradasPorVender+" entradas para esa zona.");
        }

        if (this.entradasPorVender>=n) {
            entradasPorVender-=n;
            System.out.println("Aquí tiene sus "+n+" entradas, gracias.");
        }
    }
}
