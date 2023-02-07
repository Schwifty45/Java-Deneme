package TryCatch;

public class Throw {
    public static void main(String [] args){
        int a = 0;
        if (a == 0){
            System.out.println("Bölen Sıfıra Eşit olamaz!!");
            throw new ArithmeticException("Arithmetic Exception Occur");
        }
        System.out.println("Kodun Devamı. ");
    }
}
