package Controller;

import Vue.*;
import Model.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class inscrireCtl implements ActionListener{

	//atribut
	private pageInscrire pageInscrire;
	private pagePrincipale mainView;
	
	
	
	public inscrireCtl(pagePrincipale v, pageInscrire a) {
		mainView = v;
		pageInscrire = a;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user = this.pageInscrire.getUserName();
		char[] mdp = this.pageInscrire.getPassword();
		char[] mdpconfirm = this.pageInscrire.getPasswordConfirm();

		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "inscrire") {
			if(Arrays.equals(mdp,mdpconfirm)){
				Compte compte = new Compte(user,String.valueOf(mdp),0,null,null);
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageCreerParent(mainView, compte));
				mainView.validate();
			}
		} else if(pressed.getName() == "retour"){
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new accueilStart(mainView));
			mainView.validate();
		}
		
	}

}
