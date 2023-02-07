package EncapsulationGetterSetter;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", 400, "Rowling", "Kodlama Vakti ");
        b1.setNumberOfPage(500);
        System.out.println(b1.getNumberOfPage()); // Privite olan değişkeni get ile çağırıyoruz.
    }
}