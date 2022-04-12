package Vue;

import Model.*;
import Controller.*;
import javax.swing.*;

import java.awt.*;
import javax.swing.border.EmptyBorder;


public class accueilStart extends JPanel {

	
	private JButton btn_connect = new JButton("Se connecter");
	private JButton btn_inscrire = new JButton("S'inscrire");
	private JLabel label;
	
	private acceuilStartCtl ctl;	//controleur de la page
	private pagePrincipale mainView; //la fenetre dans laquelle se trouve le panel
	


	/**
	 * Creer ce que va afficher la fenetre et affecter aux bouttons leur controlleur
	 * @param v est la fenetre dans laquelle est affichée le panel
	 * @param cantine nous permet d'avoir acces a la base de données
	 * 
	 */

	public accueilStart(pagePrincipale v, Cantine cantine) {
		mainView = v;
		ctl = new acceuilStartCtl(mainView, cantine);
		
		setBorder(new EmptyBorder(0, 100, 50, 100));
		setLayout(new GridLayout(2, 1, 0, 0));
		
		btn_connect.setName("connecter");
		btn_connect.setBackground(Color.WHITE);
        btn_connect.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		btn_connect.addActionListener(ctl);

		btn_inscrire.setName("inscrire");
		btn_inscrire.setBackground(Color.WHITE);
        btn_inscrire.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		btn_inscrire.addActionListener(ctl);
		
		label=new JLabel(cantine.getNom_cantine());
		label.setFont(new Font("Serif", Font.BOLD, 48));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		add(label);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(2, 1, 0, 20));
		
		panel.add(btn_connect);
		panel.add(btn_inscrire);

	}
	
}

