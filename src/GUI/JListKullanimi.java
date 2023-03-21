package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListKullanimi {
    public static void main(String[] args) {

        JFrame f = new JFrame ( "List örneği");
        JButton btn1, btn2;
        JLabel lbl1,lbl2;

        lbl1 = new JLabel();
        lbl1.setBounds(150,30,100,100);

        lbl2 = new JLabel();
        lbl2.setBounds(150,200,100,100);

        DefaultListModel<String > l1 = new DefaultListModel<>();
        l1.addElement("Kuzey");
        l1.addElement("Güney");
        l1.addElement("Batı");
        l1.addElement("Doğu");

        JList<String> liste1 = new JList<>(l1);
        liste1.setBounds(30,30,100,150);

        DefaultListModel<String> l2 = new DefaultListModel<>();
        l2.addElement("North");
        l2.addElement("South");
        l2.addElement("West");
        l2.addElement("East");

        JList<String> liste2 = new JList<>(l2);
        liste2.setBounds(30,200,100,150);

        btn1 = new JButton("Seçimi Göster");
        btn1.setBounds(150,30,125,30);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl1.setText("lbl1");
            }
        });

        btn2 = new JButton("Show Selected");
        btn2.setBounds(150,200,125,30);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl2.setText("lbl2");
            }
        });


        f.add(liste1);
        f.add(liste2);
        f.add(lbl1);
        f.add(lbl2);
        f.add(btn1);
        f.add(btn2);
        f.setSize (800, 600);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
