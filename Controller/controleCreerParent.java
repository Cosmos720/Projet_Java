package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class controleCreerParent implements ActionListener{
	private pagePrincipale mainView;
	private pageCreerParent pageP;
	private Compte compte;
	private Cantine cantine;
	
	public controleCreerParent(pagePrincipale v, Compte c, pageCreerParent p, Cantine cantine) {
		mainView = v;
		compte = c;
		pageP = p;
		this.cantine = cantine;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());

		String nom = pageP.getNom();
		String prenom = pageP.getPrenom();
		int age = pageP.getAge();
		int salaire = pageP.getSalaire();

		if(pressed.getName() == "continuer") {
			if(nom.length() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de nom.","Nom manquant",JOptionPane.WARNING_MESSAGE);
			}else if(salaire == -1){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de salaire.","Salaire manquant",JOptionPane.WARNING_MESSAGE);
			}else if(age == -1 ||age<18 || age>95){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré d'age. \n Ou votre age n'est pas valide","Age invalide",JOptionPane.WARNING_MESSAGE);
			}else if(prenom.length() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de prenom.","Prenom manquant",JOptionPane.WARNING_MESSAGE);
			}else if(prenom==nom){
				JOptionPane.showMessageDialog(mainView, "Veuillez rentré un nom et prenom valide.","Nom Prenom invalide",JOptionPane.WARNING_MESSAGE);
			}else{
				new Parent(nom,prenom,age,pageP.getSexe(),compte, new Vector<Enfant>(),salaire);
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageMain(mainView, compte, cantine));
				mainView.validate();
			}
		}
		
	}

}
