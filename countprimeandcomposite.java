import java.util.Scanner;
public class countprimeandcomposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0;
        int compositeCount = 0;
        System.out.println("Enter numbers (enter a negative number to stop):");
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (isPrime(number)) {
                primeCount++;
            } else if (number > 1) {
                compositeCount++;
            }
        }
        System.out.println("Total prime numbers: " + primeCount);
        System.out.println("Total composite numbers: " + compositeCount);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}