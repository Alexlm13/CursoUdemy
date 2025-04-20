package TemasAvanzados.excepciones;

public class Aritmetica {
    public static int division(int divisor, int dividendo) {
        if (dividendo==0) {
            throw new RuntimeException("División entre cero");
        }
        return divisor/dividendo;
    }
}
