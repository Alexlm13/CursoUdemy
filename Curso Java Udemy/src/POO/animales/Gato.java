package POO.animales;

public class Gato extends Animal{
    
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau");
    }
    @Override
    protected void dormir() {
        System.out.println("Duermo 20h.");
    }
}
