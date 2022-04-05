package Vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.*;

public class pageCreerParent extends JPanel {

	private JTextField textField_nom = new JTextField();
	private JTextField textField_prenom = new JTextField();
	private JTextField textField_sexe = new JTextField();
	private JTextField textField_age = new JTextField();
	private JTextField textField_salaire = new JTextField();
	
	private JButton btn_parent = new JButton("Continuer");

	private pageAccueil mainView;
    private controleCreerParent controle;
	
	public pageCreerParent(pageAccueil v) {
		super();
		mainView = v;
        controle = new controleCreerParent(mainView);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 50, 20, 50));
		this.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel label_info = new JLabel("Ajouter les information du parent");
		label_info.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_info.setHorizontalAlignment(SwingConstants.CENTER);
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

		panel_2.add(new JPanel());
		panel_2.add(new JPanel());
		
		// Ajout boutton
		btn_parent.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btn_parent.setName("continuer");
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
        return this.textField_sexe.getText();
    }

    public String getAge(){
        return this.textField_age.getText();
    }

    public String getSalaire(){
        return this.textField_salaire.getText();
    }
}
