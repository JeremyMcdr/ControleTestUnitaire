package org.example;

/**
 * Cette classe représente la classe Employé
 * */
public class Employee {
    private String prenom;
    private String nom;
    private int experience;

    // Le niveau contiendra soit : (Junior, Intermédiaire ou Senior)
    private String niveau;

    public Employee(String prenom, String nom, int experience, String niveau) {
        this.prenom = prenom;
        this.nom = nom;
        this.experience = experience;
        this.niveau = niveau;
    }

    // GETTER
    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public int getExperience() {
        return this.experience;
    }

    public String getNiveau() {
        return this.niveau;
    }
}


