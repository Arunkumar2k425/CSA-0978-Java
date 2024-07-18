import java.util.Scanner;
public class removevowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String stringWithoutVowels = removeVowels(inputString);
        System.out.println("The string without vowels is: " + stringWithoutVowels);
    }
    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        String lowerCaseStr = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = lowerCaseStr.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}