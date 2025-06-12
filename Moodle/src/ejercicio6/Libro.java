package ejercicio6;

public class Libro {
    //ATRIBUTOS
    private String codigo, titulo;
    private Autor autor;


    //METODOS
    //Constructor
    public Libro(Autor autor, String codigo, String titulo){
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
    }

    //GETTERS
    public Autor getAutor() {
        return autor;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }

    //SETTERS
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Título: "+titulo+"\nCódigo: "+codigo+"\nAutor: "+autor.getNombre()+"\nNacionalidad: "+autor.getNacionalidad();
    }
}
