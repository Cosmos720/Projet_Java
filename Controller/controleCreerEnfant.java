package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleCreerEnfant implements ActionListener{
	private pageCreerEnfant mainView;
	
	public controleCreerEnfant(pageCreerEnfant v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "creer") {
			// Creation d'un nouveau Enfant
            /*mainView.getAge()
            mainView.getPrenom()
            mainView.getNom()
            mainView.getSexe()
            mainView.getClasse()*/
            //mainView.dispose();
		}
	}

}
