import java.util.Scanner;
public class nperfectnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of perfect numbers: ");
        int n = scanner.nextInt();
        int count = 0;
        int number = 1;
        while (count < n) {
            if (isPerfect(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}