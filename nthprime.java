import java.util.Scanner;
public class nthprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int nthPrime = findNthPrime(n);
        System.out.println(n + "th Prime number is " + nthPrime);
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        printNextNPrimes(nthPrime, n);
    }
    public static int findNthPrime(int n) {
        int count = 0;
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == n) {
                    return number;
                }
            }
            number++;
        }
    }
    public static void printNextNPrimes(int start, int n) {
        int count = 0;
        int number = start + 1;
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + (count < n - 1 ? ", " : ""));
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}