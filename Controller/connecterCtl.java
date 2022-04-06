package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class connecterCtl implements ActionListener{
	private pageAccueil mainView;
	private Cantine cantine;
	
	public connecterCtl(pageAccueil v, Cantine ca) {
		mainView = v;
		cantine = ca;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "connecter") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, null, cantine));
			mainView.validate();
		}
	}

}
