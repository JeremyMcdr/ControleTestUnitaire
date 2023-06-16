package org.example;

/**
 * Cette classe représente la gestion des employé, salaire en fonction du grade
 * */
public class EmployeeManager {

    /**
     * Cette méthode permet de calculer le salaire en fonction de son level
     * */
    public double calculSalaire(Employee employee) {
        double salaireInitial;

        switch (employee.getNiveau()) {
            case "Junior":
                salaireInitial = 20000;
                break;
            case "Intermédiaire":
                salaireInitial = 40000;
                break;
            case "Senior":
                salaireInitial = 60000;
                break;
                // Si aucun on bascule dans l'exception
            default:
                throw new IllegalArgumentException("Niveau inconnue: " + employee.getNiveau());
        }

        return salaireInitial * calculExperience(employee.getExperience());
    }

    /**
     * Cette classe permet de calculer le salaire en fonction du nombre d'année d'ancienneté
     * */
    public double calculExperience(int nbrAnnee) {
        return 1 + nbrAnnee * 0.05;
    }
}

