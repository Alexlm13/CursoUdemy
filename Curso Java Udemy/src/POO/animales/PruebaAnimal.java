package POO.animales;

public class PruebaAnimal {
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase padre(Animal)
        //Animal animal=new Animal();
        //Perro animal=new Perro();
        Gato animal=new Gato();
        imprimirSonido(animal);

        System.out.println("*** Ejemplo de Herencia ***");
        System.out.println("Clase Padre, soy un Animal.");
        Animal animal1=new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido(); Este método no es de la clase padre;

        System.out.println("\nClase Hija, soy un perro");
        Perro perro1=new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

        System.out.println("\nClase Hija, soy un gato");
        Gato gato1=new Gato();
        gato1.comer();
        gato1.dormir();
        gato1.hacerSonido();

    }
}
