package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class connecterCtl implements ActionListener{
	private pagePrincipale mainView;
	private Cantine cantine;
	
	public connecterCtl(pagePrincipale v, Cantine cantine) {
		mainView = v;
		this.cantine = cantine;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "connecter") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, null, cantine));
			mainView.validate();
		}else if(pressed.getName() == "retour") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new accueilStart(mainView, cantine));
			mainView.validate();
		}
	}

}
