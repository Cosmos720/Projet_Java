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
			if(!page.isWrite(page.getText())){
				page.addDate(page.getText());
			}else{
				JOptionPane.showMessageDialog(mainView, "Vous avez déjà selectionné cette date","Date déjà selectionné",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(pressed.getName() == "ajouter") {
			ArrayList<String> list_resa = page.getReservation();
			if(compte.getEnfants().size() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas inscrit d'enfant à la cantine.","Pas d'enfant inscrit",JOptionPane.WARNING_MESSAGE);
			}else if(list_resa.size() == 0){
				JOptionPane.showMessageDialog(mainView, "Vous n'avez pas choisis de reservation.","Pas de reservation",JOptionPane.WARNING_MESSAGE);
			}else if(compte.isRes(page.getEnfant(), list_resa)){
				JOptionPane.showMessageDialog(mainView, "Une des réservations entrée est déjà existante.","Réservation existante",JOptionPane.WARNING_MESSAGE);
			}else{
				// Ajouter les réservations
				int resultat = JOptionPane.showConfirmDialog(mainView,"Voulez vous vraiment confirmer cette réservation?","Confirmation",JOptionPane.YES_NO_OPTION); 
				if (resultat==JOptionPane.YES_OPTION){	
					double prix = compte.getuser().getQuotient().getTotal();
					double total_prix = prix * list_resa.size();
					double manquant = total_prix - compte.getSolde();
					if(compte.getSolde() - total_prix >= 0){
						for(String s : list_resa){
							new Reservation(page.getEnfant(), s, compte, prix);
						}
						compte.debiter(total_prix);
						page.showResa();
						page.deleteAllDate();
						mainView.validate();
					}else {
						JLabel message = new JLabel("<html><center>Vous n'avez pas assez de solde pour faire ces reservations:<br>il vous manque "+new DecimalFormat(".##").format(manquant)+"€"+ "<br>Voulez vous ajouter de l'argent sur votre compte?");
						message.setHorizontalAlignment(SwingConstants.CENTER);
						//JOptionPane.showMessageDialog(mainView, message,"Solde insuffisant",JOptionPane.WARNING_MESSAGE);
						int choix = JOptionPane.showConfirmDialog(mainView, message,"Ajout d'argent",JOptionPane.YES_NO_OPTION);
						if(choix==JOptionPane.YES_OPTION){
							new pageAjouterArgent(compte, cantine);
						}
					}
				}
			}
				
			
		
		}else if(pressed.getName() == "supprimer"){
			int[] indices = page.getSelectedDates();
			if(indices.length == 0){
				JOptionPane.showMessageDialog(mainView, "Veuillez selectionné une date à supprimer","Aucune date selectionné",JOptionPane.WARNING_MESSAGE);
			}else{
				page.deleteDate(indices);
			}
		}else if(pressed.getName() == "retour"){
			mainView.getContentPane().removeAll();
			mainView.getContentPane().add(new pageMain(mainView, compte, cantine));
			mainView.validate();
		}
	}

}
