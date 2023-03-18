package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "PasswordField örneği");
        JLabel l1;
        JButton bttn;
        JPasswordField p;

        p = new JPasswordField();
        p.setBounds(20,50,150,30);

        l1 = new JLabel("Şifre: ");
        l1.setBounds(20,20,150,30);


        bttn = new JButton("Şifreyi Gör");
        bttn.setBounds(70,90,100,30);
        bttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(p.getPassword());
                l1.setText(l1.getText() + password);
            }
        });


        f.add(l1);
        f.add(bttn);
        f.add(p);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}