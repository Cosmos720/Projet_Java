package Vue;
import javax.swing.JFrame;
import Model.*;

public class pageAccueil extends JFrame {
	
	public pageAccueil(Cantine c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		
		getContentPane().add(new accueilStart(this,c));
		setVisible(true);
		
	}

}
