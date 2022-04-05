package Model;

import java.util.*;

/**
 * 
 */
public class Parent extends Personne {

    /**
     * Default Constructeur
     */
    public Parent(String nom, String prenom, int age, String sexe, Compte compte, Vector<Enfant> enfants, int salaire) {
        super(nom, prenom, age, sexe);
        this.compte = compte;
        this.enfants = enfants;
        this.salaire = salaire;
        this.quotient= new Quotient_familial(this);
        
    }

    /**
     * 
     */
    private Compte compte;

    /**
     * 
     */
    private Vector<Enfant> enfants;

    /**
     * 
     */
    private int salaire;

    /**
     * 
     */
    private Quotient_familial quotient;


    public Quotient_familial getQuotient() {
        return quotient;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Vector<Enfant> getEnfants() {
        return enfants;
    }

    public void addEnfant(Enfant e){
        enfants.add(e);
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

}