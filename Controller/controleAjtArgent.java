package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class controleAjtArgent implements ActionListener{
	private pageAjouterArgent mainView;
	
	public controleAjtArgent(pageAjouterArgent v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "ajouter") {
			// Creation d'un nouveau Enfant
            // mainView.getValeur()
			//mainView.dispose();
		}
	}

}
