package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;

public class controleModifSalaire implements ActionListener{
	private pageModifSalaire mainView;
	private Compte compte;

	public controleModifSalaire(pageModifSalaire v, Compte c) {
		mainView = v;
		compte = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		int salaire = mainView.getValeur();
		if(pressed.getName() == "Modifier") {
			if(salaire == -1){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de salaire.","Salaire manquant",JOptionPane.WARNING_MESSAGE);
			}else{
				compte.getuser().setSalaire(salaire);;
				mainView.dispose();
			}
		}
	}

}
