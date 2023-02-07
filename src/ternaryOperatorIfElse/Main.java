package ternaryOperatorIfElse;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Sayı giriniz");
        int sayi = sc.nextInt();
        String result = (sayi <= 30) ? "30 dan küçük veya eşit Sayı (True)" : "30 dan büyük sayı (False)";
        System.out.println(result);
    }
}
