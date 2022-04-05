package Controller;
import java.awt.event.*;
import javax.swing.*;

import Vue.*;
import Model.*;

public class ControleMain implements ActionListener {
    private pageAccueil mainView;
    private Compte compte;

    public ControleMain(pageAccueil v ){
        mainView = v;
        compte = new Compte(1, "a", 10, null, null);
        
    }

    public int getSolde(){
       return compte.getSolde();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed=((JButton)e.getSource());

		if(pressed.getName() == "Se deconnecter") {
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new pageAccueil());
			mainView.validate();
        }else if(pressed.getName() == "compte"){
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new pageCompte(mainView));
			mainView.validate();
        }else if(pressed.getName() == "reservation"){
            new pageReservation();
        }

    }
    
}
