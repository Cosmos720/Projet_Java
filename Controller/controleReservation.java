package Controller;

import Vue.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Reservation;

import java.util.*;

public class controleReservation implements ActionListener{
	private pageReservation mainView;
	private Compte compte;
	
	public controleReservation(pageReservation v, Compte c) {
		mainView = v;
		compte = c;
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
			ArrayList<String> list_resa = mainView.getReservation();
			for(String s : list_resa){
				Reservation r = new Reservation(mainView.getName(), s, 3, compte);
				compte.addResa(r);
			}
			mainView.dispose();
		}
	}

}
