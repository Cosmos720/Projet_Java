package Controller;
import java.awt.event.*;
import javax.swing.*;

import Vue.*;

public class ControleMain implements ActionListener {
    private pageAccueil mainView;

    public ControleMain(pageAccueil v ){
        mainView = v;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed=((JButton)e.getSource());

		if(pressed.getName() == "Se deconnecter") {
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new accueilStart(mainView));
			mainView.validate();
        }

    }
    
}
