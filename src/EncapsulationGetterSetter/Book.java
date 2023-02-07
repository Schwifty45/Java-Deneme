package EncapsulationGetterSetter;

public class Book {
    public String name, author, publisher;
    private int numberOfPage; //getter ve setter alt+insert ile oluşturulur.

    Book(String name, int numberOfPage, String author, String publisher) {  //Contractor
        this.name = name;                                                   //Contractor
        this.author = author;                                               //Contractor
        this.publisher = publisher;                                         //Contractor
        if (numberOfPage < 1) {
            this.numberOfPage = 10;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }

    public int getNumberOfPage() {               //Getter Methodu
        return this.numberOfPage;
    }

    public void setNumberOfPage(int size) {      //Setter Methodu
        if (size < 1) {
            System.out.println("SAYFA SAYISI NEGATİF OLAMAZ!");
            this.numberOfPage = size;
        } else {
            this.numberOfPage = size;
        }
    }
}