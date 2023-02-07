package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelKullanimi {
    public static void main(String[] args) {
        String yazi = "Yazı Örneği";
        JFrame f = new JFrame ( "Label örneği");
        JLabel lbl =new JLabel();
        lbl.setText(yazi);
        lbl.setBounds(100,50,200,50);

        JButton btn = new JButton("Sayaç");
        btn.setBounds(115,100,70,25);

        btn.addActionListener(new ActionListener(){
            int i = 0;
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         i++; // increment the counter
                                         String cikti = String.format("Butona %d kere tıklandı", i); // %d olan yer ile i değişir.
                                         lbl.setText(cikti);
                                     }
                                 });
        f.add(btn);
        f.add(lbl);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}