package Model;

/**
 * L'enfant relié aux reservations et a un compte
 */
public class Enfant extends Personne {

    /**
     * Default constructor
     */    
    public Enfant(String nom, String prenom, int age, String sexe, String regime) {
        super(nom, prenom, age, sexe);
        this.regime = regime;
    }

    /**
     * Le régime alimentaire de l'enfant
     */
    private String regime;


    /**
     * Permet de récupperer le régime alimentaire de l'enfant
     * @return
     */
    public String getRegime() {
        return regime;
    }

}