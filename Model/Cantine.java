package Model;

import java.util.*;

/**
 * 
 */
public class Cantine {

     
    /**
     * Default constructor
     */
    public Cantine(String nom_cantine) {
            this.nom_cantine = nom_cantine;
            this.enfants = new Vector<Enfant>();
            this.comptes = new Vector<Compte>();
        }

    /**
     * 
     */
    private String nom_cantine; 

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

    public Compte getCompte(String id){
        for(Compte c : comptes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public boolean addComptes(Compte c) {
        return this.comptes.add(c);
    }

    public boolean addEnfants(Enfant e) {
        return this.enfants.add(e);
    }

    public boolean idExist(String id){
        for(Compte c : comptes){
            if(c.getId().equals(id)){
                return true;
            }   
        }
        return false;
    }

}
