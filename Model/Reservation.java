package Model;

import java.text.DecimalFormat;

/**
 * Classe Reservation
 */
public class Reservation {

    /**
     * Default constructor
     */
    
    public Reservation(Enfant enfant, String date_reservation, Compte compte) {
        this.enfant = enfant;
        this.date_reservation = date_reservation;
        this.compte = compte;
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
        return "Enfant : " + enfant + " Date : " + date_reservation + " Prix : " + new DecimalFormat(".##").format(compte.getuser().getQuotient().getTotal()) + "€" + (enfant.getAllergies()!="Aucun"?" Régime : " + enfant.getAllergies():"");
    }

}