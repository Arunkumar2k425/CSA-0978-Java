import java.util.Scanner;
public class evensumfibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        int a = 0, b = 1;
        int evenSum = 0;
        while (a <= N) {
            if (a % 2 == 0) {
                evenSum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("The sum of even Fibonacci numbers up to " + N + " is: " + evenSum);
        scanner.close();
    }
}