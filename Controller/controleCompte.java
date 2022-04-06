package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class controleCompte implements ActionListener{
	private pagePrincipale mainView;
	private Compte compte;

	public controleCompte(pagePrincipale v, Compte c) {
		mainView = v;
		compte = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "argent") {
			new pageAjouterArgent(compte);
		} else if(pressed.getName() == "enfant"){
            new pageCreerEnfant(compte);
        }else if(pressed.getName() == "back"){
            mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, compte));
			mainView.validate();
        }
    }
}
