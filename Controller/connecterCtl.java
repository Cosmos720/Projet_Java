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
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageMain(mainView, null, cantine));
				mainView.validate();
			}
		}else if(pressed.getName() == "retour") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new accueilStart(mainView, cantine));
			mainView.validate();
		}
	}

}
