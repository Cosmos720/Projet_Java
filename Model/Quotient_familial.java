package Model;
/**
 * 
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
     * 
     */
    private int total;

    /**
     * 
     */
    private int quotient;

    /**
     * 
     */
    private int CalculQuotient(Parent p){
        if(p.getEnfants() != null){
            int q = ((1/12)*p.getSalaire())/(1+p.getEnfants().size());
            if(q>100){
                q = 100;
            }
            return q;
        }
        return 0;
    }

    /**
     * 
     */
    private int CalculTotal(int quotient){
        return 1+(quotient/25);
    }

    public int getTotal(){
        return total;
    }
}