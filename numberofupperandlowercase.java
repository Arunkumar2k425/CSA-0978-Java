import java.util.Scanner;
public class numberofupperandlowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        System.out.println("Enter * to exit...");
        while (true) {
            System.out.print("Enter any character: ");
            char ch = scanner.next().charAt(0);
            if (ch == '*') {
                break;
            }
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        System.out.println("Total count of lower case: " + lowerCaseCount);
        System.out.println("Total count of upper case: " + upperCaseCount);
        System.out.println("Total count of numbers: " + numberCount);
        scanner.close();
    }
}