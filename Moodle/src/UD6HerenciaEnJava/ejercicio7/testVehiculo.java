package UD6HerenciaEnJava.ejercicio7;

import java.util.*;

public class testVehiculo {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta(15, 100);
        Coche coche = new Coche(150, 300);
        Scanner entrada = new Scanner(System.in);
        int opc;
        do {

            System.out.println("""
                    VEHÍCULOS
                    =========
                    1. Anda con la bicicleta
                    2. Haz el caballito con la bicicleta
                    3. Anda con el coche
                    4. Quema rueda con el coche
                    5. Ver kilometraje de la bicicleta
                    6. Ver kilometraje del coche
                    7. Ver kilometraje total
                    8. Salir

                    Elige una opción (1-8)
                    """);
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    bici.andar();
                    break;
                case 2:
                    bici.caballito();
                    break;
                case 3:
                    coche.andar();
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Los kilómetros recorridos por la bici son " + bici.KMRECORRIDOS + "km");
                    break;
                case 6:
                    System.out.println("Los kilómetros recorridos por el coche son " + coche.KMRECORRIDOS + "km");
                    break;
                case 7:
                    System.out.println("El total de kilómetros recorridos por ambos vehiculos es de "
                            + (bici.KMRECORRIDOS + coche.KMRECORRIDOS) + "km");
                    break;
                case 8:
                    System.out.println("Hasta pronto.");
                    break;

                default:
                    System.out.println("ERROR: Opción no válida");
                    break;
            }
        } while (opc != 8);
    }
}
