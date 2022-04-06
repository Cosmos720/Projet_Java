package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class connecterCtl implements ActionListener{
	private pagePrincipale mainView;
	
	public connecterCtl(pagePrincipale v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "connecter") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, null));
			mainView.validate();
		}
	}

}
