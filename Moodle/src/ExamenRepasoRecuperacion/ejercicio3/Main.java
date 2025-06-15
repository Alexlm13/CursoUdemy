package ExamenRepasoRecuperacion.ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //CREAMOS EL ARRAYLIST
        ArrayList <Vehiculo> lista=new ArrayList<>();

        //CREAMOS LOS OBJETOS TURISMO, FURGO Y CAMION
        Turismo t1=new Turismo("8784 ASS", "Renault", "Megane", 100, 5, 5, "Verde");
        Turismo t2=new Turismo("9412 LAS", "Seat", "Ateca", 320, 5, 5, "Gris");

        Furgo f1=new Furgo("6512 EAS", "Citröen", "Berlingo", 500, 2000, 5.55, 3, false, true);
        Furgo f2=new Furgo("6811 FAS", "Citröen", "Berlingo", 820, 600, 45.5, 7, true, false);

        Camion c1=new Camion("5451 GHS", "Opel", "Blitz", 1000, 7000, 56.7, true, true);
        Camion c2=new Camion("9988 MGS", "Opel", "Blizt", 2020,444, 70.2, false, false);

        //AÑADIMOS LOS OBJETOS AL ARRAYLIST
        lista.add(t1);
        lista.add(t2);
        lista.add(f1);
        lista.add(f2);
        lista.add(c1);
        lista.add(c2);

        //USAMOS LOS METODOS DE ALQUILAR Y DEVOLVER CON CADA UNO DE NUESTROS OBJETOS
        t1.alquilar();
        t1.devolver();
        System.out.println();

        t2.alquilar();
        System.out.println();

        c1.alquilar();
        System.out.println();

        c2.alquilar();
        c2.devolver();
        System.out.println();

        f1.devolver();
        System.out.println();

        f2.alquilar();
        f2.devolver();
        System.out.println();
        
        //COMPROBAMOS ESTADO DE NUESTROS OBJETOS CON EL METODO estaAlquilado
        System.out.println("El estado del turismo 1: "+t1.estaAlquilado());
        System.out.println("El estado del turismo 2: "+t2.estaAlquilado());
        System.out.println("El estado de la furgo 1: "+f1.estaAlquilado());
        System.out.println("El estado de la furgo 2: "+f2.estaAlquilado());
        System.out.println("El estado del camión 1: "+c1.estaAlquilado());
        System.out.println("El estado del camión 2: "+c2.estaAlquilado());
        System.out.println("--------------------------------");

        //TOTALES DE VEHICULOS ETC
        System.out.println("Totales: ");
        System.out.println();
        System.out.println("Total de Vehículos: "+Vehiculo.getTotalVehiculos());
        System.out.println();
        System.out.println("Total Turismos: "+Turismo.getTotalTurismos());
        System.out.println("Total Furgonetas: "+Furgo.getTotalFurgonetas());
        System.out.println("Total Camiones: "+Camion.getTotalCamiones());
    }
}
