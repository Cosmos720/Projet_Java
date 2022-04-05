package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class inscrireCtl implements ActionListener{
	private pageAccueil mainView;
	String user = this.pageInscrire.getUser
	
	public inscrireCtl(pageAccueil v) {
		mainView = v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "inscrire") {
			
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageCreerParent(mainView));
			mainView.validate();
		}
		
	}

}
