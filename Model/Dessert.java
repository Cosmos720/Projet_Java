package Model;

import java.util.*;

/**
 * 
 */
public class Dessert {

    /**
     * Default constructor
     */
    public Dessert(String n, Vector<Aliments> liste_a) {
        nom_dessert = n;
        aliments = liste_a;
    }

    /**
     * 
     */
    private String nom_dessert;


    /**
     * 
     */
    private Vector<Aliments> aliments;

    /**
     * 
     */
    public String getNom(){
        return nom_dessert;
    }

    /**
     * 
     */
    public Vector<Aliments> getAliments(){
        return aliments;
    }

}