package Vue;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import Controller.*;


public class pageMain extends JPanel{

        
    
        //private JButton buttonInscription;
        
        
      
        //private JButton calculQF;
    
    
        //private JTextField textField  = new JTextField();
        private JLabel label = new JLabel("Service Cantine");
        private JButton bCompte = new JButton("Compte");
        private JButton bReservation = new JButton("Réservation");
        private JButton quitter = new JButton("Back");

        
        private ControleMain controleMain;

        
        public pageMain(ControleMain controleMain ) {

            this.controleMain = controleMain;
            
            setBorder(new EmptyBorder(50, 80, 50, 80));
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            
            
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            label.setFont(new Font("Tahoma", Font.PLAIN, 20));
            add(label);
            
            Component verticalStrut = Box.createVerticalStrut(50);
            add(verticalStrut);
            
            JPanel panel = new JPanel();
            add(panel);
            panel.setLayout(new GridLayout(3, 2, 0, 20));
            
            panel.add(bCompte);    
            panel.add(bReservation);
            
            
            quitter.setAlignmentX(Component.CENTER_ALIGNMENT);
            //quitter.setFont(new Font("Tahoma", Font.PLAIN, 15));
            quitter.setName("Back");
            quitter.addActionListener(controleMain);
            add(quitter);
        }
}
/*
//utilistaion du grid pour la position des objets
GridBagLayout gbl = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
GridBagConstraints gbc = new GridBagConstraints();//pour définir des contraintes 
gbc.fill = GridBagConstraints.BOTH;
gbc.insets = new Insets(5,5,5,5);

//definition des colonnes et lignes (Ici 3 colonnes et 5 lignes)
gbl.columnWidths = new int[]{55,180,45};
gbl.rowHeights = new int[]{40,80,80,40,40};
panel.setLayout(gbl);

//pour positionner un objet dans la grille grid 
gbc.gridx = 1;
gbc.gridy = 1;
panel.add(buttonCommande, gbc);//ajouter l'objet au panel avec les contraintes


gbc.gridx = 1;
gbc.gridy = 2;
panel.add(button1, gbc);


gbc.fill = GridBagConstraints.NONE;//ne pas ajuster l'objet
gbc.gridx = 2;
gbc.gridy = 4;
panel.add(quitter, gbc);

this.setResizable(false);//ne pas redimmensionner la fenetre
this.add(panel);
//setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(800,800);//taille fenetre
//this.pack();
this.setTitle("Accueil");
this.setLocation(400,200);//placement de la fenetre sur l'ecran
this.setVisible(true);//laisser la fenetre visible

*/





        

        

    /*
    //getters setters
    public ControleAccueil getControl(){
        return this.controleAcceuil;
    }
    */




    
