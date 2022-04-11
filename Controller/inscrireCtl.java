package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class inscrireCtl implements ActionListener{

	//atribut
	private pageInscrire pageInscrire;
	private pagePrincipale mainView;
	private Cantine cantine;
	
	
	
	public inscrireCtl(pagePrincipale v, pageInscrire a, Cantine cantine) {
		mainView = v;
		pageInscrire = a;
		this.cantine = cantine;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user = this.pageInscrire.getUserName();
		char[] mdp = this.pageInscrire.getPassword();
		char[] mdpconfirm = this.pageInscrire.getPasswordConfirm();

		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "inscrire") {
			if(user.length() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de nom d'utilisateur.","Nom d'utilisateur manquant",JOptionPane.WARNING_MESSAGE);
			}else if(mdp.length == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de mot de passe.","Mot de passe manquant",JOptionPane.WARNING_MESSAGE);
			}else if(mdpconfirm.length == 0){
					JOptionPane.showMessageDialog(mainView, "Vous n'avez pas confirmer le mot de passe.","Mot de passe manquant",JOptionPane.WARNING_MESSAGE);
			}else if(cantine.idExist(user)){
				JOptionPane.showMessageDialog(mainView, "Cet identifiant existe déjà","Identifiant existant",JOptionPane.WARNING_MESSAGE);
			}else if(Arrays.equals(mdp,mdpconfirm)){
				Compte compte = new Compte(user,String.valueOf(mdp),0,null);
				cantine.addComptes(compte);
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageCreerParent(mainView, compte, cantine));
				mainView.validate();
			}else{
				JOptionPane.showMessageDialog(mainView, "Les 2 mots de passe rentrés ne sont pas identique.","Mot de passe incorrect",JOptionPane.WARNING_MESSAGE);
			}
		} else if(pressed.getName() == "retour"){
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new accueilStart(mainView, cantine));
			mainView.validate();
		}
		
	}

}
