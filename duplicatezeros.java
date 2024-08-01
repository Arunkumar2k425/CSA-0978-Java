import java.util.Arrays;
import java.util.Scanner;
public class duplicatezeros {
    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        int zeros = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        int i = length - 1;
        int j = length + zeros - 1;
        while (i >= 0 && j >= 0) {
            if (j < length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0 && --j < length) {
                arr[j] = 0; 
            }
            i--;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println("Output: " + Arrays.toString(arr));
        scanner.close();
    }
}