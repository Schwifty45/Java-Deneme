package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "OptionPane örneği");
       // JOptionPane.showMessageDialog(f , "Uyarı!!");
        //JOptionPane. showMessageDialog (f, "Abone oldun", "Abone Ol", JOptionPane . WARNING_MESSAGE) ;
        String str = JOptionPane.showInputDialog(f, "Adınız");
        System.out.println("Adı = " + str);



        JButton btn1 = new JButton("Buton");
        btn1.setBounds(0,0,75,25);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        f.setSize (800, 600);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
