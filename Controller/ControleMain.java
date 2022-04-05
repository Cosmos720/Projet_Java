package Controller;
import java.awt.event.*;
import javax.swing.*;

import Vue.*;

public class ControleMain implements ActionListener {

    private pageAccueil pageAcceuil;
    private pageMain pageMain;
    private ControleMain controleMain;
    private pageMain mainView;

    public void actionRetour(){
        this.controleMain.goAccueil();
    }

    public ControleMain(pageMain v ){
        mainView = v;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed=((JButton)e.getSource());

		if(pressed.getName() == "se deconnecter") {
        mainView.actionRetour();
        }

    }

    public void goAccueil(){
        this.pageAcceuil.setVisible(true);
        this.pageMain.setVisible(false);
    }
    
}
