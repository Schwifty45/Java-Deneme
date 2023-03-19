package GUI;

import javax.swing.*;

public class JTableKullanimi {
    public static void main(String[] args) {

        //Multidimensional array ile yapılır.

        JFrame f = new JFrame ( "Table örneği");
        JTable tbl = new JTable();
        tbl.setBounds(20 ,20, 175,25);



        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
