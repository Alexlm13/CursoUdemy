package ejercicio6;

public class Biblioteca {
    private int contAutor = 0, contLibros = 0;
    private Autor[] autores;
    private Libro[] libros;

    public Biblioteca(int maxAutores, int maxLibros) {
        autores = new Autor[maxAutores];
        libros = new Libro[maxLibros];
    }

    public boolean añadirAutor(Autor a) {
        if (contAutor < autores.length) {
            autores[contAutor] = a;
            contAutor++;
            return true;
        } else {
            return false;
        }
    }

    public boolean añadirLibro(Libro a) {
        if (contLibros < libros.length) {
            libros[contLibros] = a;
            contLibros++;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarDatos() {
        System.out.println("Autores: ");
        for (int i = 0; i < contAutor; i++) {
            System.out.println(autores[i].toString());
            System.out.println();
        }
        System.out.println();
        System.out.println("Libros: ");
        for (int i = 0; i < contLibros; i++) {
            System.out.println(libros[i].toString());
            System.out.println();
        }
        System.out.println();
    }
}
