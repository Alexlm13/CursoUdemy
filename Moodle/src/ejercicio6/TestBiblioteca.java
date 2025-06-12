package ejercicio6;

public class TestBiblioteca {
    public static void main(String[] args) {
        Biblioteca b1=new Biblioteca(5, 10);
        Autor a1=new Autor();
        Autor a2=new Autor();
        Libro l1=new Libro(a2, "001", "Titulo 1");
        Libro l2=new Libro(a2, "002", "Titulo 2");
        Libro l3=new Libro(a2, "003", "Titulo 3");
        Libro l4=new Libro(a1, "004", "Titulo 4");
        Libro l5=new Libro(a1, "005", "Titulo 5");
        
        a1.setNacionalidad("Español");
        a1.setNombre("Antonio");
        a2.setNacionalidad("Francés");
        a2.setNombre("Antoine");

        b1.añadirAutor(a1);
        b1.añadirAutor(a2);
        b1.añadirLibro(l1);
        b1.añadirLibro(l2);
        b1.añadirLibro(l3);
        b1.añadirLibro(l4);
        b1.añadirLibro(l5);

        b1.mostrarDatos();
    }
}
