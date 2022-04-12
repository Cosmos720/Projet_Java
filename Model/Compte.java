package Model;

import java.util.*;

/**
 *
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
     *
     */
    private String id;

    /**
     *
     */
    private String mdp;

    /**
     *
     */
    private double solde;

    /**
     *
     */
    private Parent user;

    /**
     *
     */
    private Vector<Reservation> resa;

    public String getId() {
        return id;
    }

    public String getMdp() {
        return mdp;
    }

    public double getSolde() {
        return solde;
    }

    public void addSolde(double s){
        solde += s;
    }

    public Parent getuser() {
        return user;
    }

    public void setParent(Parent p){
        this.user = p;
    }

    public Vector<Reservation> getResa() {
        return resa;
    }

    public void addResa(Reservation r){
        resa.add(r);
    }

    public boolean isRes(Enfant e, ArrayList<String> dates){
        for(Reservation r:resa){
            if(r.equals(e, dates)){
                return true;
            }
        }
        return false;
    }

    public Vector<Enfant> getEnfants(){
        return user.getEnfants();
    }

    public void debiter(double prix){
        solde -= prix;
    }
}