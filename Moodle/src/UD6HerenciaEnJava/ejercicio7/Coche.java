package UD6HerenciaEnJava.ejercicio7;

public class Coche extends Vehiculo{

    public Coche(int KMRECORRIDOS, int KMTOTALES) {
        super(KMRECORRIDOS, KMTOTALES);
        //TODO Auto-generated constructor stub
    }
    
    //METODO andar
    @Override
    public void andar() {
        // TODO Auto-generated method stub
        super.andar();
        System.out.println("El coche está en movimiento.");
    }

    //METODO Quemar rueda
    public void quemarRueda(){
        System.out.println("El coche está quemando rueda");
    }
}
