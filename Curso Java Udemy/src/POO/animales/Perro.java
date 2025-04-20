package POO.animales;

public class Perro extends Animal {


    @Override
    public void hacerSonido(){
        System.out.println("El perro hace: WOOF");
    }

    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas al día.");
        System.out.println("Método clase padre: ");
        super.dormir();
    }
}
