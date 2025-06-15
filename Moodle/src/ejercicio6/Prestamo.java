package ejercicio6;

import java.util.Date;

public class Prestamo {
    private String idCliente;
    private Date fechaPrestamo, fechaDevolucion;
    private int totalPrestamos=0;
    private Libro libro;

    public Prestamo(String idCliente, Libro libro){
        this.idCliente=idCliente;
        this.libro=libro;
        Date fechaPrestamo;
        Date fechaDevolucion;
        totalPrestamos++;
    }
}
