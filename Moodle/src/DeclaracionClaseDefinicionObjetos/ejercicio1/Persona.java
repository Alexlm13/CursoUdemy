package DeclaracionClaseDefinicionObjetos.ejercicio1;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;
    }

    public void mostrarDatos(){
        System.out.println();
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("");
    }

    public void mayorEdad(){
        if (this.edad>=18) {
            System.out.println(this.nombre+" es mayor de edad.");
        } else {
            System.out.println(this.nombre+" no es mayor de edad");
        }
    }

}
