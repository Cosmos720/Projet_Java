package Vue;

import Model.*;
import Controller.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class pageCompte extends JPanel{

    private JButton btn_argent = new JButton("Créditer mon compte");
    private JButton btn_enfant = new JButton("Inscrire mon enfant");
    private JButton btn_back = new JButton("Retour");

    private controleCompte controle;
    private pagePrincipale mainView;

    public pageCompte(pagePrincipale v, Compte c, Cantine cantine){
        mainView = v;
        mainView.setTitle("Gestion du compte");
        controle = new controleCompte(mainView,c, cantine);
        setBorder(new EmptyBorder(50, 80, 50, 80));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1,0,50));
        

        btn_argent.setName("argent");
        btn_argent.addActionListener(controle);
        panel.add(btn_argent);

        btn_enfant.setName("enfant");
        btn_enfant.addActionListener(controle);
        panel.add(btn_enfant);
        add(panel);

        Component verticalStrut = Box.createVerticalStrut(50);
        add(verticalStrut);

        btn_back.setName("back");
        btn_back.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn_back.addActionListener(controle);
        add(btn_back);
    }
}
