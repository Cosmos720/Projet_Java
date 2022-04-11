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
        compte.addResa(this);
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
    private double prix;


    public String toString(){
        return "Enfant : " + enfant + " Date : " + date_reservation + " Prix : " + new DecimalFormat(".##").format(prix) + "€" + (enfant.getRegime()!="Aucun"?" Régime : " + enfant.getRegime():"");
    }

}