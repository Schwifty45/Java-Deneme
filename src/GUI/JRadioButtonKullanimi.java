package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "RadioButton örneği");
        JRadioButton rbtn1, rbtn2, rbtn3;
        JButton btn1;

        rbtn1 = new JRadioButton("Kadın");
        rbtn1.setBounds(20 ,20, 175,25);
        rbtn1.setActionCommand("K");
        rbtn2 = new JRadioButton("Erkek");
        rbtn2.setBounds(20 ,50, 175,25);
        rbtn2.setActionCommand("E");
        rbtn3 = new JRadioButton("Belirtmek İstemiyorum", true);
        rbtn3.setActionCommand("N");
        rbtn3.setBounds(20 ,80, 175,25);
            ButtonGroup bg = new ButtonGroup();
            bg.add(rbtn1);
            bg.add(rbtn2);
            bg.add(rbtn3);

        btn1 = new JButton("Gönder");
        btn1.setBounds(45 ,110, 150,25);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.printf(bg.getSelection().getActionCommand()); //ActionCommand ile her seçime anahtar harf verilir. Böylece tüm cümle görülmez.
            }
        });


        f.add(rbtn1);
        f.add(rbtn2);
        f.add(rbtn3);
        f.add(btn1);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
