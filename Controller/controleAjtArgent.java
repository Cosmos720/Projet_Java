package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;

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
		
		double somme = mainView.getValeur();
		if(pressed.getName() == "ajouter") {
			if(somme == -1){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de somme.","Somme manquante",JOptionPane.WARNING_MESSAGE);
			}else{
				compte.addSolde(somme);
				mainView.dispose();
			}
		}
	}

}
