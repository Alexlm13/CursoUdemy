package DeclaracionClaseDefinicionObjetos.ejercicio1;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1=new Persona("Alejandro", 18);
        Persona p2=new Persona("Guillermo", 15);
        Persona p3=new Persona("José", 33);

        p1.mostrarDatos();
        p1.mayorEdad();

        p2.mostrarDatos();
        p2.mayorEdad();

        p3.mostrarDatos();
        p3.mayorEdad();
    }
}
