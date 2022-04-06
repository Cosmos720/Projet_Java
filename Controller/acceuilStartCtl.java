package Controller;

import java.awt.event.*;
import javax.swing.*;

import Vue.*;

public class acceuilStartCtl implements ActionListener{
	
	private pagePrincipale mainView;
	
	public acceuilStartCtl(pagePrincipale v) {
		mainView = v;
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "connecter") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageConnecter(mainView));
			mainView.validate();
		}else if(pressed.getName() == "inscrire") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageInscrire(mainView));
			mainView.validate();
		}
	}

}
