package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class controleCompte implements ActionListener{
	private pageAccueil mainView;
	
	public controleCompte(pageAccueil v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "argent") {
			new pageAjouterArgent();
		} else if(pressed.getName() == "enfant"){
            new pageCreerEnfant();
        }else if(pressed.getName() == "back"){
            mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(null));
			mainView.validate();
        }
    }
}
