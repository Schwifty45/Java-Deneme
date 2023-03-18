package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxKullanimi {
    public static void main(String[] args) {
        JFrame f = new JFrame ( "CheckBox örneği");
        JCheckBox cbox1, cbox2, cbox3;
        JButton btn1;
        JLabel lbl1;

        lbl1 = new JLabel();
        lbl1.setBounds(10 ,85, 200,75);
        //lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setVerticalAlignment(JLabel.CENTER);

        cbox3 = new JCheckBox("Seçim Yapın.");
        cbox3.setBounds(10,150,150,25);
        cbox3.addItemListener(new ItemListener() { //CheckBox Seçildiğinde olacak olan.
            @Override
            public void itemStateChanged(ItemEvent e) {
                    lbl1.setText("Seçim "+(e.getStateChange()==1? "Yapıldı" : "Yapılmadı" ));
            }
        });

        cbox1 = new JCheckBox("Okudum anladım.*");
        cbox1.setBounds(10,10,150,25);

        cbox2 = new JCheckBox("Bülten Kayıt.");
        cbox2.setBounds(10,35,150,25);

        btn1 = new JButton("Kontrol");
        btn1.setBounds(15,60,90,25);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (!cbox1.isSelected()){
                lbl1.setText("Zorunlu alanı seçmediniz!!");
            } else if (cbox2.isSelected()) {
                lbl1.setText("<html>Başarılı bir şekilde kayıt oldunuz.<br>Bültenden çıkmak için info@asd.com adresine mail atınız.</html>");
            } else {
                lbl1.setText("Başarılı bir şekilde kaydoldunuz");
            }
            }
        });

        f.add(cbox3);
        f.add(lbl1);
        f.add(cbox1);
        f.add(cbox2);
        f.add(btn1);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
