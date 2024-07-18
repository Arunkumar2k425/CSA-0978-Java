import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}