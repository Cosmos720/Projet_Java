package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class inscrireCtl implements ActionListener{

	//atribut
	private pageInscrire pageInscrire;
	private pageAccueil mainView;
	
	
	
	public inscrireCtl(pageAccueil v, pageInscrire a) {
		mainView = v;
		pageInscrire = a;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user = this.pageInscrire.getUserName();
		char[] mdp = this.pageInscrire.getPassword();
		char[] mdpconfirm = this.pageInscrire.getPasswordConfirm();
		System.out.println(user);
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "inscrire") {
			if(mdp==mdpconfirm){
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageCreerParent(mainView));
				mainView.validate();
			}

		}
		
	}

}
