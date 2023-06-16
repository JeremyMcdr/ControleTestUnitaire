package exercice3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryIntegrationTest {
    @Test
    public void testBorrowBook() {
        Library librairie = new Library();
        Book livre = new Book("Le livre de jungle", "Antoine Cibick");
        User utilisateur = new User("Jacky");

        librairie.addBook(livre);
        librairie.borrowBook(livre, utilisateur);

        assertTrue(utilisateur.hasBorrowedBook(livre));
        assertFalse(librairie.livreDisponible(livre));
    }
}
