package Model;

/**
 * Le quotient familial d'un parent en fonction de son salaire et du nombre d'enfant
 */
public class Quotient_familial {

    /**
     * Default constructor
     */
    public Quotient_familial(Parent p) {
        quotient = CalculQuotient(p);
        total = CalculTotal(quotient);
    }

    /**
     * Le prix d'un repas selon le quotient familial calculé
     */
    private double total;
    
    /**
     * Le quotient familial calculé
     */
    private double quotient;

    /**
     * Permet de calculer le quotient familial
     * @param p Le parent dont on calcul le quotient
     * @return  Le quotient familial
     */
    private double CalculQuotient(Parent p){
        double a = ((double)1/12) * ((double)p.getSalaire());
        double q = a / ((double)(1+p.getEnfants().size()));
        if(q>100){
            q = 100;
        }
        return q;
    }

    /**
     * Permet de calculer le prix d'un repas selon le quotient familial
     * @param quotient le quotient familial
     * @return le prix d'un repas
     */
    private double CalculTotal(double quotient){
        return 1+(quotient/25);
    }

    /**
     * Permet de récupperer le prix d'un repas
     * @return le prix d'un repas
     */
    public double getTotal(){
        return total;
    }
}