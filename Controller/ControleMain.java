package Controller;
import java.awt.event.*;
import javax.swing.*;

import Vue.*;
import Model.*;

public class ControleMain implements ActionListener {
    private pagePrincipale mainView;
    private Compte compte;

    public ControleMain(pagePrincipale v, Compte c){
        mainView = v;
        compte = c;
    }

    public double getSolde(){
        System.out.println("b");
       return compte.getSolde();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed=((JButton)e.getSource());

		if(pressed.getName() == "Se deconnecter") {
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new accueilStart(mainView));
			mainView.validate();
        }else if(pressed.getName() == "compte"){
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new pageCompte(mainView, compte));
			mainView.validate();
        }else if(pressed.getName() == "reservation"){
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new pageReservation(mainView, compte));
			mainView.validate();
        }

    }
    
}
