package POO.persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos de tipo Persona ***");
        
        System.out.println("Variable estática: "+Persona.getContadorPersonas());

        Persona p1=new Persona("Alex","López");
        System.out.println(p1);//Automaticamente se llama al metodo toString
        System.out.println("Variable estática: "+Persona.getContadorPersonas());
        
        Persona p2=new Persona("Guille", "López");
        System.out.println(p2);
        System.out.println("Variable estática: "+Persona.getContadorPersonas());
    } 
}
