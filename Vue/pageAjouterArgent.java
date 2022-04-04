package Vue;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import Controller.*;

public class pageAjouterArgent extends JFrame {
	private JTextField textField = new JTextField();
	private JButton btn_ajouter = new JButton("Ajouter");

    private controleAjtArgent controle;

	public pageAjouterArgent(controleAjtArgent ctl) {
        controle = ctl;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		panel_1.add(textField);
		
		// Ajouter le bouton "Ajouter"
		btn_ajouter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_ajouter.setName("ajouter");
        btn_ajouter.addActionListener(controle);
		panel.add(btn_ajouter);
	}

    public String getValeur(){
        return textField.getText();
    }

}
