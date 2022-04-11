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
        compte.setParent(this);
        this.enfants = enfants;
        this.salaire = salaire;
        this.quotient= new Quotient_familial(this);
    }

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

    public Vector<Enfant> getEnfants() {
        return enfants;
    }

    public void addEnfant(Enfant e){
        enfants.add(e);
        newQuotient();
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
        newQuotient();
    }

    public void newQuotient(){
        quotient = new Quotient_familial(this);
    }
}