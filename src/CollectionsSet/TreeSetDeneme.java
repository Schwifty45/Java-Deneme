package CollectionsSet;

import java.util.TreeSet;

public class TreeSetDeneme { //TreeSet te girilen değerler sıralanarak tutulur.
    public static void main(String[] args){
        TreeSet tree = new TreeSet();
        tree.add(89);
        tree.add(24);
        tree.add(14);
        tree.add(42);
        try {
            tree.add("STRING"); // String
            tree.add(false); //boolean
            tree.add(14); //Tekrar eden değer
            tree.add(null);
        } catch (Exception e){
            System.out.println(e.getMessage());}
        finally {
            tree.forEach(item -> System.out.println(item));
        }
    }
}
