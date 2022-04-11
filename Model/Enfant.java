package Model;

/**
 * 
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
     * 
     */
    private String regime;


    public String getRegime() {
        return regime;
    }

    public void setAllergies(String allergies) {
        this.regime = allergies;
    }

    public String toString(){
        return getNom() +" "+ getPrenom();
    }
}