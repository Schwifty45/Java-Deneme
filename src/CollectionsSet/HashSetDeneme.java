package CollectionsSet;
import java.util.*;
public class HashSetDeneme {
    public static void main(String[] args){
        //Hashset <E>
        //LinkedHashset <E>
        // TreeSet <E>
        HashSet h = new HashSet(); //HashSet te sıralama karışıktır.
        h.add("1234");     //String ekledim
        h.add(1234);       // int ekledim
        h.add(1234.0);   // double ekledim
        h.add(true);       //boolean ekledim.
        h.add(null);       // boş bir değer ekledim. Collectionlarda Array den farklı olarak birden farklı veri türünde eleman eklenebilir.

        h.remove(12.0); //Sıralama olmadığı için arraydeki gibi sıra numarası yerine silinecek değer yazılmalı.
        //h.clear(); listeyi temizler.
        System.out.println(h.contains(0)); //True || false döndürüyor. İçeriğinde o değer var mı diye bakıyor.

        Iterator itr = h.iterator(); {
    while (itr.hasNext()){
        System.out.println(itr.next());
        }
        }
    }
}