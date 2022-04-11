import Model.*;
import java.util.*;

public class BDD {

    public BDD() {

    }

    public Cantine createCantine(){
        Compte Arm = new Compte("Skr", "skr", 500.2 , null, null);
        Parent Armen = new Parent("Sulejmanovic", "Armen", 18, "Homme", Arm, new Vector<Enfant>(), 5000000);
        Arm.setParent(Armen);
        Enfant ArmJunior = new Enfant("Sulejmanovic", "Alexandre", 5, "Garcon", "Aucun", Arm);
        Armen.addEnfant(ArmJunior);

        Compte Coco = new Compte("Coco", "Cosmos720", 1 , null, null);
        Parent Corentin = new Parent("Boux", "Corentin", 42, "Femme", Coco, new Vector<Enfant>(), 1200);
        Coco.setParent(Corentin);
        Enfant CocoLink = new Enfant("Boux", "Link", 12, "Garcon", "Aucun", Coco);
        Enfant CocoZelda = new Enfant("Boux", "Zelda", 9, "Femme", "Aucun", Coco);
        Corentin.addEnfant(CocoLink);
        Corentin.addEnfant(CocoZelda);

        Compte Awk = new Compte("Awk", "awk", 2000 , null, null);
        Parent Alexandre = new Parent("Wolak", "Alexandre", 42, "Homme", Awk, new Vector<Enfant>(), 3000);
        Awk.setParent(Alexandre);
        Enfant Kevin = new Enfant("Wolak", "Kevin", 17, "Garcon", "Aucun", Awk);
        Enfant Denis = new Enfant("Dupont", "Denis", 16, "Garcon", "Aucun", Awk);
        Alexandre.addEnfant(Kevin);
        Alexandre.addEnfant(Denis);

        Compte Harlaus = new Compte("Harlaus", "azerty", 3000 , null, null);
        Parent Gauthier = new Parent("Evraerd", "Gauthier", 24, "Homme", Harlaus, new Vector<Enfant>(), 8000);
        Harlaus.setParent(Gauthier);
        Enfant Laura = new Enfant("Evraerd", "Laura", 12, "Fille", "Aucun", Harlaus);
        Enfant Clara = new Enfant("Papillion", "Clara", 4, "Fille", "Aucun", Harlaus);
        Gauthier.addEnfant(Laura);
        Gauthier.addEnfant(Clara);


        Cantine cantine = new Cantine("Crous", 200);
		cantine.addComptes(Arm);
        cantine.addComptes(Coco);
        cantine.addComptes(Awk);
        cantine.addComptes(Harlaus);
        return cantine;
    }
    
}
