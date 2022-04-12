package Model;

import java.util.*;

/**
 * La cantine ainsi que la base de données des comptes relié à cette dernière
 */
public class Cantine {

     
    /**
     * Default constructor
     */
    public Cantine(String nom_cantine) {
            this.nom_cantine = nom_cantine;
            this.comptes = new Vector<Compte>();
        }

    /**
     * Le nom de la cantine
     */
    private String nom_cantine; 

    /**
     * La liste des comptes
     */
    private Vector<Compte> comptes;

    

    /**
     * Permet de récupperer le nom de la cantine
     * @return le nom de la cantine
     */
    public String getNom_cantine() {
        return nom_cantine;
    }

    /**
     * Permet de récuperer un compte grâce à son identifiant
     * @param id L'identifiant du compte à rechercher
     * @return Le compte associé à cet identifiant
     */
    public Compte getCompte(String id){
        for(Compte c : comptes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    /**
     * Permet d'ajouter un compte à la liste des comptes enregistrer à cette cantine
     * @param c Le compte à ajouter
     * @return True si le compte à bien été ajouté
     */
    public boolean addComptes(Compte c) {
        return this.comptes.add(c);
    }

    /**
     * Permet de savoir si un identifiant est déjà existant dans la liste des comptes
     * @param id L'identifant dont on cherche l'existance
     * @return si l'identifiant existe déjà
     */
    public boolean idExist(String id){
        for(Compte c : comptes){
            if(c.getId().equals(id)){
                return true;
            }   
        }
        return false;
    }

}
