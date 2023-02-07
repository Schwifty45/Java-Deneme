package CollectionsQueue;

import java.util.Queue;

public class LinkedListDeneme {
    // -Elements() Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz
    // -Offer (E o) Mümkünse, verilen öğeyi kuyruğa ekler.
    // -peek () Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz. Kuyruk boşsa, null verir.
    //-pool () Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk boşsa, null verir.
    //-remove () Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. (Diğer kodların aksine remove() diğer Collections lar ile ortak)
public static void main(String [] args){
    Queue list = new java.util.LinkedList();
    list.add("adda");
    list.add("bdda");
    list.add("cdda");
    list.add("ddda");
    list.add("edda");
    list.add("adda");

    list.offer(213);
list.forEach(i->System.out.println(i));
}
}