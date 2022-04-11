package Model;

/**
 * 
 */
public class Enfant extends Personne {

    /**
     * Default constructor
     */    
    public Enfant(String nom, String prenom, int age, String sexe, String regime,
            Compte compte) {
        super(nom, prenom, age, sexe);
        this.regime = regime;
        this.compte = compte;
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

    public String toString(){
        return getNom() +" "+ getPrenom();
    }
}