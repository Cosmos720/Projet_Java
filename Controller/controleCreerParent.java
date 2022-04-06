package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleCreerParent implements ActionListener{
	private pagePrincipale mainView;
	private pageCreerParent pageP;
	private Compte compte;
	
	public controleCreerParent(pagePrincipale v, Compte c, pageCreerParent p) {
		mainView = v;
		compte = c;
		pageP = p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "continuer") {
			Parent p = new Parent(pageP.getNom(),pageP.getPrenom(),Integer.parseInt(pageP.getAge()),pageP.getSexe(),compte,null,/*Integer.parseInt(pageP.getSalaire()*/1600);
			compte.setParent(p);
            mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, compte));
			mainView.validate();
		}
	}

}
