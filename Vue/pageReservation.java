package Vue;

import Controller.*;
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
	
	
	public pageReservation() {
		super();
		controle = new controleReservation(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		
		panel_1.setBorder(new EmptyBorder(20, 50, 20, 50));
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		panel_1.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		getContentPane().add(panel_1);
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		panel.add(textField);
		
		btn_popup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_popup.setName("popup");
		btn_popup.addActionListener(controle);
		panel.add(btn_popup);
		
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_add.setName("add");
		btn_add.addActionListener(controle);
		panel.add(btn_add);
		
		panel_1.add(panel_date);
		panel_date.setLayout(new GridLayout(0, 1, 0, 0));
		
	
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
		btn_ajouter.addActionListener(controle);
		panel_1.add(btn_ajouter);
		
		setVisible(true);
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
}
