package TemasAvanzados;

public interface Traductor {
    // public y abstract
    void traducir();

    //Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}


class Ingles implements Traductor{

    @Override
    public void traducir(){
        System.out.println("Traduzco a Inglés");
    }
}

class Frances implements Traductor{

    @Override
    public void traducir(){
        System.out.println("Traduzco a Francés");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles=new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances=new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}