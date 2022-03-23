package Model;

import java.util.*;

/**
 * 
 */
public class PlatPrincipal {
    
    /**
     * 
     */
    private String nom_plat;

    /**
     * Default constructor
     */
    
    public PlatPrincipal(String nom_plat, String aliments, Set<Aliments> liste_a) {
        this.nom_plat = nom_plat;
        this.aliments = aliments;
        this.liste_a = liste_a;
    }

    /**
     * 
     */
    private String aliments;
    private Set<Aliments> liste_a;
    
    /**
     * 
     */
    public String getNom_plat() {
        return nom_plat;
    }

    public void setNom_plat(String nom_plat) {
        this.nom_plat = nom_plat;
    }

    public String getAliments() {
        return aliments;
    }

    public void setAliments(String aliments) {
        this.aliments = aliments;
    }

    public Set<Aliments> getListe_a() {
        return liste_a;
    }

    public void setListe_a(Set<Aliments> liste_a) {
        this.liste_a = liste_a;
    }

}