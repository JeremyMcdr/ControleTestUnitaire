package exercice3;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe représente la classe User
 * */
public class User {
    String nom;
    List<Book> livreEmprunte;

    public User(String nom) {
        this.nom = nom;
        this.livreEmprunte = new ArrayList<>();
    }

    public void livreEmprunte(Book book) {
        this.livreEmprunte.add(book);
    }


    public boolean hasBorrowedBook(Book book) {
        return this.livreEmprunte.contains(book);
    }
}