
import java.util.*;

/**
 *
 */
public class Compte {

    /**
     * Default constructor
     */
    public Compte(int id, String mdp, int solde, Vector<Parent> user, Vector<Reservation> resa) {
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
    private Vector<Parent> user;

    /**
     *
     */
    private Vector<Reservation> resa;

    public int getid() {
        return id;
    }


    public String getmdp() {
        return mdp;
    }

    public int getSolde() {
        return solde;
    }

    public Vector<Parent> getuser() {
        return user;
    }

    public Vector<Reservation> getResa() {
        return resa;
    }
    
    public void setResa(Vector<Reservation> resa) {
        this.resa = resa;
    }

    

}