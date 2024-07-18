import java.util.Scanner;
public class nthoddnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int nthOdd = 2 * n - 1;
        int nthOddAfterNth = nthOdd + 2 * n;
        System.out.println("The " + n + "th odd number is: " + nthOdd);
        System.out.println("The " + n + "th odd number after the " + n + "th odd number is: " + nthOddAfterNth);
    }
}