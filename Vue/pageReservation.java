package Vue;

import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;


public class pageReservation extends JPanel {
	private controleReservation controle;
	private Compte compte;
	private pagePrincipale mainView;

	private JTabbedPane onglets=new JTabbedPane(SwingConstants.TOP);
	private JPanel pan = new JPanel();
	
	/* 
		ONGLET 1
							*/
	private JPanel onglet_1 = new JPanel();
	private JTextField textField = new JTextField();
	private JButton btn_popup = new JButton("...");
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList<String> dates = new JList<String>(model);
	private JButton btn_ajouter = new JButton("Ajouter reservation");
	private JButton btn_add = new JButton("+");
	private JButton btn_supp = new JButton("Supprimer");
	private JComboBox<Enfant> enfant;
	private JButton b1 = new JButton("Retour");


	/*
			ONGLET 2
								*/
	private JPanel onglet_2 = new JPanel();
	private DefaultListModel<Reservation> model_resa;
	private JList<Reservation> resa;
	private JButton b2 = new JButton("Retour");

	

	public pageReservation(pagePrincipale v, Compte c, Cantine cantine) {
		compte = c;
		mainView = v;
		controle = new controleReservation(this, c, mainView, cantine);
	
		mainView.setTitle("Réservations");

		onglet_1.setPreferredSize(new Dimension(675, 650));
		onglet_2.setPreferredSize(new Dimension(675, 650));

		b1.setName("retour");
		b1.addActionListener(controle);
		b1.setBackground(Color.WHITE);
        b1.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		b2.setName("retour");
		b2.addActionListener(controle);
		b2.setBackground(Color.WHITE);
        b2.setUI(new javax.swing.plaf.basic.BasicButtonUI());


		/* Onglet 1 */
		GridBagLayout gbl_1 = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc_1 = new GridBagConstraints();//pour définir des contraintes 
		gbc_1.fill = GridBagConstraints.BOTH;
		gbc_1.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl_1.columnWidths = new int[]{325,325};
		gbl_1.rowHeights = new int[]{100,290,75,75};
		onglet_1.setLayout(gbl_1);

		JPanel panel_1 = new JPanel();
		enfant = new JComboBox<Enfant>(compte.getEnfants());
		panel_1.add(enfant);
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		panel_1.add(textField);
		
		btn_popup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_popup.setName("popup");
		btn_popup.addActionListener(controle);
		btn_popup.setBackground(Color.WHITE);
        btn_popup.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		panel_1.add(btn_popup);
		
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_add.setName("add");
		btn_add.addActionListener(controle);
		btn_add.setBackground(Color.WHITE);
        btn_add.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		panel_1.add(btn_add);

		gbc_1.gridx = 0;
		gbc_1.gridy = 0;
		gbc_1.gridwidth = 2;
		onglet_1.add(panel_1, gbc_1);
		
		JScrollPane scrollablePane=new JScrollPane();
		scrollablePane.setViewportView(dates);
        scrollablePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollablePane.setPreferredSize(new Dimension(675, 290));
		gbc_1.gridx = 0;
		gbc_1.gridy = 1;
		onglet_1.add(scrollablePane, gbc_1);
		
		
		
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
		btn_ajouter.addActionListener(controle);
		btn_ajouter.setBackground(Color.WHITE);
        btn_ajouter.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		gbc_1.fill = GridBagConstraints.NONE;
		gbc_1.gridx = 1;
		gbc_1.gridy = 2;
		gbc_1.gridwidth = 1;
		onglet_1.add(btn_ajouter, gbc_1);
		
		btn_supp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_supp.setName("supprimer");
		btn_supp.addActionListener(controle);
		btn_supp.setBackground(Color.WHITE);
        btn_supp.setUI(new javax.swing.plaf.basic.BasicButtonUI());
		gbc_1.gridx = 0;
		gbc_1.gridy = 2;
		onglet_1.add(btn_supp, gbc_1);
		gbc_1.gridx = 0;
		gbc_1.gridy = 3;
		gbc_1.gridwidth = 2;
		onglet_1.add(b1, gbc_1);
		
		/* Onglet 2 */
		GridBagLayout gbl_2 = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc_2 = new GridBagConstraints();//pour définir des contraintes 
		gbc_2.fill = GridBagConstraints.BOTH;
		gbc_2.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl_2.columnWidths = new int[]{650};
		gbl_2.rowHeights = new int[]{450,100};
		onglet_2.setLayout(gbl_2);
		
		// Ajout du scrollPane pour afficher les réservations
		gbc_2.gridx = 0;
		gbc_2.gridy = 0;
		JScrollPane scrollablePane2=new JScrollPane();
		resa = new JList<Reservation>(compte.getResa());
		scrollablePane2.setViewportView(resa);
        scrollablePane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollablePane2.setPreferredSize(new Dimension(650, 450));
        onglet_2.add(scrollablePane2, gbc_2);

		// Ajout du bouton retour 
		gbc_2.fill = GridBagConstraints.NONE;
		gbc_2.gridx = 0;
		gbc_2.gridy = 1;
		onglet_2.add(b2, gbc_2);
		
		pan.add(onglets);
		
		
		add(pan);
		onglets.addTab("Ajouter une reservation", onglet_1);
        onglets.addTab("Voir mes réservations", onglet_2);
	}
	
	public void showResa(){
		model_resa = new DefaultListModel<Reservation>();
		Vector<Reservation> reservation = compte.getResa();
		for(Reservation r : reservation){
			model_resa.addElement(r);
		}
		resa.setModel(model_resa);
	}

	public void deleteDate(int i){
		model.remove(i);
		
	}

	public void deleteAllDate(){
		model.removeAllElements();
	}

	public void addDate(String s) {
		model.addElement(s);
		this.clearText();
		this.validate();
	}
	
	public String getText() {
		return textField.getText();
	}
	
	public void setText(String s) {
		textField.setText(s);
	}
	
	public void clearText() {
		textField.setText("");
	}
	
	public boolean isWrite(String d){
		ArrayList<String> date_list = getReservation();
		for(String date:date_list){
			if(date.equals(d)){
				return true;
			}
		}
		return false;
	}

	public ArrayList<String> getReservation() {
		ArrayList<String> date_list = new ArrayList<String>();
		ListModel<String> m = dates.getModel();
		for(int i=0; i < m.getSize(); i++){
			 date_list.add((String)m.getElementAt(i));  
	    }
		return date_list;
	}

	public Enfant getEnfant(){
		return (Enfant)enfant.getSelectedItem();
	}

	public int[] getSelectedDates(){
		return dates.getSelectedIndices();
	}
}
