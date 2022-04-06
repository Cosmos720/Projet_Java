package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleCreerParent implements ActionListener{
	private pageAccueil mainView;
	private pageCreerParent pageP;
	private Compte compte;
	private Cantine cantine;
	
	public controleCreerParent(pageAccueil v, Compte c, pageCreerParent p, Cantine ca) {
		mainView = v;
		compte = c;
		pageP = p;
		cantine = ca;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "continuer") {
			Parent p = new Parent(pageP.getNom(),pageP.getPrenom(),Integer.parseInt(pageP.getAge()),pageP.getSexe(),compte,null,/*Integer.parseInt(pageP.getSalaire()*/1600);
			compte.setParent(p);
            mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, compte, cantine));
			mainView.validate();
		}
	}

}
