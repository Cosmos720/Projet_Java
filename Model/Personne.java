
/**
 * 
 */
public class Personne {

    /**
     * Default constructor
     */
    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private int age;

    /**
     * 
     */
    private String sexe;

    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }



    public int getAge() {
        return age;
    }


    public String getSexe() {
        return sexe;
    }


}