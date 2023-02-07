package CollectionsList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDeneme {
    public static void main(String[] args){
        ArrayList country  =new ArrayList();
country.add("USA");
country.add("Canada");
country.add("Hungary");
country.add("England");
country.add("USA");
country.add(1244);
country.add(3,"France");
        country.forEach(i -> System.out.println(i));
    }
}