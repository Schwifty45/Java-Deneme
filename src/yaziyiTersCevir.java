
    import java.util.Scanner;

    public class yaziyiTersCevir {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir string girin: ");
            String str = scanner.nextLine();

            char[] charArray = str.toCharArray();
            int length = charArray.length;

            System.out.print("Tersine çevrilmiş hali: ");
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }
        }
    }