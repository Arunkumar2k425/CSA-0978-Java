import java.util.Scanner;
public class reverseandaddtopalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber;
        int sum;
        int iteration = 1;
        while (!isPalindrome(number)) {
            reversedNumber = reverseNumber(number);
            sum = number + reversedNumber;
            System.out.println(number + " + " + reversedNumber + " = " + sum);
            number = sum;
            iteration++;
        }
        System.out.println(number + " is a palindrome.");
    }
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }
}