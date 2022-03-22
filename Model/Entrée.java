
import java.util.*;

/**
 * 
 */
public class Entrée {

    /**
     * Default constructor
     */
    
    public Entrée(String nom_entrée, String aliments, Set<Aliments> liste_a) {
        this.nom_entrée = nom_entrée;
        this.aliments = aliments;
        this.liste_a = liste_a;
    }

    /**
     * 
     */
    private String nom_entrée;

    /**
     * 
     */
    private String aliments;




    /**
     * 
     */
    private Set<Aliments> liste_a;




    public String getNom_entrée() {
        return nom_entrée;
    }




    public void setNom_entrée(String nom_entrée) {
        this.nom_entrée = nom_entrée;
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