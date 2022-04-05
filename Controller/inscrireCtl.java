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
		// test System.out.println(user);
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "inscrire") {
			if(Arrays.equals(mdp,mdpconfirm)){
				System.out.println("A");
				mainView.getContentPane().removeAll();
				mainView.getContentPane().add(new pageCreerParent(mainView));
				mainView.validate();
			}

		}
		
	}

}
