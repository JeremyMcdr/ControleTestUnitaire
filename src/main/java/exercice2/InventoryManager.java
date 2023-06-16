package exercice2;

import java.util.HashMap;

/**
 * Cette classe représente la classe Inventaire
 * */
public class InventoryManager {
    private HashMap<String, Integer> inventory;


    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    /**
     * Méthode permettant d'ajouter un produit
     * */
    public void ajouterProduct(String IdProduit, int nombreProduit) {
        this.inventory.put(IdProduit, nombreProduit);
    }

    /**
     * Méthode permettant de supprimer
     *
     * @return
     */
    public Object retirerProduct(String IdProduit, int nombreProduit) {
        if (!this.inventory.containsKey(IdProduit)) {
            throw new IllegalArgumentException("Le produit n'existe pas");
        }

        int quantiteActuelle = this.inventory.get(IdProduit);
        if (nombreProduit > quantiteActuelle) {
            throw new IllegalArgumentException("In n'y a plus de produit");
        }

        int nouveauNombre = quantiteActuelle - nombreProduit;
        this.inventory.put(IdProduit, nouveauNombre);
        return nouveauNombre;
    }
    /**
     * Méthode Get
     * */

    public int getEtatStock(String IdProduit) {
        return this.inventory.getOrDefault(IdProduit, 0);
    }
}
