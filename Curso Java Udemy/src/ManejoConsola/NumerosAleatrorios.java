package ManejoConsola;

import java.util.Random;

public class NumerosAleatrorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();

        //generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero aleatorio entre 0 y 9: "+numeroAleatorio);

        //generar un numero aleatorio entre 1 y 10
        numeroAleatorio=random.nextInt(10)+1;
        System.out.println("Numero aleatorio entre 1 y 10: "+numeroAleatorio);

        //generar numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("Flotante aleatorio: "+flotanteAleatorio);

        //simular el lanzamiento de un dado(1 y 6)
        var dado=random.nextInt(6)+1;
        System.out.println("La cara del dado da: "+dado);
    }
}
