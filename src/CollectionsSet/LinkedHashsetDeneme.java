package CollectionsSet;

import java.util.LinkedHashSet;

public class LinkedHashsetDeneme {
    public static void main(String[] args){
        LinkedHashSet days = new LinkedHashSet(); //Hashset ten farkı sıralı hafızada tutuluyor olması. İlk girilen değer ilk çıkar.
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        days.add("Monday"); //Tekrar eden değer. Tekrardan bu değer oluşmuyor.

        days.forEach(item -> System.out.print(item + " "));
    }
}
