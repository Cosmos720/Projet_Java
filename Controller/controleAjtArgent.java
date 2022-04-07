package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleAjtArgent implements ActionListener{
	private pageAjouterArgent mainView;
	private Compte compte;

	public controleAjtArgent(pageAjouterArgent v, Compte c) {
		mainView = v;
		compte = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "ajouter") {
			System.out.println("a");
			compte.addSolde(mainView.getValeur());
			mainView.dispose();
		}
	}

}
