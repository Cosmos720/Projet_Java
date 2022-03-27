package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class inscrireCtl implements ActionListener{
	private pageAccueil mainView;
	
	public inscrireCtl(pageAccueil v) {
		mainView = v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "inscrire") {
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new main());
			mainView.validate();
		}
		
	}

}
