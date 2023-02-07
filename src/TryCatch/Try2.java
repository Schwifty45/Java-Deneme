package TryCatch;
import java.util.Scanner;

public class Try2 {
    public static void  main(String[] args){
        System.out.println("Program Basladı !");
        int a = 0, b;
        int[] arr = new int [3];
        Scanner scan = new Scanner (System. in);
        try {
        a = 2/ 1; // hata yakaladık
        //System.out.println (a);
        arr[0] = 10;
        b = scan.nextInt ();
        }
catch (ArithmeticException e) {
            System.out.println("e'a bölünme hatas1 ");
            System.out.println(e. getMessage ());}
catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array boyut hatasz ");
                System.out.println (e.getMessage ());}
catch (Exception e){
                System.out.println("Bir Hata Var ");
                System.out.println(e. toString ());
            }finally {
                System.out.println ("Finally kism");
                System.out.println ("Program Bitti ");
    }
}
}