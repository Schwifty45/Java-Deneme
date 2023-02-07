package NestedClass;

public class Main {
    public static void main(String[] args){
    NonStatic n = new NonStatic();
    NonStatic.Inner inner = n.new Inner(); //n inner dan nesne üretilbilmesi için önce nonstatik ten nesne ürettim.
    //inner.run();
/*--------------------------------------------------------------------*/
    Static.Inner s = new Static.Inner();
    //s.run();
/*-------------------------------------------------------------------*/
    Local l = new Local();
    //l.run();
/*--------------------------------------------------------------------*/
    Anonymous a = new Anonymous() {
        public void run(){
         System.out.println("Anonymous Sınıfına Ait Çalıştır Metodu");
         //Anonymous Sınıfı bu şekilde yapılıyor basitçe override ediliyor.
         // Interface ler de kullanılabilir.
         //Bazı durumlarda çalıştır metodu override edilmesi gerekebiliyor o gibi durumlarda anonymous sınıfı kullanılır.
        }
    };
    a.run();
    /*---------------------------------------------------------------------*/
}
}