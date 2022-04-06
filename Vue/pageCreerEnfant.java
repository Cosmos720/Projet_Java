package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

import Controller.*;

public class pageCreerEnfant extends JFrame {

	
	private JTextField textField_nom = new JTextField();
	private JTextField textField_prenom = new JTextField();
	private JComboBox<String> sexe;
	private JTextField textField_age = new JTextField();
	private JComboBox<String> regime;
	
	private JButton btn_enfant = new JButton("Inscrire mon Enfant");

	private controleCreerEnfant controle;
	
	public pageCreerEnfant() {
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

		controle = new controleCreerEnfant(this);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400,400);
		setTitle("Information de l'enfant");
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 50, 20, 50));
		getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 20, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 2, 20, 10));
		
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
		label_sexe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sexe = new JComboBox<String>(new String[]{"Garcon", "Fille"});
		panel_2.add(label_sexe);
		panel_2.add(sexe);
		
        // Ajout Age
		JLabel label_age = new JLabel("Age");
		label_age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_age.addKeyListener(Digit);
		panel_2.add(label_age);
		panel_2.add(textField_age);
		
		
		// Ajout Regime
		JLabel label_regime = new JLabel("Regime alimentaire");
		label_regime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		regime = new JComboBox<String>(new String[]{"Aucun","Vegan", "Vegetarien", "Sans porc"});
		panel_2.add(label_regime);
		panel_2.add(regime);
		
		btn_enfant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_enfant.setName("creer");
		btn_enfant.addActionListener(controle);
		panel_1.add(btn_enfant);
		
		setVisible(true);
		
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
        return Integer.parseInt(textField_age.getText());
    }

	public String getRegime(){
		return ((String)regime.getSelectedItem());
	}

}