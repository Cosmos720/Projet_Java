package Model;

import java.util.*;

/**
 *
 */
public class Compte {

    /**
     * Default constructor
     */
    public Compte(String id, String mdp, int solde, Parent user, Vector<Reservation> resa) {
        this.id = id;
        this.mdp = mdp;
        this.solde = solde;
        this.user = user;
        this.resa = resa;
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
    private int solde;

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



    public void setId(String id) {
        this.id = id;
    }


    public String getMdp() {
        return mdp;
    }


    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


    public int getSolde() {
        return solde;
    }

    public void addSolde(int s){
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
    
    public void setResa(Vector<Reservation> resa) {
        this.resa = resa;
    }

    public void addResa(Reservation r){
        resa.add(r);
    }

    public Vector<Enfant> getEnfants(){
        return user.getEnfants();
    }

}