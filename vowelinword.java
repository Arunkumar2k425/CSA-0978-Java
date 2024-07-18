import java.util.Scanner;
public class vowelinword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        int vowelCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < statement.length(); i++) {
            char currentChar = statement.charAt(i);
            for (char vowel : vowels) {
                if (currentChar == vowel) {
                    vowelCount++;
                    break;
                }
            }
        }
        System.out.println("The number of vowels in the given statement is: " + vowelCount);
    }
}