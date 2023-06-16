package exercice3;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente la classe Library
 * */
public class Library {
    List<Book> livres;

    public Library() {
        this.livres = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.livres.add(book);
    }

    public boolean livreDisponible(Book book) {
        return this.livres.contains(book);
    }

    public void borrowBook(Book livre, User utilisateur) {
        if (this.livreDisponible(livre)) {
            this.livres.remove(livre);
            utilisateur.livreEmprunte(livre);
        } else {
            throw new IllegalArgumentException("Livre indisponible");
        }
    }
}