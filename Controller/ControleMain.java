package Controller;
import java.awt.event.*;
import javax.swing.*;

import Vue.*;
import Model.*;

public class ControleMain implements ActionListener {
    private pageAccueil mainView;
    private Compte compte;
    private Cantine cantine;

    public ControleMain(pageAccueil v, Compte c, Cantine ca){
        mainView = v;
        compte = c;
        cantine = ca;
    }

    public int getSolde(){
       return compte.getSolde();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed=((JButton)e.getSource());

		if(pressed.getName() == "Se deconnecter") {
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new accueilStart(mainView, cantine));
			mainView.validate();
        }else if(pressed.getName() == "compte"){
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new pageCompte(mainView, compte, cantine));
			mainView.validate();
        }else if(pressed.getName() == "reservation"){
            new pageReservation();
        }

    }
    
}
