package Vue;

import Model.*;
import Controller.*;
import javax.swing.*;

import java.awt.*;
import javax.swing.border.EmptyBorder;


public class accueilStart extends JPanel {
	private JButton b1 = new JButton("Se connecter");
	private JButton b2 = new JButton("S'inscrire");
	private JLabel label = new JLabel("Bienvenue");
	
	private acceuilStartCtl ctl;
	private pagePrincipale mainView;
	
	public accueilStart(pagePrincipale v, Cantine cantine) {
		mainView = v;
		ctl = new acceuilStartCtl(mainView, cantine);
		
		setBorder(new EmptyBorder(0, 100, 50, 100));
		setLayout(new GridLayout(2, 1, 0, 0));
		
		b1.setName("connecter");
		b1.setBackground(Color.WHITE);
        b1.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		b1.addActionListener(ctl);
		b2.setName("inscrire");
		b2.setBackground(Color.WHITE);
        b2.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		b2.addActionListener(ctl);
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		add(label);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setBackground(Color.white);
		panel.setLayout(new GridLayout(2, 1, 0, 20));
		
		panel.add(b1);
		panel.add(b2);

	}
	
}

