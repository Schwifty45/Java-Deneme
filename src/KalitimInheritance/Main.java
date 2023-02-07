package KalitimInheritance;

public class Main {
    public static void main(String[] args){

        Calisan w1 = new Calisan("Halis","halis@gmail.com","+905347894563");
        Akademisyen a1 = new Ogretmen("Fuat","fuat@outlook.com","+90535465789","Kimya","Fiziko","Fiziko 101", "Doc. Dr.");
        Security s1 = new Security("Özkan","ozkan@ymail.com","+905327894563","Rektörlük",48,"B2");
        Calisan c1 = new Asistan("Faruk","faruk@outlook.com","+905354678920","Biyoloji","Anatomi","Anatomi","Yaptı");
        //c1 değişkeni Calışandan türetildi ama akademisyen gibi davranacak. bkz. Polymorphism.
        Calisan c2 = new Ogretmen("Betül","betul@outlook.com","+905357658920","Biyoloji","Öğretmen","Evolotion","Arg.");

        Calisan[] girisListesi = {w1, a1, s1, c1, c2};

        //System.out.println(a1.getName());
        //System.out.println(a1.giris());
        //System.out.println(s1.giris());
        //System.out.println(w1.giris());
        //System.out.println(c1.giris());
        //Calisan.girislistele(girisListesi);
        ((Ogretmen) c2).classattent(10);
    }
}
