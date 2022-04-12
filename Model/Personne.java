package Model;

/**
 * Géneralisation des classes Parent et Enfant
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
     * Le nom d'une personne
     */
    private String nom;

    /**
     * Le prenom d'une personne
     */
    private String prenom;

    /**
     * L'age de la personne
     */
    private int age;

    /**
     * Le sexe d'une personne
     */
    private String sexe;

    /**
     * Permet de recuperrer le nom de la personne
     * @return le nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Permet de recuperrer le prenom de la personne
     * @return le prenom de la personne
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Permet de recuperrer l'age de la personne
     * @return l'age de la personne
     */
    public int getAge() {
        return age;
    }

    /**
     * Permet de recuperrer le sexe de la personne
     * @return le sexe de la personne
     */
    public String getSexe() {
        return sexe;
    }

    public String toString(){
        return this.nom + " " + prenom;
    }

}