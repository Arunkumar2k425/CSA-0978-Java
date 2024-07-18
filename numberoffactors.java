import java.util.Scanner;
public class numberoffactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        System.out.println("The number of factors for " + number + " is: " + factorCount);
    }
}
