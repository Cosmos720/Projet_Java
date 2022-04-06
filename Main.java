import Vue.*;
import Model.*;

public class Main {
	public static void main(String[] args) {
		Cantine cantine = new Cantine("Cantine",50,12,14,null,null,null);
		pageAccueil vue = new pageAccueil(cantine);
	}

}