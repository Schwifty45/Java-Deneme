package GUI;

import javax.swing.*;
import java.awt.*;

public class JTableKullanimi {
    public static void main(String[] args) {

        //Multidimensional array ile yapılır.

        JFrame f = new JFrame ( "Table örneği");
        String data[][] = {
                {"1","Mat","90"},
                {"2","Fen","100"},
                {"3","Tur","75"}
        };
        String title[]={"ID","Ders","Not"};

        JTable tbl = new JTable(data,title);
        tbl.setBounds(20 ,20, 200,250);

        JScrollPane sp = new JScrollPane(tbl); //Scroll cubuğuna ekleyip daha sonrasında tabloyu değil direk sp yi ekle. Böylece title görünür olcak.


        f.add(sp);
        f.setSize (400, 400);
        //f.setLayout (null); //JScrollPane sınıfında boş "null" olarak kulanılamaz.
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
