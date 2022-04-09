package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class controleCreerEnfant implements ActionListener{
	private pageCreerEnfant mainView;
	private Compte compte;
	private Cantine cantine;
	
	public controleCreerEnfant(pageCreerEnfant v, Compte c, Cantine cantine) {
		mainView = v;
		compte = c;
		this.cantine = cantine;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());

		String nom = mainView.getNom();
		String prenom = mainView.getPrenom();
		int age = mainView.getAge();

		if(pressed.getName() == "creer") {
			if(nom.length() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de nom.","Nom manquant",JOptionPane.WARNING_MESSAGE);
			}else if(prenom.length() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de prenom.","Prenom manquant",JOptionPane.WARNING_MESSAGE);
			}else if(age == -1){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré d'age.","Age manquant",JOptionPane.WARNING_MESSAGE);
			}else{
				Enfant enfant = new Enfant(nom,prenom,age,mainView.getSexe(),mainView.getRegime(),compte);
				cantine.addEnfants(enfant);
				compte.getuser().addEnfant(enfant);
				compte.getuser().newQuotient();
				mainView.dispose();
			}
		}
	}

}
