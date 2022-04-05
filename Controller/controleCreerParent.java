package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleCreerParent implements ActionListener{
	private pageAccueil mainView;
	
	public controleCreerParent(pageAccueil v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "continuer") {
			
			// Creation d'un nouveau Parent
            /*mainView.getAge()
            mainView.getPrenom()
            mainView.getNom()
            mainView.getSexe()
            mainView.getSalaire()*/
            mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(null));
			mainView.validate();
		}
	}

}
