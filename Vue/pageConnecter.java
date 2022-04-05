package Vue;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import Controller.*;



public class pageConnecter extends JPanel {
	private JTextField textField = new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	private JLabel label = new JLabel("Connexion");
	private JButton b1 = new JButton("Se connecter");
	
	private pageAccueil mainView;
	private connecterCtl ctl;
	
	public pageConnecter(pageAccueil v) {
		super();
		mainView = v;
		ctl = new connecterCtl(mainView);
		
		setBorder(new EmptyBorder(50, 50, 100, 50));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(label);
		
		Component verticalStrut = Box.createVerticalStrut(50);
		add(verticalStrut);
		
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(4, 2, 0, 40));
		panel.add(new JPanel());
		panel.add(new JPanel());
		JLabel label_id = new JLabel("Identifiant :");
		panel.add(label_id);
		
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_mdp = new JLabel("Mot de passe :");
		panel.add(label_mdp);
		
		panel.add(passwordField);
		panel.add(new JPanel());
		panel.add(new JPanel());


		Component verticalStrut_1 = Box.createVerticalStrut(50);
		add(verticalStrut_1);
		
		
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b1.setName("connecter");
		b1.addActionListener(ctl);
		add(b1);
	}

	public String getTextField() {
		return textField.getText();
	}

	

	public char[] getPasswordField() {
		return passwordField.getPassword();
	}
}
