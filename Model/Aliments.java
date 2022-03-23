package Model;
/**
 * 
 */
public class Aliments {

    /**
     * Default constructor
     */
    public Aliments(String n) {
        nom=n;
    }

    /**
     * Le nom de l'aliment
     */
    private String nom;

    /**
     * Return nom
     */
    public String getNom(){
        return nom;
    }

}