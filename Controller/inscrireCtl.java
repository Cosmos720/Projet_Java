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
			if(Arrays.equals(mdp,mdpconfirm)){
				Compte compte = new Compte(user,String.valueOf(mdp),0,null,new Vector<Reservation>());
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageCreerParent(mainView, compte, cantine));
				mainView.validate();
			}
		} else if(pressed.getName() == "retour"){
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new accueilStart(mainView, cantine));
			mainView.validate();
		}
		
	}

}
