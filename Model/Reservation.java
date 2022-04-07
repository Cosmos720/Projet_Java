package Model;
/**
 * Classe Reservation
 */
public class Reservation {

    /**
     * Default constructor
     */
    
    public Reservation(String nom_associé, String date_reservation, double prix, Compte compte) {
        this.nom_associé = nom_associé;
        this.date_reservation = date_reservation;
        this.prix = prix;
        this.compte = compte;
    }

    /**
     * 
     */
    private String nom_associé;


    /**
     * 
     */
    private String date_reservation;

    /**
     * 
     */
    private double prix;

    /**
     * 
     */
    private Compte compte;


    public String getNom_associé() {
        return nom_associé;
    }

    public void setNom_associé(String nom_associé) {
        this.nom_associé = nom_associé;
    }

    public String getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(String date_reservation) {
        this.date_reservation = date_reservation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public String toString(){
        return nom_associé + " " + date_reservation + " " + prix + "€";
    }

}