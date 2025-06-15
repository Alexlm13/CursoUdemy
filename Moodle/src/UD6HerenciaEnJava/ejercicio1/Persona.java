package UD6HerenciaEnJava.ejercicio1;

public abstract class Persona {
    //Atributos
    protected String nif;
    protected double altura;
    protected int edad;

    //Metodo Constructor
    public Persona(String nif, double altura, int edad){
        this.altura=altura;
        this.edad=edad;
        this.nif=nif;
    }

    //Metodo Constructor por defecto
    public Persona(){
        this.altura=1.75;
        this.edad=25;
        this.nif="111111111A";
    }

    //GETTERS y SETTERS
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODO COMER
    public abstract void comer();

    //METODO HABLAR
    public abstract void hablar();

    //METODO toString
    @Override
    public String toString() {
        return "Dni: "+nif+"\nAltura: "+altura+"\nEdad: "+edad;
    }
    
}
