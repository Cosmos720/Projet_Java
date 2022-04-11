package Model;

import java.text.DecimalFormat;

/**
 * Classe Reservation
 */
public class Reservation {

    /**
     * Default constructor
     */
    
    public Reservation(Enfant enfant, String date_reservation, Compte compte, double prix) {
        this.enfant = enfant;
        this.date_reservation = date_reservation;
        this.compte = compte;
        this.prix = prix;
    }

    /**
     * 
     */
    private Enfant enfant;


    /**
     * 
     */
    private String date_reservation;


    /**
     * 
     */
    private Compte compte;

    /**
     * 
     */
    private double prix;



    public Enfant getEnfant() {
        return enfant;
    }

    public void setEnfant(Enfant enfant) {
        this.enfant = enfant;
    }

    public String getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(String date_reservation) {
        this.date_reservation = date_reservation;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public String toString(){
        return "Enfant : " + enfant + " Date : " + date_reservation + " Prix : " + new DecimalFormat(".##").format(prix) + "€" + (enfant.getAllergies()!="Aucun"?" Régime : " + enfant.getAllergies():"");
    }

}