package test;

import domain.Book;

/**
 *
 * @author cleys
 */
public class TestBook {
    public static void main(String[] args) {
        
        Book libro = new Book("223355666", "Corazón de Campeon", "Mr. Valera", 200);
        Book libro2 = new Book("332255666", "Corazón de León", "Mr. Jesus", 300);
        
        Book libroMayor;
        if (libro.getNpaginas()>libro2.getNpaginas()) {
            libroMayor = libro;
        }else{
            libroMayor = libro2;
        }
        
        System.out.println("libroMayor = " + libroMayor + "y es el que tiene más paginas");
    }
}
