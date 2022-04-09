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

	public pageAjouterArgent(Compte c, Cantine cantine) {
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
		
		
		GridBagLayout gbl = new GridBagLayout(); //c'est le gestionnaire de placement en grid pour placer les objets sur une grille
		GridBagConstraints gbc = new GridBagConstraints();//pour définir des contraintes 
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);

		//definition des colonnes et lignes
		gbl.columnWidths = new int[]{100,100,100};
		gbl.rowHeights = new int[]{75,50,100};
		JPanel panel = new JPanel();
		panel.setLayout(gbl);
		
        // Ajouter label valeur
		JLabel lblValeurenEuro = new JLabel("Valeur (en euro)");
		lblValeurenEuro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(lblValeurenEuro, gbc);
		
		// Ajouter textfield
		textField.addKeyListener(Digit);
		gbc.gridx = 2;
		gbc.gridy = 0;
		panel.add(textField, gbc);
		
		// Ajouter le bouton "Ajouter"
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
        btn_ajouter.addActionListener(controle);
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(btn_ajouter, gbc);

		getContentPane().add(panel);
		setBounds(650, 100, 400,400);
		setVisible(true);
		setResizable(false);
	}

    public double getValeur(){
		if(textField.getText().equals("")){
        	return -1;
		}
		return (double)Integer.parseInt(textField.getText());
    }

}
