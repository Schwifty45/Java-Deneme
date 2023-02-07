package Method;

public class StringSinifi {
    public static void main(String[] args) {
    // str.length(): Girilen karakterin sayısını döndürür.
    // str1.concat(str2): String birleştirme
    // str.indexOf('W') karakterin konumunu verir
    // str.charAt(5): indexOf metoduna benzer şekilde bu sefer de konumu verilen karakteri okur
    // str.compareTo("TTV") büyük/küçük fark duyarlı olarak karşılaştırır.
    // str.compareToIgnoreCase ("SCHwiftyTTV") : büyük küçük harf duyarlı olmadan karşılatırır.
    // str.contains ("TTV"): girilen değer string içinde geçiyor mu diye true||false kontrol eder.
    // str.endsWith("V") : belirtilen karakter (ler) ile bitiyorsa true değerini döndürür.
    // str.replace(" TTV" "SCHWIFTY"): string değiştirme için kullanılır.
    // str.toLowerCase(); Hepsi küçük harf olur
    // str.toUpperCase(); Hepsi Büyük harf olur

        //char [] str={'S','C','H','W','I','F','T','Y'};
        //String metin = new String(str);
        //System.out.println(metin);

    String metin = "SCHWIFTY";
    String metin2= " TTV";
    System.out.println(metin.concat(metin2));
}
}
