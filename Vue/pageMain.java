package Vue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import Controller.*;
import Model.*;

public class pageMain extends JPanel{

        private JLabel label = new JLabel("Service Cantine");
        private JButton bCompte = new JButton("Compte");
        private JButton bReservation = new JButton("Réservation");
        private JButton deconnecter = new JButton("Se deconnecter");
        private JLabel solde = new JLabel("Solde");
        private pagePrincipale mainView;
        private ControleMain controleMain;

        
        public pageMain(pagePrincipale v, Compte c) {
            super();
		    mainView = v;
		    controleMain = new ControleMain(mainView, c);

            solde = new JLabel("Solde : " + this.controleMain.getSolde()+"€");
            
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
            bCompte.setName("compte");
            bCompte.addActionListener(controleMain);
            panel.add(solde);
            panel.add(bCompte);  
            bReservation.setName("reservation");
            bReservation.addActionListener(controleMain);
            panel.add(bReservation);
            
            deconnecter.setAlignmentX(Component.CENTER_ALIGNMENT);
            deconnecter.setName("Se deconnecter");
            deconnecter.addActionListener(controleMain);
            add(deconnecter);

           
    
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




    
