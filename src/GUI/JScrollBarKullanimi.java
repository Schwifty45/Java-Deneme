package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JScrollBarKullanimi {
    private static final String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789/!?*-_.";
    private static final int length = 300;

    public static String generateText() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(character.length());
            char randomChar = character.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String value = generateText();

        JFrame f = new JFrame("ScrollBar örneği");


        //Text Areaya Bounds atanmadı. JTextArea ve JScrollPane'in birbirine bağlandı.
        JTextArea textArea = new JTextArea(value);
        textArea.setFont(new Font("Arial", Font.PLAIN, 24)); // Font Ayarı
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL);//Dikey bar olduğu belirlendi.
        scrollPane.setVerticalScrollBar(scrollBar);

        scrollPane.setBounds(30, 30, 200, 150);
        scrollBar.setBounds(230, 30, 50, 150);

        f.add(scrollPane);
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}