package Arrays;

public class Arrays {
    public static void main(String[] args){
        String[] fruit = {"Apple", "Grape", "Watermelon", "Cherry", "Malone", "Strawberry"};
        System.out.println(fruit[3]);

/*-----------------------------------------------------------------------*/

        int [][] twoDimArray = {
                {1,4,5,6},
                {2,4,5,3,7}
        };  // Two dimensional array
        // İlk boyutun 1. alt dizisi, 2. eleman
        int twodimelement = twoDimArray[0][2]; //5
        System.out.println("twodimelement = " + twodimelement);

/*-----------------------------------------------------------------------*/

        int[][][] threeDimArray = {
                {{1, 2}, {3, 4}, {5, 6}},
                {{7, 8}, {9, 10}, {11, 12}},
                {{13, 14}, {15, 16}, {17, 18}},
                {{19, 20}, {21, 22}, {23, 24}},
                {{25,26,27},{28,29,30,31},{32}}
        };
        // İlk boyutun 1. alt dizisi, 2. eleman, 2. alt dizi, 1. elemanı
        int element1 = threeDimArray[0][1][0]; // 3
        System.out.println("element1 = " + element1);
        // Son boyutun 4. alt dizisi, 3. eleman, 3. alt dizi, 2. elemanı
        int element2 = threeDimArray[3][2][1]; // 24
        System.out.println("element2 = " + element2);
        // Son boyutun 3. alt dizisi, 3. eleman, 3. alt dizi, 1. elemanı
        int element3 = threeDimArray[2][2][0]; // 17
        System.out.println("element3 = " + element3);
    }
}