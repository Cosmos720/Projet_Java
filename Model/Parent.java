package Model;

import java.util.*;

/**
 * Le parent qui possède un compte 
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
     * La liste des enfants
     */
    private Vector<Enfant> enfants;

    /**
     * Le salaire du parent
     */
    private int salaire;

    /**
     * Le quotient familial du parent
     */
    private Quotient_familial quotient;


    /**
     * Permet de récupperer le quotient famillial du parent
     * @return le quotient famillial
     */
    public Quotient_familial getQuotient() {
        return quotient;
    }

    /**
     * Renvoie la liste des enfants
     * @return La liste des enfants
     */
    public Vector<Enfant> getEnfants() {
        return enfants;
    }

    /**
     * Permet d'ajouter un enfant à la liste
     * @param e l'enfant à ajouter
     */
    public void addEnfant(Enfant e){
        enfants.add(e);
        newQuotient();
    }

    /**
     * Permet de récupperer le salaire du parent
     * @return le salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * Permet de modifier le salaire du parent
     * @param salaire le nouveau salaire du parent
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
        newQuotient();
    }

    /**
     * Permet de mettre à jour le quotient familial
     */
    public void newQuotient(){
        quotient = new Quotient_familial(this);
    }
}