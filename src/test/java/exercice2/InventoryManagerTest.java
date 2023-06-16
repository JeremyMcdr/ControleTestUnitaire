package exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class InventoryManagerTest {
    private InventoryManager inventaireManager;

    @BeforeEach
    public void setup() {
        inventaireManager = new InventoryManager();
    }

    @Test
    public void testStock() {
        inventaireManager.ajouterProduct("Eponge", 100);
        assertEquals(100, inventaireManager.getEtatStock("Eponge"));
    }

    /**
     * Regard des stocks
     * */
    @Test
    public void testStockManque() {
        inventaireManager.ajouterProduct("Huitre", 5);
        assertEquals(5, inventaireManager.getEtatStock("Huitre"));
    }
    /**
     * Regard des stocks
     * */
    @Test
    public void testPasDeStock() {
        assertEquals(0, inventaireManager.getEtatStock("Pied"));
    }

    /**
     * Suppression produit inexistant
     * */
    @Test
    public void testSuppressionProduitInexistant() {
        assertThrows(IllegalArgumentException.class, () -> inventaireManager.retirerProduct("product4", 1));
    }

    /**
    * Suppression plus de produit qu'existant
    * */
    @Test
    public void testSuppressionPlusExistant() {
        inventaireManager.ajouterProduct("Couche", 10);
        assertThrows(IllegalArgumentException.class, () -> inventaireManager.retirerProduct("Couche", 20));
    }

    /**
    * Enlever 80 quand j'en ai 100
    * */

    @Test
    public void testSuppressionOk()
    {
        inventaireManager.ajouterProduct("Bebe", 100);
        assertEquals(20,inventaireManager.retirerProduct("Bebe", 80));
    }
}
