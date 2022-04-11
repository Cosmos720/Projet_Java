package Vue;

import javax.swing.*;
import java.awt.*;
import Controller.*;
import Model.*;



public class pageConnecter extends JPanel {
	private JTextField textField = new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	private JLabel label = new JLabel("Connexion");
	private JButton b1 = new JButton("Se connecter");
	private JButton b2 = new JButton("Retour");
	
	private pagePrincipale mainView;
	private connecterCtl ctl;
	
	public pageConnecter(pagePrincipale v, Cantine cantine) {
		mainView = v;
		mainView.setTitle("Connexion");
		ctl = new connecterCtl(mainView,this, cantine);
		
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		GridBagLayout gbl = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc = new GridBagConstraints();//pour définir des contraintes 
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl.columnWidths = new int[]{200,200,200};
		gbl.rowHeights = new int[]{75,75,75,50,75,75};

		Component verticalStrut = Box.createVerticalStrut(50);
        add(verticalStrut);

		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(gbl);

		// Ajout identifiant
		JLabel label_id = new JLabel("Identifiant :");
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(label_id, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(textField, gbc);
		
		// Ajout mdp
		JLabel label_mdp = new JLabel("Mot de passe :");
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(label_mdp, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel.add(passwordField, gbc);
		
		// Ajout bouton se connecter
		b1.setName("connecter");
		b1.addActionListener(ctl);
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(b1, gbc);

		// Ajout bouton retour
		b2.setName("retour");
		b2.addActionListener(ctl);
		gbc.gridx = 1;
		gbc.gridy = 5;
		panel.add(b2, gbc);

		add(panel);
	}

	public String getUsername() {
		return textField.getText();
	}


	public char[] getPassword() {
		return passwordField.getPassword();
	}
}
