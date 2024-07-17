import java.util.Arrays;
import java.util.Scanner;
public class meanmedianmode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Mean: " + findMean(numbers));
        System.out.println("Median: " + findMedian(numbers));
        System.out.println("Mode: " + findMode(numbers));

        scanner.close();
    }
    public static double findMean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    public static double findMedian(int[] numbers) {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        } else {
            return numbers[middle];
        }
    }
    public static int findMode(int[] numbers) {
        Arrays.sort(numbers);
        int mode = numbers[0];
        int maxCount = 0;
        int currentNumber = numbers[0];
        int currentCount = 0;
        for (int num : numbers) {
            if (num == currentNumber) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = currentNumber;
                }
                currentNumber = num;
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            mode = currentNumber;
        }
        return mode;
    }
}