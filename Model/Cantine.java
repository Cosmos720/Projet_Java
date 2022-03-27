package Model;

import java.util.*;

/**
 * 
 */
public class Cantine {

     
    /**
     * Default constructor
     */
    public Cantine(String nom_cantine, int capacité, int horaire_debut, int horaire_fin, Vector<Enfant> enfants, Vector<Repas> repas) {
            this.nom_cantine = nom_cantine;
            this.capacité = capacité;
            this.horaire_debut = horaire_debut;
            this.horaire_fin = horaire_fin;
            this.enfants = enfants;
            this.repas = repas;
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
    private int horaire_debut;

    /**
     * 
     */
    private int horaire_fin;

    /**
     * 
     */
    private Vector<Enfant> enfants;

    /**
     * 
     */
    private Vector<Repas> repas;



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



    public int getHoraire_debut() {
        return horaire_debut;
    }



    public void setHoraire_debut(int horaire_debut) {
        this.horaire_debut = horaire_debut;
    }



    public int getHoraire_fin() {
        return horaire_fin;
    }



    public void setHoraire_fin(int horaire_fin) {
        this.horaire_fin = horaire_fin;
    }



    public Vector<Enfant> getEnfants() {
        return enfants;
    }



    public void setEnfants(Vector<Enfant> enfants) {
        this.enfants = enfants;
    }



    public Vector<Repas> getRepas() {
        return repas;
    }



    public void setRepas(Vector<Repas> repas) {
        this.repas = repas;
    }


}
