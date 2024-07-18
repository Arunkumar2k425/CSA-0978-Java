import java.util.Arrays;
import java.util.Scanner;
public class reversealphabeticalorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }
        System.out.print("Alphabetical Order: ");
        for (char c : reversedArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}