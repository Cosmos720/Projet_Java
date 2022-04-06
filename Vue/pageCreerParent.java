package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

import Model.*;
import Controller.*;

public class pageCreerParent extends JPanel {

	private JTextField textField_nom = new JTextField();
	private JTextField textField_prenom = new JTextField();
	private pagePrincipale mainView;
	private JTextField textField_age = new JTextField();
	private JButton btn_parent = new JButton("Continuer");
	private controleCreerParent controle;
	
	private JComboBox<String> ls; 
	private JComboBox<String> lSalaire; 
	

	
	public pageCreerParent(pagePrincipale v, Compte c) {
		/**
        * Oblige l'utilisateur de mettre uniquement des chiffres dans un FormatedTextField donné
        */
        KeyAdapter Digit=new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        };

        /**
         * Oblige l'utilisateur de mettre uniquement des charactere dans un FormatedTextField donnée
         */        
        KeyAdapter Letter=new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isAlphabetic(c)){
                    e.consume();
                }
            }
        };

		mainView = v;
        controle = new controleCreerParent(mainView, c, this);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 50, 20, 50));
		this.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel label_info = new JLabel("Ajouter les information du parent");
		label_info.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_info.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(label_info);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 20, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(7, 2, 20, 20));
		
		panel_2.add(new JPanel());
		panel_2.add(new JPanel());

        // Ajout Nom
		JLabel label_nom = new JLabel("Nom");
		label_nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_nom.addKeyListener(Letter);
		panel_2.add(label_nom);
		panel_2.add(textField_nom);
		
        // Ajout Prenom
		JLabel label_prenom = new JLabel("Prenom");
		label_prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_prenom.addKeyListener(Letter);
		panel_2.add(label_prenom);
		panel_2.add(textField_prenom);
		
        // Ajout Sexe
		JLabel label_sexe = new JLabel("Sexe");
		//String[] listSexe = new String[] {"Homme","Femme"};
		ls = new JComboBox<String>(new String[] {"Homme","Femme"});

		label_sexe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(label_sexe);
		panel_2.add(ls);
		
        // Ajout Age
		JLabel label_age = new JLabel("Age");
		label_age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_age.addKeyListener(Digit);
		panel_2.add(label_age);
		panel_2.add(textField_age);
		
        // Ajout Salaire
		JLabel label_salaire = new JLabel("SalaireBrut");
		String[] listSalaire = new String[] {"0€ - 1600€","1601€ - 3000€","3000€ et plus"};
		lSalaire = new JComboBox<String>(listSalaire);

		label_salaire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(label_salaire);
		panel_2.add(lSalaire);

		panel_2.add(new JPanel());
		panel_2.add(new JPanel());
		
		// Ajout boutton
		btn_parent.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btn_parent.setName("continuer");
		btn_parent.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn_parent.addActionListener(controle);
		panel_1.add(btn_parent);
	}

    public String getNom(){
        return this.textField_nom.getText();
    }

    public String getPrenom(){
        return this.textField_prenom.getText();
    }

    public String getSexe(){
        return ((String)ls.getSelectedItem());
    }

    public int getAge(){
        return Integer.parseInt(textField_age.getText());
    }

    public String getSalaire(){
        return ((String)lSalaire.getSelectedItem());
    }
}
