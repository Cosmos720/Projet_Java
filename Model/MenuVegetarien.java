package Model;

import java.util.*;

/**
 * 
 */
public class MenuVegetarien extends Repas {

    
    /**
     * Default constructor
     */
    
    public MenuVegetarien(int tarif_repas, int quantité_repas, String date_repas, Set<Enfant> enfants, Cantine cantine,
            Set<Reservation> resa, Dessert dessert, Entrée entree, PlatPrincipal plat) {
        super(tarif_repas, quantité_repas, date_repas, enfants, cantine, resa, dessert, entree, plat);
    }

}