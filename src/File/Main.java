package File;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.Random;

public class Main {
        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int PASSPORT_LENGTH = 8;
    public static String generatePassport() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < PASSPORT_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
    public static void main(String [] args) throws IOException {
/*-------------------Oluşan dosyanın yerini değiştirme------------------
        File file = new File("F:\\Code\\MethodDeneme\\kod.txt"); // önceki dosya yolu
        File yeniDizin = new File("F:\\Code\\MethodDeneme\\src\\File\\kod.txt"); // yeni dosya yolu
        file.renameTo(yeniDizin);
/-------------------------------------------------------------------------*/
        File file = new File("F:\\Code\\MethodDeneme\\src\\File\\kod.txt");
if (!file.exists()){
    file.createNewFile();
}
        String value = generatePassport();

FileWriter fwriter = new FileWriter(file, false); // file dosyasının yazılabilip veya okunabilir olup olmadığını sorgulamada işimize yarayan kısım
BufferedWriter bwriter = new BufferedWriter(fwriter); // FileWriter yazarken byte byte işlem yapıyor, BufferedWriter arada tampon görevi yapıp işimizi hızlandıran görev üstleniyor. BufferedWriter işlem hızlandırır.
        bwriter.write("Your Passport is: " + value);
        bwriter.close(); // BufferedWriter kapatmadan yazmaz.

FileReader freader =new FileReader(file);
String line;
BufferedReader breader = new BufferedReader(freader);
while ((line = breader.readLine()) != null){
    System.out.println(line);
}
breader.close();// bellekte yer kaplamasın diye kapatıyoruz.
        }
    }