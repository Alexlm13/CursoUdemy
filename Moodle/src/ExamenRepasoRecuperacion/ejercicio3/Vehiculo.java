package ExamenRepasoRecuperacion.ejercicio3;

public abstract class Vehiculo {
    //ATRIBUTOS
    protected String matricula, marca, modelo;
    protected long kmRecorridos=0;
    protected boolean alquilado=false;
    protected static int totalVehiculos;

    //METODO CONSTRUCTOR 
    public Vehiculo(String matricula, String marca, String modelo, long kmRecorridos) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = kmRecorridos;
        totalVehiculos++;
    }

    //GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public long getKmRecorridos() {
        return kmRecorridos;
    }
    public void setKmRecorridos(long kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    public boolean isAlquilado() {
        return alquilado;
    }
    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    public static int getTotalVehiculos() {
        return totalVehiculos;
    }
    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    //METODO ALQUILAR
    public void alquilar(){
        if (!alquilado) {
            System.out.println("El vehículo se ha alquilado");
            alquilado=true;
        }else{
            System.out.println("Su vehículo no se ha podido alquilar");
        }
    }

    //METODO DEVOLVER
    public abstract void devolver();

    //METODO estaAlquilado
    public boolean estaAlquilado(){
        return alquilado;
    }

    //METODO toString
    @Override
    public String toString() {
        return "[matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kmRecorridos=" + kmRecorridos + "]";
    }

    
}
