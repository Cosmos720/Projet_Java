package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Model.*;
import Controller.*;

public class pageCreerEnfant extends JFrame {

	
	private JTextField textField_nom = new JTextField();
	private JTextField textField_prenom = new JTextField();
	private JComboBox<String> sexe;
	private JTextField textField_age = new JTextField();
	private JComboBox<String> regime;
	
	private JButton btn_enfant = new JButton("Inscrire mon Enfant");
	private JButton btn_back = new JButton("Retour");

	private controleCreerEnfant controle;
	
	public pageCreerEnfant(Compte c, Cantine cantine) {
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

		controle = new controleCreerEnfant(this,c, cantine);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Information de l'enfant");
		GridBagLayout gbl = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc = new GridBagConstraints();//pour définir des contraintes 
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl.columnWidths = new int[]{200,200,200};
		gbl.rowHeights = new int[]{75,75,75,75,75,100,75};
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(gbl);
		
		
		
        // Ajout Nom
		JLabel label_nom = new JLabel("Nom");
		label_nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_nom.addKeyListener(Letter);
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel_1.add(label_nom, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		panel_1.add(textField_nom, gbc);
		
        // Ajout Prenom
		JLabel label_prenom = new JLabel("Prenom");
		label_prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_prenom.addKeyListener(Letter);
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel_1.add(label_prenom, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel_1.add(textField_prenom, gbc);
		
        // Ajout Sexe
		JLabel label_sexe = new JLabel("Sexe");
		label_sexe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sexe = new JComboBox<String>(new String[]{"Garcon", "Fille"});
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel_1.add(label_sexe, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel_1.add(sexe, gbc);
		
        // Ajout Age
		JLabel label_age = new JLabel("Age (Entre 4 et 18ans)");
		label_age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_age.addKeyListener(Digit);
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel_1.add(label_age, gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel_1.add(textField_age, gbc);
		
		
		// Ajout Regime
		JLabel label_regime = new JLabel("Regime alimentaire");
		label_regime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		regime = new JComboBox<String>(new String[]{"Aucun","Vegan", "Vegetarien", "Sans porc"});
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel_1.add(label_regime, gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel_1.add(regime, gbc);
		
		btn_enfant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_enfant.setName("creer");
		btn_enfant.addActionListener(controle);
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 6;
		panel_1.add(btn_enfant, gbc);

		// Ajout bouton retour
		btn_back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_back.setName("retour");
		btn_back.addActionListener(controle);
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 2;
		gbc.gridy = 6;
		panel_1.add(btn_back, gbc);
		


		getContentPane().add(panel_1);
		setBounds(650, 100, 700, 700);
		setVisible(true);
		setResizable(false);
	}

	public String getNom(){
        return this.textField_nom.getText();
    }

    public String getPrenom(){
        return this.textField_prenom.getText();
    }

    public String getSexe(){
        return ((String)sexe.getSelectedItem());
    }

    public int getAge(){
        if(textField_age.getText().equals("")){
			return -1;
		}
        return Integer.parseInt(textField_age.getText());
    }

	public String getRegime(){
		return ((String)regime.getSelectedItem());
	}

}