package Model;

import java.util.*;

/**
 * Le compte auquel un utilisateur va se connecter
 */
public class Compte {

    /**
     * Default constructor
     */
    public Compte(String id, String mdp, double solde, Parent user) {
        this.id = id;
        this.mdp = mdp;
        this.solde = solde;
        this.user = user;
        this.resa = new Vector<Reservation>();
    }


    /**
     * L'identifiant de connexion au compte
     */
    private String id;

    /**
     * Le mot de passe de connexion au compte
     */
    private String mdp;

    /**
     * L'argent restant sur le compte
     */
    private double solde;

    /**
     * L'utilisateur du compte
     */
    private Parent user;

    /**
     * La liste des réservations effectuées par ce compte
     */
    private Vector<Reservation> resa;

    /**
     * Permet de récupérer l'identifiant du compte
     * @return l'identifiant du compte
     */
    public String getId() {
        return id;
    }

    /**
     * Permet de récupérer le mot de passe du compte
     * @return le mot de passe du compte
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * Permet de récupérer le solde du compte
     * @return le solde du compte
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Permet d'ajouter de l'argent au compte
     * @param s l'argent à ajouter
     */
    public void addSolde(double s){
        solde += s;
    }

    /**
     * Renvoie l'utilisateur du compte
     * @return l'utilisateur du compte
     */
    public Parent getuser() {
        return user;
    }

    /**
     * Permet de définir l'utilisateur du compte
     * @param p L'utilisateur du compte
     */
    public void setParent(Parent p){
        this.user = p;
    }

    /**
     * Renvoie la liste des réservations du compte
     * @return la liste des réservations
     */
    public Vector<Reservation> getResa() {
        return resa;
    }

    /**
     * Permet d'ajouter une réservation à la liste des réservations
     * @param r La réservation à ajouter
     */
    public void addResa(Reservation r){
        resa.add(r);
    }

    /**
     * Permet de savoir si une réservation à déjà été effectuer
     * @param e L'enfant auquel est relié la reservation
     * @param dates La date de la reservation
     * @return  Vrai si la réservation existe déjà
     */
    public boolean isRes(Enfant e, ArrayList<String> dates){
        for(Reservation r:resa){
            if(r.equals(e, dates)){
                return true;
            }
        }
        return false;
    }

    /**
     * Renvoie la liste des enfants relié à ce compte
     * @return la liste des enfants
     */
    public Vector<Enfant> getEnfants(){
        return user.getEnfants();
    }

    /**
     * Permet de retirer de l'argent au solde du compte
     * @param prix l'argent à retirer du solde
     */
    public void debiter(double prix){
        solde -= prix;
    }
}