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

    private double total;
    private double quotient;

    private double CalculQuotient(Parent p){
        double a = ((double)1/12) * ((double)p.getSalaire());
        double q = a / ((double)(1+p.getEnfants().size()));
        if(q>100){
            q = 100;
        }
        return q;
    }

    private double CalculTotal(double quotient){
        return 1+(quotient/25);
    }

    public double getTotal(){
        return total;
    }
}