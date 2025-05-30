package TemasAvanzados;

public class ClaseAbstracta {
    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica=new FiguraGeometrica() {};
        FiguraGeometrica figuraGeometrica=new Rectangulo();
        figuraGeometrica.dibujar();

        figuraGeometrica=new Circulo();
        figuraGeometrica.dibujar();
    }
}

// clase abstracta
abstract class FiguraGeometrica{ //no se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    
    @Override
    public void dibujar(){
        System.out.println("Se debe dibujar un Rectángulo");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se debe dibujar un Círculo");
    }
}
