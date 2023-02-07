package Map;
import java.util.*;
public class LinkedHashMapDeneme {
public static void main(String[] args){
LinkedHashMap <String , String> lhm = new LinkedHashMap();
lhm.put("Türkiye" , "Ankara");
lhm.put("Fransa" , "Paris");
lhm.put("Amerika" , "Washington D.C.");
lhm.put("Almanya" , "Berlin");

//-----------------------Key ile Value nin yerini değiştirme--------------
LinkedHashMap <String, String> reverselhm = new LinkedHashMap();
    for (Map.Entry<String, String> entry : lhm.entrySet()) {
        reverselhm.put(entry.getValue(), entry.getKey());
}
    System.out.println(reverselhm.get("Berlin"));
//-------------------------------------------------------------------------
    System.out.println(lhm.get("Amerika"));
    Set set = lhm.entrySet();
    Iterator i = set.iterator();
    while (i.hasNext()){
        Map.Entry item = (Map.Entry) i.next();
        System.out.println(item.getKey() + "-" + item.getValue()); //Çıkışta sıralama aşağıdan yukarıya veya yukardan aşağıya olabilir.
    }
}
}