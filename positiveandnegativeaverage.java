import java.util.ArrayList;
import java.util.Scanner;
public class positiveandnegativeaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        System.out.println("Enter -1 to exit...");
        while (true) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num > 0) {
                positiveNumbers.add(num);
            } else if (num < 0) {
                negativeNumbers.add(num);
            }
        }
        double positiveAverage = calculateAverage(positiveNumbers);
        double negativeAverage = calculateAverage(negativeNumbers);
        System.out.printf("Average of positive numbers: %.2f%n", positiveAverage);
        System.out.printf("Average of negative numbers: %.2f%n", negativeAverage);
        scanner.close();
    }
    private static double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}