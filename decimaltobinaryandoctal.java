import java.util.Scanner;

public class decimaltobinaryandoctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Binary equivalent: " + binaryNumber);
        System.out.println("Octal equivalent: " + octalNumber);
    }
}