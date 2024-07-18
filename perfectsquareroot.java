import java.util.Scanner;
public class perfectsquareroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a perfect square number: ");
        int number = scanner.nextInt();
        int sqrt = (int) Math.sqrt(number);
        if (sqrt * sqrt == number) {
            System.out.println("The square roots of " + number + " are: " + sqrt + " and " + (-sqrt));
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}