package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelVEJButtonKullanimi {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        //JPanel panel = new JPanel();

        JButton button = new JButton("Buton");
        /*frame.getContentPane().add(button); */// Paneli tüm panelin içine sığdırı.
        button.setBounds(0,0,75,25); // button.setBounds(x,y,width,height);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Butona tıklandı.");
            }
        });

        /*--------------------------------------------------------------------------------------
                    Her zaman için kodun sonuna yaz sorun oluşabilir                                            */
        frame.add(button);
        frame.setSize(200, 200); //Panelin boyutu atanır.
        frame.setLayout(null);
        frame.setVisible(true); // Görünür olması için yazılır.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kapatınca program durur.
        /*----------------------------------------------------------------------------------------*/

    }
}