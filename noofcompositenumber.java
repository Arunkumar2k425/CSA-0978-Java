import java.util.Scanner;
public class noofcompositenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int compositeCount = 0;
        for (int num : array) {
            if (isComposite(num)) {
                compositeCount++;
            }
        }
        System.out.println("Number of composite numbers in the array: " + compositeCount);
    }
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}