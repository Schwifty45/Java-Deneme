package GUI;

import javax.swing.*;

public class JListKullanimi {
    public static void main(String[] args) {

        JFrame f = new JFrame ( "List örneği");

        DefaultListModel<String > l1 = new DefaultListModel<>();
        l1.addElement("Kuzey");
        l1.addElement("Güney");
        l1.addElement("Batı");
        l1.addElement("Doğu");

        JList<String> liste1 = new JList<>(l1);
        liste1.setBounds(100,100,75,75);

        DefaultListModel<String> l2 = new DefaultListModel<>();
        l1.addElement("North");
        l1.addElement("South");
        l1.addElement("West");
        l1.addElement("East");

        JList<String> liste2 = new JList<>(l2);
        liste2.setBounds(100,200,75,75);

        f.add(liste1);
        f.add(liste2);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
