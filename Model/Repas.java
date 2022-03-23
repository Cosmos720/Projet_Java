package Model;

import java.util.*;

/**
 * 
 */
public class Repas {

    /**
     * Default constructor
     */
    
    public Repas(int tarif_repas, int quantité_repas, String date_repas, Set<Enfant> enfants, Cantine cantine,
            Set<Reservation> resa, Dessert dessert, Entrée entree, PlatPrincipal plat) {
        this.tarif_repas = tarif_repas;
        this.quantité_repas = quantité_repas;
        this.date_repas = date_repas;
        this.enfants = enfants;
        this.cantine = cantine;
        this.resa = resa;
        this.dessert = dessert;
        this.entree = entree;
        this.plat = plat;
    }

    /**
     * 
     */
    private int tarif_repas;

    /**
     * 
     */
    private int quantité_repas;

    /**
     * 
     */
    private String date_repas;

    /**
     * 
     */
    private Set<Enfant> enfants;

    /**
     * 
     */
    private Cantine cantine;


    /**
     * 
     */
    private Set<Reservation> resa;


    /**
     * 
     */
    private Dessert dessert;

    /**
     * 
     */
    private Entrée entree;

    /**
     * 
     */
    private PlatPrincipal plat;

    public int getTarif_repas() {
        return tarif_repas;
    }

    public void setTarif_repas(int tarif_repas) {
        this.tarif_repas = tarif_repas;
    }

    public int getQuantité_repas() {
        return quantité_repas;
    }

    public void setQuantité_repas(int quantité_repas) {
        this.quantité_repas = quantité_repas;
    }

    public String getDate_repas() {
        return date_repas;
    }

    public void setDate_repas(String date_repas) {
        this.date_repas = date_repas;
    }

    public Set<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(Set<Enfant> enfants) {
        this.enfants = enfants;
    }

    public Cantine getCantine() {
        return cantine;
    }

    public void setCantine(Cantine cantine) {
        this.cantine = cantine;
    }

    public Set<Reservation> getResa() {
        return resa;
    }

    public void setResa(Set<Reservation> resa) {
        this.resa = resa;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Entrée getEntree() {
        return entree;
    }

    public void setEntree(Entrée entree) {
        this.entree = entree;
    }

    public PlatPrincipal getPlat() {
        return plat;
    }

    public void setPlat(PlatPrincipal plat) {
        this.plat = plat;
    }


}