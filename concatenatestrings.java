import java.util.Scanner;
public class concatenatestrings {
    public static String concatenateStrings(String str1, String str2) {
        return str1.concat(str2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        System.out.println("Concatenated string: " + concatenateStrings(str1, str2));
        scanner.close();
    }
}