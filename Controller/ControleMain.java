package Controller;
import java.awt.event.*;
import javax.swing.*;

import Vue.*;
import Model.*;

public class ControleMain implements ActionListener {
    private pagePrincipale mainView;
    private Compte compte;
    private Cantine cantine;

    public ControleMain(pagePrincipale v, Compte c, Cantine cantine){
        mainView = v;
        compte = c;
        this.cantine = cantine;
    }

    public double getSolde(){
       return compte.getSolde();
    }
    public double getPrixRepas(){
        return compte.getuser().getQuotient().getTotal();
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
            mainView.getContentPane().removeAll();
            mainView.getContentPane().add(new pageReservation(mainView, compte, cantine));
			mainView.validate();
        }

    }
    
}
