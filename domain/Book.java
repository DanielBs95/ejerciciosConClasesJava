package domain;

/**
 *
 * @author cleys
 */
public class Book {
    private String ISBN;
    private String title;
    private String autor;
    private int npaginas;

    public Book(String ISBN, String title, String autor, int npaginas) {
        this.ISBN = ISBN;
        this.title = title;
        this.autor = autor;
        this.npaginas = npaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    @Override
    public String toString() {
        return "El libro con "+this.ISBN+ " creado por el autor " + this.autor + "tiene " + this.npaginas + " paginas.";
    }
    
    
}
