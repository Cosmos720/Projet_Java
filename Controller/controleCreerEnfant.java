package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleCreerEnfant implements ActionListener{
	private pageCreerEnfant mainView;
	private Compte compte;
	
	public controleCreerEnfant(pageCreerEnfant v, Compte c) {
		mainView = v;
		compte = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "creer") {
			// Creation d'un nouveau Enfant
			Enfant enfant = new Enfant(mainView.getNom(), mainView.getPrenom(),mainView.getAge(),mainView.getSexe(),mainView.getRegime(),compte,null);
			compte.getuser().addEnfant(enfant);
			compte.getuser().newQuotient();
            mainView.dispose();
		}
	}

}
