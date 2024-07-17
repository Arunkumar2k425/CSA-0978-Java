import java.util.Scanner;
public class Asciivalue {
    public static int getAsciiValue(char ch) {
        return (int) ch;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        System.out.println("ASCII value of '" + ch + "': " + getAsciiValue(ch));
        scanner.close();
    }
}