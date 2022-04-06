package Controller;

import java.awt.event.*;
import javax.swing.*;

import Model.*;
import Vue.*;

public class acceuilStartCtl implements ActionListener{
	
	private pageAccueil mainView;
	private Cantine cantine;
	
	public acceuilStartCtl(pageAccueil v, Cantine c) {
		mainView = v;
		cantine = c;
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
