package Vue;

import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.EmptyBorder;

public class pageReservation extends JFrame {
	private controleReservation controle;
	private Compte compte;
	
	/* 
		ONGLET 1
							*/
	private JTextField textField = new JTextField();
	private JButton btn_popup = new JButton("...");
	private JPanel panel_date = new JPanel();
	private DefaultListModel<String> model = new DefaultListModel<>();
	private JList<String> dates = new JList<>(model);
	private JButton btn_ajouter = new JButton("Ajouter reservation");
	private JButton btn_add = new JButton("+");
	private JComboBox<Enfant> enfant;

	private JTabbedPane onglets=new JTabbedPane(SwingConstants.TOP);
	private JPanel pan = new JPanel();

	/*
			ONGLET 2
								*/

	private JPanel panel_resa = new JPanel();
	private DefaultListModel<Reservation> model_resa;
	private JList<Reservation> resa;


	

	public pageReservation(Compte c) {
		compte = c;
		controle = new controleReservation(this, c);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(575, 500);
		setTitle("Réservations");
		
		

		/* Onglet 1 */
		JPanel onglet_1 = new JPanel();
		JPanel panel_1 = new JPanel();
		onglet_1.setLayout(new BoxLayout(onglet_1, BoxLayout.Y_AXIS));
		onglet_1.setBorder(new EmptyBorder(20, 50, 20, 50));
		
		enfant = new JComboBox<Enfant>(compte.getEnfants());
		panel_1.add(enfant);
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		panel_1.add(textField);
		
		btn_popup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_popup.setName("popup");
		btn_popup.addActionListener(controle);
		panel_1.add(btn_popup);
		
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_add.setName("add");
		btn_add.addActionListener(controle);
		panel_1.add(btn_add);
		
		onglet_1.add(panel_1);
		onglet_1.add(panel_date);
		panel_date.setLayout(new BoxLayout(panel_date, BoxLayout.Y_AXIS));
		JScrollPane scrollablePane=new JScrollPane();
		scrollablePane.setViewportView(dates);
        scrollablePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollablePane.setPreferredSize(new Dimension(575, 290));
        panel_date.add(scrollablePane);
	
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
		btn_ajouter.addActionListener(controle);
		onglet_1.add(btn_ajouter);
		

		/* Onglet 2 */
		JPanel onglet_2 = new JPanel();
		JScrollPane scrollablePane2=new JScrollPane();
		resa = new JList<Reservation>(compte.getResa());
		scrollablePane2.setViewportView(resa);
        scrollablePane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollablePane2.setPreferredSize(new Dimension(575, 290));
        panel_resa.add(scrollablePane2);

        onglet_2.add(panel_resa);
        
        

		onglet_1.setPreferredSize(new Dimension(575, 300));
		onglet_2.setPreferredSize(new Dimension(575, 300));

		pan.add(onglets);
		getContentPane().add(pan);

		onglets.addTab("Ajouter une reservation", onglet_1);
        onglets.addTab("Voir mes réservations", onglet_2);
		setBounds(750,300,600,375);
		setVisible(true);
		setResizable(false);
	}
	
	public void showResa(){
		model_resa = new DefaultListModel<Reservation>();
		Vector<Reservation> reservation = compte.getResa();
		for(Reservation r : reservation){
			model_resa.addElement(r);
		}
		resa.setModel(model_resa);
	}

	public void deleteDate(){
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
	
	public ArrayList<String> getReservation() {
		ArrayList<String> date_list = new ArrayList<String>();
		ListModel m = dates.getModel();
		for(int i=0; i < m.getSize(); i++){
			 date_list.add((String)m.getElementAt(i));  
	    }
		return date_list;
	}

	public String getName(){
		return ((Enfant)enfant.getSelectedItem()).toString();
	}
}
