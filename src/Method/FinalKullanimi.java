package Method;

public class FinalKullanimi {
    final static double PI = 3.14; // değişmemesi için başına final yazılır
    public static double area(int r) {
        return FinalKullanimi.PI * (Math.pow(r, 2));
    }
    public static void main(String[] args){
        System.out.println(FinalKullanimi.area(10));

    }
}
