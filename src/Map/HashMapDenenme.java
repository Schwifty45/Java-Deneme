package Map;

import java.util.*;

public class HashMapDenenme {
    public static void main(String [] Args){
        //-clear() =>
        //-get(Object key) =>
        //-put(Object key, Object value) =>
        HashMap hm = new HashMap();
        hm.put("BirinciDeğer",false); //hm.add yerine hm.put kullanılır. remove işlemi aynıdır.
        hm.put("İkinci Değer",2.0);
        hm.put("Üçüncü Değer","Üç");
        hm.put("Dördüncü Değer",4);
        hm.put("Beşinci Değer",null);
        System.out.println(hm.get("Üçüncü Değer"));

        Set s = hm.entrySet(); // Öncelikli olarak çıktı alabilmek için map ten set e çevirmemiz gerekiyor.

        Iterator itr = s.iterator(); {
            while (itr.hasNext()){
                Map.Entry item = (Map.Entry) itr.next();
                System.out.println(item.getKey() + " - " + item.getValue());
            }
        }
    }
}