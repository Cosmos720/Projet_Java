import Vue.*;
import Model.*;

public class Main {
	public static void main(String[] args) {
		Cantine cantine = new Cantine("Crous", 200);
		pagePrincipale vue = new pagePrincipale(cantine);
	}

}