import java.util.Scanner;
public class duplicatecharacters {
    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " : " + charCount[i] + " times");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        findDuplicateCharacters(str);
        scanner.close();
    }
}