package Method;

public class AccessModifiers {
         private String Color = "RED";     // Sadece aynı class ta erişilebilir.
          public int day = 7;              // Tüm sınıflar erişebilir.
       protected int month = 12;           // Alt paketler ve sınıflar erişebilir.
    /*<defauld>*/int year = 2023;          // Aynı pakettekiler erişebilir, protected a yakın.
    private void print() {
        System.out.println(Color + day + month + year);
    }
    public void run(){
        print();
    }
}
