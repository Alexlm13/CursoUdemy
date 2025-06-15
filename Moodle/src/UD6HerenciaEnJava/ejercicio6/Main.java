package UD6HerenciaEnJava.ejercicio6;

public class Main {
    public static void main(String[] args) {
        Alumno a1=new Alumno("Alejandro", "López", null, null, 0);
        Profesor p1= new Profesor("Manolo", "Manolez", null, null, 0);
    
        a1.mostrar();
        System.out.println();
        p1.mostrar();

    }
}
