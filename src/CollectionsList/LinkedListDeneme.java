package CollectionsList;

import java.util.LinkedList;

public class LinkedListDeneme {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add("Hasan");
        list.add("Ahmed");
        list.add("Elif");
        list.add("Lokman");
        list.add(3,"dört");
        list.add(2.4);
        list.add("Elif");

        list.forEach(i-> System.out.println(i));
    }
}
