package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class connecterCtl implements ActionListener{
	private pageConnecter pageConnecter;
	private pagePrincipale mainView;
	private Cantine cantine;
	
	public connecterCtl(pagePrincipale v,pageConnecter p, Cantine cantine) {
		mainView = v;
		pageConnecter = p;
		this.cantine = cantine;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());

		String user = pageConnecter.getUsername();
		char[] mdp = pageConnecter.getPassword();
		
		if(pressed.getName() == "connecter") {
			if(user.length() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de nom d'utilisateur.","Nom d'utilisateur manquant",JOptionPane.WARNING_MESSAGE);
			}else if(mdp.length == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas rentré de mot de passe.","Mot de passe manquant",JOptionPane.WARNING_MESSAGE);
			}else{
				Compte compte = cantine.getCompte(user);
				if(compte == null){
					JOptionPane.showMessageDialog(mainView, "Le nom d'utilisateur n'existe pas.","Nom  d'utilisateur incorrect",JOptionPane.WARNING_MESSAGE);
				}else if(String.valueOf(mdp).equals(compte.getMdp())){
					mainView.getContentPane().removeAll();
					mainView.getContentPane().add(new pageMain(mainView, compte, cantine));
					mainView.validate();
				}else{
					JOptionPane.showMessageDialog(mainView, "Le mot de passe est incorrect.","Mot de passe incorrect",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}else if(pressed.getName() == "retour") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new accueilStart(mainView, cantine));
			mainView.validate();
		}
	}

}
