package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleCreerParent implements ActionListener{
	private pageCreerParent mainView;
	
	public controleCreerParent(pageCreerParent v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "creer") {
			// Creation d'un nouveau Parent
            /*mainView.getAge()
            mainView.getPrenom()
            mainView.getNom()
            mainView.getSexe()
            mainView.getSalaire()*/
            mainView.dispose();
		}
	}

}
