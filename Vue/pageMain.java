package Vue;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.border.EmptyBorder;


import Controller.*;
import Model.*;

public class pageMain extends JPanel{
        private JLabel label = new JLabel("Service Cantine");
        private JLabel label_enfant = new JLabel("Mes enfants :");
        private JButton bCompte = new JButton("Compte");
        private JButton bReservation = new JButton("Réservation");
        private JButton deconnecter = new JButton("Se deconnecter");
        private JLabel solde = new JLabel("Solde");
        private pagePrincipale mainView;
        private ControleMain controleMain;

        private JPanel panel_enfant = new JPanel();
	    private JList<Enfant> enfants;
        
        public pageMain(pagePrincipale v, Compte c, Cantine cantine) {
            
		    mainView = v;
            mainView.setTitle("Accueil");
		    controleMain = new ControleMain(mainView, c, cantine);

            solde = new JLabel("Solde : " +  new DecimalFormat("#.##").format(this.controleMain.getSolde())+"€");
            
            setBorder(new EmptyBorder(50, 80, 50, 80));
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            
            
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            label.setFont(new Font("Tahoma", Font.PLAIN, 20));
            add(label);
            
            Component verticalStrut = Box.createVerticalStrut(50);
            add(verticalStrut);
            
            
            
            JPanel panel = new JPanel();     
            add(panel);
            panel.setLayout(new GridLayout(4, 2, 0, 20)); 
            bCompte.setName("compte");
            bCompte.addActionListener(controleMain);
            bCompte.setBackground(Color.WHITE);
            bCompte.setUI(new javax.swing.plaf.basic.BasicButtonUI());

            /* 
                AFFICHAGE DES ENFANTS SUR LA PAGE MAIN 
                                                            */
            
            panel_enfant.setLayout(new GridLayout(2,1));
            panel_enfant.add(label_enfant);
            enfants = new JList<Enfant>(c.getEnfants());
            JScrollPane scrollablePane = new JScrollPane();
            scrollablePane.setViewportView(enfants);
            scrollablePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollablePane.setPreferredSize(new Dimension(200, 200));
            panel_enfant.add(scrollablePane);
            
            panel.add(panel_enfant);


            panel.add(solde);
            panel.add(bCompte);  
            bReservation.setName("reservation");
            bReservation.addActionListener(controleMain);
            bReservation.setBackground(Color.WHITE);
            bReservation.setUI(new javax.swing.plaf.basic.BasicButtonUI());   
            panel.add(bReservation);
            
            Component verticalStrut_1 = Box.createVerticalStrut(50);
            add(verticalStrut_1);

            deconnecter.setAlignmentX(Component.CENTER_ALIGNMENT);
            deconnecter.setName("Se deconnecter");
            deconnecter.setBackground(Color.WHITE);
            deconnecter.setUI(new javax.swing.plaf.basic.BasicButtonUI());
            deconnecter.addActionListener(controleMain);
            add(deconnecter);
        }
}

    
