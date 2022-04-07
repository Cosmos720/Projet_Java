package Vue;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import Controller.*;
import Model.*;

public class pageAjouterArgent extends JFrame {
	private JTextField textField = new JTextField();
	private JButton btn_ajouter = new JButton("Ajouter");

    private controleAjtArgent controle;

	public pageAjouterArgent(Compte c) {
		/**
        * Oblige l'utilisateur de mettre uniquement des chiffres dans un FormatedTextField donné
        */
        KeyAdapter Digit=new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        };
        controle = new controleAjtArgent(this,c);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Créditer");
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(20, 75, 75, 75));
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 1, 0, 50));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
        // Ajouter label valeur
		JLabel lblValeurenEuro = new JLabel("Valeur (en euro)");
		lblValeurenEuro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblValeurenEuro);
		
		// Ajouter textfield
		textField.addKeyListener(Digit);
		panel_1.add(textField);
		
		// Ajouter le bouton "Ajouter"
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
        btn_ajouter.addActionListener(controle);
		panel.add(btn_ajouter);

		setBounds(650, 100, 700, 700);
		setVisible(true);
		setResizable(false);
	}

    public double getValeur(){
		if(textField.getText().length() > 0){
        	return (double)Integer.parseInt(textField.getText());
		}
		return 0;
    }

}
