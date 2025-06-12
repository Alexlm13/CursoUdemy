package ejercicio6;

public class Autor {
    //Atributos
    private String nombre, nacionalidad;

    //constructor
    public Autor(){
    }

    //getters
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    
    //setters
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nNacionalidad: "+nacionalidad;
    }
}
