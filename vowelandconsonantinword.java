import java.util.Scanner;
public class vowelandconsonantinword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String vowels = "";
        String consonants = "";
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (isVowel(currentChar)) {
                vowels += currentChar;
            } else if (Character.isLetter(currentChar)) {
                consonants += currentChar;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}