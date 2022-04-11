import Model.*;
import java.util.*;

public class BDD {

    public BDD() {

    }

    public Cantine createCantine(){
        Compte Arm = new Compte("Skr", "skr", 500.2 , null, new Vector<Reservation>());
        Parent Armen = new Parent("Sulejmanovic", "Armen", 18, "Homme", Arm, new Vector<Enfant>(), 5000000);
        Arm.setParent(Armen);
        Enfant ArmJunior = new Enfant("Sulejmanovic", "Alexandre", 5, "Garcon", "Aucun", Arm);
        Armen.addEnfant(ArmJunior);
        Arm.getuser().newQuotient();

        Compte Coco = new Compte("Coco", "Cosmos720", 1 , null, new Vector<Reservation>());
        Parent Corentin = new Parent("Boux", "Corentin", 42, "Femme", Coco, new Vector<Enfant>(), 1200);
        Coco.setParent(Corentin);
        Enfant CocoLink = new Enfant("Boux", "Link", 12, "Garcon", "Aucun", Coco);
        Enfant CocoZelda = new Enfant("Boux", "Zelda", 9, "Femme", "Aucun", Coco);
        Corentin.addEnfant(CocoLink);
        Corentin.addEnfant(CocoZelda);
        Coco.getuser().newQuotient();

        Compte Awk = new Compte("Awk", "awk", 2000 , null, new Vector<Reservation>());
        Parent Alexandre = new Parent("Wolak", "Alexandre", 42, "Homme", Awk, new Vector<Enfant>(), 3000);
        Awk.setParent(Alexandre);
        Enfant Kevin = new Enfant("Wolak", "Kevin", 17, "Garcon", "Aucun", Awk);
        Enfant Denis = new Enfant("Dupont", "Denis", 16, "Garcon", "Aucun", Awk);
        Alexandre.addEnfant(Kevin);
        Alexandre.addEnfant(Denis);
        Awk.getuser().newQuotient();

        Compte Harlaus = new Compte("Harlaus", "azerty", 3000 , null, new Vector<Reservation>());
        Parent Gauthier = new Parent("Evraerd", "Gauthier", 24, "Homme", Harlaus, new Vector<Enfant>(), 8000);
        Harlaus.setParent(Gauthier);
        Enfant Laura = new Enfant("Evraerd", "Laura", 12, "Fille", "Aucun", Harlaus);
        Enfant Clara = new Enfant("Papillion", "Clara", 4, "Fille", "Aucun", Harlaus);
        Gauthier.addEnfant(Laura);
        Gauthier.addEnfant(Clara);
        Harlaus.getuser().newQuotient();

        Cantine cantine = new Cantine("Cantine pour les Tipeu", 200);
		cantine.addComptes(Arm);
        cantine.addComptes(Coco);
        cantine.addComptes(Awk);
        cantine.addComptes(Harlaus);
        return cantine;
    }
    
}
