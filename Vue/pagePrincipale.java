package Vue;
import javax.swing.JFrame;


public class pageAccueil extends JFrame {
	
	public pageAccueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		
		getContentPane().add(new accueilStart(this));
		setVisible(true);
		
	}

}
