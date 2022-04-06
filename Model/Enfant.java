package Model;

/**
 * 
 */
public class Enfant extends Personne {

    /**
     * Default constructor
     */    
    public Enfant(String nom, String prenom, int age, String sexe, String regime,
            Compte compte, Cantine cantine) {
        super(nom, prenom, age, sexe);
        this.regime = regime;
        this.compte = compte;
        this.cantine = cantine;
    }

    /**
     * 
     */
    private int horaires_cours;

    /**
     * 
     */
    private String regime;

    /**
     * 
     */
    private Compte compte;

    /**
     * 
     */
    private Cantine cantine;

    
    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public int getHoraires_cours() {
        return horaires_cours;
    }

    public void setHoraires_cours(int horaires_cours) {
        this.horaires_cours = horaires_cours;
    }

    public String getAllergies() {
        return regime;
    }

    public void setAllergies(String allergies) {
        this.regime = allergies;
    }

    public Cantine getCantine() {
        return cantine;
    }

    public void setCantine(Cantine cantine) {
        this.cantine = cantine;
    }

    

}