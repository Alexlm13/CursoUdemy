package Bucles;

public class OCHOSumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa While ***");

        final var MAXIMO=5;
        int acumuladorSuma=0;

        // Iterar valores.

        int num=1;
        while (num<=MAXIMO) {
            // Imprimir lo que se va a sumar
           //System.out.println("(acumuladorSuma + num) -> "+acumuladorSuma+" + "+num);

            // Realizamos suma
            acumuladorSuma+=num++; // acumuladorSuma = acumuladorSuma + num

            // Imprimir la suma parcial acumulada
            //System.out.println("Suma parcial acumulada: "+acumuladorSuma+"\n");
        }

        System.out.println("La suma de los primeros "+MAXIMO+" números: "+acumuladorSuma);

        //----------------------------------------------------------------------------------

        System.out.println("*** Suma Acumulativa Do While ***");
        int acumuladorSuma2=0;
        int num2=1;
        do {
            acumuladorSuma2+=num2++;
        } while (num2<=MAXIMO);
        System.out.println("La suma de los primeros "+MAXIMO+" números: "+acumuladorSuma2);

        //----------------------------------------------------------------------------------

        System.out.println("*** Suma Acumulativa For ***");

        int acumuladorSuma3=0;
        for(int num3=1; num3<=MAXIMO; num3++){
            acumuladorSuma3+=num3;
        }
        System.out.println("La suma de los primeros "+MAXIMO+" números: "+acumuladorSuma3);
    }
}
