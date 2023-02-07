package Generic;

import java.util.ArrayList;

public class KonuDeneme {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList(); // Generic yapı <SınıfTürü> olarak yazılır. (int için Integer, double için Double gibi.)
list.add(1);
//list.add(1.0); Int olarak tanımladım. Tür değiştirici sınıf yazılması gerekir.
list.add(2);

for (Integer obj : list){
    System.out.println(obj);
    System.out.println(obj.doubleValue());// Double çevirdim.

}
/*-------------------------------------------------------------------------------------------------------------
for (Object obj : list){ // Generic Kullanılmadan hata alınmayacak şekilde
    System.out.println(obj);
    System.out.println(obj.doubleValue());// Object sınıfına atanıldığı için double çevrilmez veya int işlemleri yapılamaz
}
-----------------------------------------------------------------------------------------------------------------*/
    }
}
