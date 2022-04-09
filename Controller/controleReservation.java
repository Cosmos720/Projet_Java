package Controller;

import Vue.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.DecimalFormat;

public class controleReservation implements ActionListener{
	private pageReservation page;
	private pagePrincipale mainView;
	private Compte compte;
	private Cantine cantine;

	
	public controleReservation(pageReservation v, Compte c, pagePrincipale p, Cantine cantine) {
		page = v;
		compte = c;
		mainView = p;
		this.cantine = cantine;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed=((JButton)e.getSource());
		
		if(pressed.getName() == "popup") {
			page.setText(new datePicker(mainView).setPickedDate());
		}
		else if(pressed.getName() == "add" && page.getText().length() > 0) {
			page.addDate(page.getText());
		}
		else if(pressed.getName() == "ajouter") {
			ArrayList<String> list_resa = page.getReservation();
			if(compte.getEnfants().size() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas inscrit d'enfant à la cantine.","Pas d'enfant inscrit",JOptionPane.WARNING_MESSAGE);
			}else if(list_resa.size() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas choisis de reservation.","Pas de reservation",JOptionPane.WARNING_MESSAGE);
			}else{
				// Ajouter les réservations
				
				double prix = compte.getuser().getQuotient().getTotal();
				double total_prix = prix * list_resa.size();
				double manquant = total_prix - compte.getSolde();
				if(compte.getSolde() - total_prix >= 0){
					for(String s : list_resa){
						Reservation r = new Reservation(page.getName(), s, compte);
						compte.addResa(r);
					}
					compte.debiter(total_prix);
				}else {
					JOptionPane.showMessageDialog(mainView, "Vous n'avez pas assez de solde pour faire ces reservations: il vous manque "+new DecimalFormat(".##").format(manquant),"Solde insuffisant",JOptionPane.WARNING_MESSAGE);
				}
				page.showResa();
				page.deleteDate();
				mainView.validate();
			}
		}
		else if(pressed.getName() == "retour"){
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, compte, cantine));
			mainView.validate();
		}
	}

}
