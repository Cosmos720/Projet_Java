import Model.*;
import java.util.*;

public class BDD {

    public BDD() {
    }

    public Cantine createCantine(){
        Compte Arm = new Compte("Skr", "skr", 500.2 , null);
        Parent Armen = new Parent("Sulejmanovic", "Armen", 18, "Homme", Arm, new Vector<Enfant>(), 5000000);
        Enfant ArmJunior = new Enfant("Sulejmanovic", "Alexandre", 5, "Garcon", "Aucun");
        Armen.addEnfant(ArmJunior);
        Arm.getuser().newQuotient();

        Compte Coco = new Compte("Coco", "Cosmos720", 1.0, null);
        Parent Corentin = new Parent("Boux", "Corentin", 42, "Femme", Coco, new Vector<Enfant>(), 1200);
        Enfant CocoLink = new Enfant("Boux", "Link", 12, "Garcon", "Aucun");
        Enfant CocoZelda = new Enfant("Boux", "Zelda", 9, "Femme", "Aucun");
        Corentin.addEnfant(CocoLink);
        Corentin.addEnfant(CocoZelda);
        Coco.getuser().newQuotient();

        Compte Awk = new Compte("Awk", "awk", 2000 , null);
        Parent Alexandre = new Parent("Wolak", "Alexandre", 42, "Homme", Awk, new Vector<Enfant>(), 3000);;
        Enfant Kevin = new Enfant("Wolak", "Kevin", 17, "Garcon", "Aucun");
        Enfant Denis = new Enfant("Dupont", "Denis", 16, "Garcon", "Aucun");
        Alexandre.addEnfant(Kevin);
        Alexandre.addEnfant(Denis);
        Awk.getuser().newQuotient();

        Compte Harlaus = new Compte("Harlaus", "azerty", 3000 , null);
        Parent Gauthier = new Parent("Evraerd", "Gauthier", 24, "Homme", Harlaus, new Vector<Enfant>(), 8000);
        Enfant Laura = new Enfant("Evraerd", "Laura", 12, "Fille", "Aucun");
        Enfant Clara = new Enfant("Evraerd", "Clara", 4, "Fille", "Aucun");
        Gauthier.addEnfant(Laura);
        Gauthier.addEnfant(Clara);
        Harlaus.getuser().newQuotient();

        Cantine cantine = new Cantine("Cantine");
		cantine.addComptes(Arm);
        cantine.addComptes(Coco);
        cantine.addComptes(Awk);
        cantine.addComptes(Harlaus);
        return cantine;
    }
    
}
