package UD6HerenciaEnJava.ejercicio7;

public class Bicicleta extends Vehiculo{

    public Bicicleta(int KMRECORRIDOS, int KMTOTALES) {
        super(KMRECORRIDOS, KMTOTALES);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void andar() {
        // TODO Auto-generated method stub
        super.andar();
        System.out.println("La bicicleta está en marcha.");
    }
    

    //METODO CABALLITO
    public void caballito(){
        System.out.println("La bicicleta está haciendo un caballito");
    }
}
