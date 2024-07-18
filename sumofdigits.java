import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N = scanner.nextInt();
        System.out.print("Enter " + N + " digit number: ");
        int number = scanner.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of " + N + " digit number: " + sum);
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0 || sum >= 10) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}