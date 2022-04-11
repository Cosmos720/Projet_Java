import Vue.*;

import java.util.Vector;

import Model.*;

public class Main {
	public static void main(String[] args) {

		Compte Arm = new Compte("Skr", "skrmdp", 500.2 , null, null);
		Parent Armen = new Parent("Sulejmanovic", "Armen", 18, "Homme", Arm, new Vector<Enfant>(), 5000);
		Arm.setParent(Armen);
		Enfant ArmJunior = new Enfant("Sulejmanovic", "Alexandre", 5, "Garcon", "Aucun", Arm);
		Armen.addEnfant(ArmJunior);

		Compte Coco = new Compte("Coco", "Cosmos720", 1 , null, null);
		Parent Corentin = new Parent("Boux", "Corentin", 42, "Femme", Coco, new Vector<Enfant>(), 1200);
		Arm.setParent(Armen);
		Enfant CocoLink = new Enfant("Boux", "Link", 12, "Garcon", "Aucun", Coco);
		Enfant CocoZelda = new Enfant("Boux", "Zelda", 9, "Femme", "Aucun", Coco);
		Corentin.addEnfant(CocoLink);
		Corentin.addEnfant(CocoZelda);
		
		Cantine cantine = new Cantine("Crous", 200);
		cantine.addComptes(Arm);
		pagePrincipale vue = new pagePrincipale(cantine);



	}

}