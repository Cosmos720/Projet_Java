package Controller;

import java.awt.event.*;
import javax.swing.*;

import Vue.*;
import Model.*;

public class acceuilStartCtl implements ActionListener{
	
	private pagePrincipale mainView;
	private Cantine cantine;
	
	public acceuilStartCtl(pagePrincipale v, Cantine cantine) {
		mainView = v;
		this.cantine = cantine;
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "connecter") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageConnecter(mainView, cantine));
			mainView.validate();
		}else if(pressed.getName() == "inscrire") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageInscrire(mainView, cantine));
			mainView.validate();
		}
	}

}
