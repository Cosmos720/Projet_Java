package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Model.*;
import Controller.*;

public class pageCreerParent extends JPanel {

	private JTextField textField_nom = new JTextField();
	private JTextField textField_prenom = new JTextField();
	private pagePrincipale mainView;
	private JTextField textField_age = new JTextField();
	private JTextField textField_salaire = new JTextField();
	private JButton btn_parent = new JButton("Continuer");
	private controleCreerParent controle;
	
	private JComboBox<String> ls; 
	
	

	
	public pageCreerParent(pagePrincipale v, Compte c, Cantine cantine ) {
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
		mainView.setTitle("Information du parent");
        controle = new controleCreerParent(mainView, c, this, cantine);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		Component verticalStrut = Box.createVerticalStrut(50);
        add(verticalStrut);

		GridBagLayout gbl = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc = new GridBagConstraints();//pour définir des contraintes 
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl.columnWidths = new int[]{200,200,200};
		gbl.rowHeights = new int[]{75,75,75,75,75,75,25,75};
		
		
		JLabel label_info = new JLabel("Ajouter les information du parent");
		label_info.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_info.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label_info);

		JPanel panel = new JPanel();
		panel.setLayout(gbl);
        // Ajout Nom
		JLabel label_nom = new JLabel("Nom");
		label_nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_nom.addKeyListener(Letter);
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(label_nom, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(textField_nom, gbc);
		
        // Ajout Prenom
		JLabel label_prenom = new JLabel("Prenom");
		label_prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_prenom.addKeyListener(Letter);
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(label_prenom, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(textField_prenom, gbc);
		
        // Ajout Sexe
		JLabel label_sexe = new JLabel("Sexe");
		ls = new JComboBox<String>(new String[] {"Homme","Femme"});
		label_sexe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(label_sexe, gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel.add(ls, gbc);
		
        // Ajout Age
		JLabel label_age = new JLabel("Age");
		label_age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_age.addKeyListener(Digit);
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(label_age, gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel.add(textField_age, gbc);
		
        // Ajout Salaire
		JLabel label_salaire = new JLabel("Salaire en brut");
		label_salaire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(label_salaire, gbc);
		textField_salaire.addKeyListener(Digit);
		gbc.gridx = 2;
		gbc.gridy = 5;
		panel.add(textField_salaire, gbc);

		
		
		// Ajout boutton
		btn_parent.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btn_parent.setName("continuer");
		btn_parent.setBackground(Color.WHITE);
        btn_parent.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		btn_parent.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn_parent.addActionListener(controle);
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 1;
		gbc.gridy = 7;
		panel.add(btn_parent, gbc);

		add(panel);
		
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
        if(textField_age.getText().equals("")){
			return -1;
		}
        return Integer.parseInt(textField_age.getText());
    }

    public int getSalaire(){
		if(textField_salaire.getText().equals("")){
			return -1;
		}
        return Integer.parseInt(textField_salaire.getText());
    }
}
