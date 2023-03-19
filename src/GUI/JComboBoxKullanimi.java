package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "ComboBox örneği");
        JButton btn1;
        String kode[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        JComboBox cb = new JComboBox(kode);
        cb.setBounds(50, 100, 100, 25);

        btn1 = new JButton("Send");
        btn1.setBounds(50 ,125, 100,25);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = "Selected day: " + cb.getSelectedItem();
                //String txt = "Selected day: " + cb.getIemAt(cb.getSelectedIndex()); //getItemAt komutu ne olursa olsun parantez içindeki indextekinin çıkışını yapar.
                System.out.println(txt);
            }
        });

        f.add(cb);
        f.add(btn1);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
