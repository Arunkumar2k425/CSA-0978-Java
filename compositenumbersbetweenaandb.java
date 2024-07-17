import java.util.Scanner;
public class compositenumbersbetweenaandb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int b = scanner.nextInt();
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}