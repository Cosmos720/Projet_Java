package Model;



/**
 * 
 */
public class Reservation {

    /**
     * Default constructor
     */
    
    public Reservation(String nom_associé, String date_reservation, int prix, boolean absence, Compte compte,
            Repas repas) {
        this.nom_associé = nom_associé;
        this.date_reservation = date_reservation;
        this.prix = prix;
        this.absence = absence;
        this.compte = compte;
        this.repas = repas;
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
    private int prix;

    /**
     * 
     */
    private boolean absence;

    /**
     * 
     */
    private Compte compte;

    /**
     * 
     */
    private Repas repas;

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

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public boolean isAbsence() {
        return absence;
    }

    public void setAbsence(boolean absence) {
        this.absence = absence;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Repas getRepas() {
        return repas;
    }

    public void setRepas(Repas repas) {
        this.repas = repas;
    }

}