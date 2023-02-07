package TryCatch;

public class Try {
    public static void main(String [] args){
        System.out.println("Start");
        int a = 0;
        try {
                a = 2/0;
                System.out.println("Try Part");
        }catch (Exception err) {
            System.out.println(err.toString());
        } finally {
            System.out.println("finally part."); // her türlü çalışır hata olsada olmasada.
        }
        System.out.println(a); // a default olarak sıfır olduğundan 0 olarak çıkar.
        System.out.println("End");
    }
}
