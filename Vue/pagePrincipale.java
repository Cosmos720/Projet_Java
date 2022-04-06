package Vue;
import javax.swing.JFrame;


public class pagePrincipale extends JFrame {
	
	public pagePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		
		getContentPane().add(new accueilStart(this));
		setVisible(true);
		
	}

}
