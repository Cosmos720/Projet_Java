package Controller;

import Vue.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.util.*;

public class controleReservation implements ActionListener{
	private pageReservation mainView;
	
	public controleReservation(pageReservation v) {
		mainView = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "popup") {
			mainView.setText(new datePicker(mainView).setPickedDate());
		}
		else if(pressed.getName() == "add" && mainView.getText().length() > 0) {
			mainView.addDate(mainView.getText());
		}
		else if(pressed.getName() == "ajouter") {
			// Ajouter les réservations
			ArrayList<String> a = mainView.getReservation();
			mainView.dispose();
		}
	}

}
