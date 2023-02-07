package Thread;

public class Main {
    public static void main(String [] args){

Islemler i1 = new Islemler("First");
Thread t1 = new Thread(i1);

Islemler i2 = new Islemler("Last");
Thread t2 = new Thread(i2);
t1.start(); // Çıktı birinci ikinci sayılar olmak üzere karışık çıktı verir.
t2.start();
    }
}
