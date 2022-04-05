package Model;

import java.util.*;

/**
 *
 */
public class Compte {

    /**
     * Default constructor
     */
    public Compte(int id, String mdp, int solde, Parent user, Vector<Reservation> resa) {
        this.id = id;
        this.mdp = mdp;
        this.solde = solde;
        this.user = user;
        this.resa = resa;
    }


    /**
     *
     */
    private int id;

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

    public int getId() {
        return id;
    }



    public void setId(int id) {
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

    public Parent getuser() {
        return user;
    }

    public Vector<Reservation> getResa() {
        return resa;
    }
    
    public void setResa(Vector<Reservation> resa) {
        this.resa = resa;
    }

    

}