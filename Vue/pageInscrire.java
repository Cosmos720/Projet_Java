package Vue;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import Controller.*;

public class pageInscrire extends JPanel {
	private JTextField textField  = new JTextField();
	private JPasswordField passwordField =  new JPasswordField();
	private JPasswordField passwordFieldConfirm = new JPasswordField();
	private JLabel label_id = new JLabel("Identifiant");
	private JLabel label_mdp = new JLabel("Mot de passe");
	private JLabel label_top = new JLabel("Inscription");
	private JLabel label_mdp_conf = new JLabel("Confirmer le mot de passe");
	private JButton b1 = new JButton("S'inscrire");
	
	private pagePrincipale mainView;
	private inscrireCtl ctl;
	
	public pageInscrire(pagePrincipale v) {
		super();
		mainView = v;
		ctl = new inscrireCtl(mainView, this);
		
		setBorder(new EmptyBorder(50, 80, 50, 80));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		label_top.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_top.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(label_top);
		
		Component verticalStrut = Box.createVerticalStrut(50);
		add(verticalStrut);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(5, 2, 0, 40));
		panel.add(new JPanel());
		panel.add(new JPanel());
		
		panel.add(label_id);
		
		
		panel.add(textField);
		textField.setColumns(10);
		
		
		panel.add(label_mdp);
		
		
		panel.add(passwordField);
		
		
		panel.add(label_mdp_conf);
		
		
		panel.add(passwordFieldConfirm);
		panel.add(new JPanel());
		panel.add(new JPanel());
		Component verticalStrut_1 = Box.createVerticalStrut(50);
		add(verticalStrut_1);
		
		
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setName("inscrire");
		b1.addActionListener(ctl);
		add(b1);

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
