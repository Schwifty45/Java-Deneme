package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JTextAreaKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "TextArea örneği");
        JLabel l1,l2;
        JTextArea area;
        JButton bttn;

        l1 = new JLabel("Kelime:   ");
        l1.setBounds(30,20,100,25);

        l2 = new JLabel("Karakter:   ");
        l2.setBounds(150,20,100,25);

        area = new JTextArea();
        area.setBounds(30,50,195,150);
        area.setLineWrap(true); //kelime sınırını aşarsanız otomatik olarak satır atlama işlemini gerçekleştirir.
        area.setWrapStyleWord(true);//otomatik satır atlama işlemini kelime sınırında gerçekleştirir.
        //area.setEditable(false); // bileşeninin düzenlenemez hale getirir.

        while (area.getText().isEmpty()) {
            area.append("Yazınız.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            area.setText("Yazınız..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            area.setText("Yazınız...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        bttn = new JButton("Calculate");
        bttn.setBounds(125,200,90,25);
        bttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                String words[] = text.split("\\s");
                l1.setText("Kelime; "+words.length);
                l2.setText("Karakter: "+ text.length());
            }
        });
        area.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                area.setText(" "); // TextArea'yı temizle
                area.removeKeyListener(this); // KeyListener'ı kaldır. Kaldırılmadığı durumda sadece bir harf yazılabilir.
            }
        });

        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(bttn);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}