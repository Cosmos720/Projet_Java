package Vue;
import javax.swing.JFrame;

import Model.*;


public class pagePrincipale extends JFrame {
	
	public pagePrincipale(Cantine cantine) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 700, 700);
		
		getContentPane().add(new accueilStart(this,cantine));
		setVisible(true);
		setResizable(false);
		setTitle("Accueil");
	}

}
