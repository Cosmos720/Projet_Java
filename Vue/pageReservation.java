package Vue;

import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.border.EmptyBorder;

public class pageReservation extends JFrame {
	private controleReservation controle;
	
	private JTextField textField = new JTextField();
	private JButton btn_popup = new JButton("...");
	private JPanel panel_date = new JPanel();
	private JButton btn_ajouter = new JButton("Ajouter reservation");
	private JButton btn_add = new JButton("+");
	private JComboBox<Enfant> enfant;

	private JTabbedPane onglets=new JTabbedPane(SwingConstants.TOP);
	private JPanel pan = new JPanel();

	private GridBagLayout gbl = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private JPanel panel_resa = new JPanel();

	private Compte compte;

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
		panel_date.setLayout(new GridLayout(0, 1, 0, 0));
		
	
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
		btn_ajouter.addActionListener(controle);
		onglet_1.add(btn_ajouter);
		

		/* Onglet 2 */
		JPanel onglet_2 = new JPanel();
		

		onglet_2.setLayout(new BoxLayout(onglet_2, BoxLayout.Y_AXIS));
		onglet_2.setBorder(new EmptyBorder(20, 50, 20, 50));
		
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);

		gbl.columnWidths = new int[]{100,100};
		panel_resa.setLayout(gbl);

        panel_resa.setLayout(new GridLayout(0,1,0,0));
        
        this.showResa();

		onglet_2.add(panel_resa);

		onglet_1.setPreferredSize(new Dimension(575, 300));
		onglet_1.setPreferredSize(new Dimension(575, 300));

		pan.add(onglets);
		getContentPane().add(pan);

		onglets.addTab("Ajouter une reservation", onglet_1);
        onglets.addTab("Voir mes réservations", onglet_2);
		setBounds(750,300,600,375);
		setVisible(true);
		setResizable(false);
	}
	
	public void showResa(){
		panel_resa.removeAll();
		Vector<Enfant> enfants = compte.getEnfants();
        if(enfants.size() > 0 ){
			Vector<Reservation> resa = compte.getResa();
            for(Enfant e : enfants){
				gbc.gridx = 1;
                panel_resa.add(new JLabel(e.toString()));
				for(Reservation r : resa){
					gbc.gridx = 2;
					panel_resa.add(new JLabel(r.getDate_reservation()));
				}
            }
        }else{
			panel_resa.add(new JLabel("Vous n'avez pas d'enfants inscrit"));
		}
	}

	public void deleteDate(){
		panel_date.removeAll();
	}

	public void addDate(String s) {
		JLabel l = new JLabel(s);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		panel_date.add(l);
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
		ArrayList<String> dates = new ArrayList<String>();
		for (Component label : panel_date.getComponents()) {
		    if ( label instanceof JLabel ) {
		    	dates.add(((JLabel) label).getText());
		    }
		}
		return dates;
	}

	public String getName(){
		return ((Enfant)enfant.getSelectedItem()).toString();
	}
}
