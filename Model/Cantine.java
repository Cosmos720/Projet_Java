package Model;

import java.util.*;

/**
 * 
 */
public class Cantine {

     
    /**
     * Default constructor
     */
    public Cantine(String nom_cantine, int capacité) {
            this.nom_cantine = nom_cantine;
            this.capacité = capacité;
            this.enfants = new Vector<Enfant>(this.capacité, 0);
            this.comptes = new Vector<Compte>();
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

    public Compte getCompte(String id){
        for(Compte c : comptes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public Vector<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Vector<Compte> comptes) {
        this.comptes = comptes;
    }

    public boolean addComptes(Compte c) {
        return this.comptes.add(c);
    }



    public Vector<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(Vector<Enfant> enfants) {
        this.enfants = enfants;
    }

    public boolean addEnfants(Enfant e) {
        return this.enfants.add(e);
    }


}
