import java.util.Arrays;
import java.util.Scanner;
public class nthlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of N to find the Nth largest number: ");
        int N = scanner.nextInt();
        if (N > size || N <= 0) {
            System.out.println("Invalid value of N.");
        } else {
            Arrays.sort(array);
            int nthLargest = array[size - N];
            System.out.println("The " + N + "th largest number is " + nthLargest);
        }
        scanner.close();
    }
}