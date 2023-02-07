package Map;

import java.util.*;

public class TreeMapDeneme {
    public static void main(String[] args){
        TreeMap<String , String> tm = new TreeMap<String, String>();
        tm.put("Türkiye" , "Ankara");
        tm.put("Fransa" , "Paris");
        tm.put("Amerika" , "Washington D.C.");
        tm.put("Almanya" , "Berlin");

/*-----------------------Key ile Value nin yerini değiştirme--------------
        LinkedHashMap <String, String> reverselhm = new LinkedHashMap();
        for (Map.Entry<String, String> entry : tm.entrySet()) {
            reverselhm.put(entry.getValue(), entry.getKey());
        }
        System.out.println(reverselhm.get("Berlin"));
//-------------------------------------------------------------------------*/
        System.out.println(tm.get("Amerika"));
        Set set = tm.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + "-" + item.getValue()); //Çıkışta sıralama aşağıdan yukarıya veya yukardan aşağıya olabilir.
        }
    }
}