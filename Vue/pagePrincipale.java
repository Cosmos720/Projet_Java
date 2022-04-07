package Vue;
import javax.swing.JFrame;


public class pagePrincipale extends JFrame {
	
	public pagePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 700, 700);
		
		getContentPane().add(new accueilStart(this));
		setVisible(true);
		setResizable(false);
		setTitle("Accueil");
	}

}
