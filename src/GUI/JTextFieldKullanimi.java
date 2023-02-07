package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "TextField örneği");
        JLabel l1, l2, l3;
        JTextField t1, t2, t3;
        JButton b1;

        l1 = new JLabel("İlk Sayı");
        l1.setBounds(10,10, 100, 25);

        t1 = new JTextField();
        t1.setBounds(10,40, 100, 25);


        l2 = new JLabel("İkinci Sayı");
        l2.setBounds(120,10, 100, 25);

        t2 = new JTextField();
        t2.setBounds(120,40, 100, 25);


        l3 = new JLabel("Sonuç");
        l3.setBounds(10,80, 100, 25);

        t3 = new JTextField();
        t3.setBounds(10,100, 100, 25);
        t3.setEditable(false); // Değiştirmeyi kapatmak için kullanılır.


        b1 = new JButton("Topla");
        b1.setBounds(120,100, 100, 25);

        b1.addActionListener(new ActionListener() {
            int toplam = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                String total = String.valueOf(c);
                t3.setText(total);
            }
        });


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
