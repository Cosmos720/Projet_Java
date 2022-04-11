import Vue.*;


import Model.*;

public class Main {
	public static void main(String[] args) {

		
		BDD Bdd = new BDD();
		Cantine cantine = Bdd.createCantine();
		pagePrincipale vue = new pagePrincipale(cantine);



	}

}