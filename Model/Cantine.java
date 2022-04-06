package Model;

import java.util.*;

/**
 * 
 */
public class Cantine {

     
    /**
     * Default constructor
     */
    public Cantine(String nom_cantine, int capacité, Vector<Enfant> enfants, Vector<Compte> comptes) {
            this.nom_cantine = nom_cantine;
            this.capacité = capacité;
            this.enfants = enfants;
            this.comptes = comptes;
        }

    /**
     * 
     */
    private String nom_cantine; 

    /**
     * 
     */
    private int capacité;

    /**
     * 
     */
    private Vector<Enfant> enfants;

    /**
     * 
     */
    private Vector<Compte> comptes;


    public Vector<Compte> getComptes() {
        return comptes;
    }



    public void setComptes(Vector<Compte> comptes) {
        this.comptes = comptes;
    }



    public String getNom_cantine() {
        return nom_cantine;
    }



    public void setNom_cantine(String nom_cantine) {
        this.nom_cantine = nom_cantine;
    }



    public int getCapacité() {
        return capacité;
    }



    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }


    public Vector<Enfant> getEnfants() {
        return enfants;
    }


    public void setEnfants(Vector<Enfant> enfants) {
        this.enfants = enfants;
    }


}
