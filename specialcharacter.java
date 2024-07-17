import java.util.Scanner;
public class specialcharacter
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        int specialCharCount = 0;
        System.out.println("Special characters in the line:");
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.println(ch);
                specialCharCount++;
            }
        }
        System.out.println("Total number of special characters: " + specialCharCount);
        scanner.close();
    }
}