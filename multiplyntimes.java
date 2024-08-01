import java.util.Scanner;
public class multiplyntimes {
    public static void printMultiplicationTable(int m, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table (M): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of times to multiply (N): ");
        int n = scanner.nextInt();
        printMultiplicationTable(m, n);
        scanner.close();
    }
}