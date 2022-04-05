package Vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.*;

public class pageCreerParent extends JFrame {

	private JTextField textField_nom = new JTextField();
	private JTextField textField_prenom = new JTextField();
	private JTextField textField_sexe = new JTextField();
	private JTextField textField_age = new JTextField();
	private JTextField textField_salaire = new JTextField();
	
	private JButton btn_parent = new JButton("Creer parent");

    private controleCreerParent controle;
	
	public pageCreerParent() {
		super();
        controle = new controleCreerParent(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
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
		panel_2.add(label_nom);
		panel_2.add(textField_nom);
		
        // Ajout Prenom
		JLabel label_prenom = new JLabel("Prenom");
		label_prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(label_prenom);
		panel_2.add(textField_prenom);
		
        // Ajout Sexe
		JLabel label_sexe = new JLabel("Sexe");
		label_sexe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(label_sexe);
		panel_2.add(textField_sexe);
		
        // Ajout Age
		JLabel label_age = new JLabel("Age");
		label_age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(label_age);
		panel_2.add(textField_age);
		
        // Ajout Salaire
		JLabel label_salaire = new JLabel("Salaire");
		label_salaire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(label_salaire);
		panel_2.add(textField_salaire);
		
		// Ajout boutton
		btn_parent.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btn_parent.setName("creer");
        btn_parent.addActionListener(controle);
		panel_1.add(btn_parent);
		
		setVisible(true);
		
	}

    public String getNom(){
        return this.textField_nom.getText();
    }

    public String getPrenom(){
        return this.textField_prenom.getText();
    }

    public String getSexe(){
        return this.textField_sexe.getText();
    }

    public String getAge(){
        return this.textField_age.getText();
    }

    public String getSalaire(){
        return this.textField_salaire.getText();
    }
}
