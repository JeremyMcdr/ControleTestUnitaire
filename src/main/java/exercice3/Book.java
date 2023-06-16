package exercice3;

/**
 * Cette classe représente la classe Book
 * */
public class Book {
    String titre;
    String auteur;

    // Constructor
    public Book(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    // Getters optionels
    public String getTitre() {
        return this.titre;
    }

    public String getAuthor() {
        return this.auteur;
    }
}
