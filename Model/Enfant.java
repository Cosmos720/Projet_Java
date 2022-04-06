package Model;

import java.util.*;

/**
 * 
 */
public class Enfant extends Personne {

    /**
     * Default constructor
     */    
    public Enfant(String nom, String prenom, int age, String sexe, int horaires_cours, String allergies,
            Set<Parent> parents, Set<Repas> repas, Cantine cantine) {
        super(nom, prenom, age, sexe);
        this.horaires_cours = horaires_cours;
        this.allergies = allergies;
        this.parents = parents;
        this.repas = repas;
        this.cantine = cantine;
    }

    /**
     * 
     */
    private int horaires_cours;

    /**
     * 
     */
    private String allergies;

    /**
     * 
     */
    private Set<Parent> parents;

    /**
     * 
     */
    private Set<Repas> repas;

    /**
     * 
     */
    private Cantine cantine;

    public int getHoraires_cours() {
        return horaires_cours;
    }

    public void setHoraires_cours(int horaires_cours) {
        this.horaires_cours = horaires_cours;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }

    public Set<Repas> getRepas() {
        return repas;
    }

    public void setRepas(Set<Repas> repas) {
        this.repas = repas;
    }

    public Cantine getCantine() {
        return cantine;
    }

    public void setCantine(Cantine cantine) {
        this.cantine = cantine;
    }

}