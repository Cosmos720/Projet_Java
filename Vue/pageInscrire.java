package Vue;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import Controller.*;
import Model.*;

public class pageInscrire extends JPanel {
	private JTextField textField  = new JTextField();
	private JPasswordField passwordField =  new JPasswordField();
	private JPasswordField passwordFieldConfirm = new JPasswordField();
	private JLabel label_id = new JLabel("Identifiant");
	private JLabel label_mdp = new JLabel("Mot de passe");
	private JLabel label_top = new JLabel("Inscription");
	private JLabel label_mdp_conf = new JLabel("Confirmer le mot de passe");
	private JButton b1 = new JButton("S'inscrire");
	private JButton b2 = new JButton("Retour");
	
	private pagePrincipale mainView;
	private inscrireCtl ctl;
	
	public pageInscrire(pagePrincipale v, Cantine cantine) {
		mainView = v;
		mainView.setTitle("Inscription");
		ctl = new inscrireCtl(mainView, this, cantine);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		

		GridBagLayout gbl = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc = new GridBagConstraints();//pour définir des contraintes 
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl.columnWidths = new int[]{200,200,200};
		gbl.rowHeights = new int[]{75,75,75,75,50,75,75};

		Component verticalStrut = Box.createVerticalStrut(50);
        add(verticalStrut);
		label_top.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_top.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(label_top);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(gbl);
		
		// Ajout identifiant
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(label_id, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(textField, gbc);
		
		// Ajout mdp
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(label_mdp, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(passwordField, gbc);
		
		// Ajout confirme mdp
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(label_mdp_conf, gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel.add(passwordFieldConfirm, gbc);
		
		
		// Ajout bouton inscrire
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setName("inscrire");
		b1.addActionListener(ctl);
		gbc.gridx = 1;
		gbc.gridy = 5;
		panel.add(b1, gbc);

		// Ajout bouton retour
		b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b2.setName("retour");
		b2.addActionListener(ctl);
		gbc.gridx = 1;
		gbc.gridy = 6;
		panel.add(b2, gbc);

		add(panel);
	}

	public String getUserName() {
		return textField.getText();
	}

	

	public char[] getPassword() {
		return passwordField.getPassword();
	}


	public char[] getPasswordConfirm() {
		return passwordFieldConfirm.getPassword();
	}



	/*
	public JPasswordField getPasswordField_1() {
		return passwordField_1;
	}

	public void setPasswordField_1(JPasswordField passwordField_1) {
		this.passwordField_1 = passwordField_1;
	}
	*/






	
}
