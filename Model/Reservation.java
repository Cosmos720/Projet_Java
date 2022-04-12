package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * La reservation d'un repas pour un enfant à partir d'un compte
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
     * L'enfant relié à la réservation
     */
    private Enfant enfant;

    /**
     * La date de la réservation
     */
    private String date_reservation;

    /**
     * Le prix du repas
     */
    private double prix;


    public String toString(){
        return "Enfant : " + enfant + " Date : " + date_reservation + " Prix : " + new DecimalFormat(".##").format(prix) + "€" + (enfant.getRegime()!="Aucun"?" Régime : " + enfant.getRegime():"");
    }

    /**
     * Permet de comparer deux réservations en fonction d'une liste de date et de l'enfant de la réservation
     * @param e L'enfant de la réservation
     * @param dates La liste des dates à vérifier
     * @return Vrai si la réservation existe déjà
     */
    public boolean equals(Enfant e, ArrayList<String> dates){
        for(String date:dates){
            if(e.equals(enfant) && date.equals(date_reservation)){
                return true;
            }
        }
        return false;
    }
}