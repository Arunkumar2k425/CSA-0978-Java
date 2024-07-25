import java.util.Scanner;
public class numbersquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();
        int[][] numberSquareArray = new int[upperRange - lowerRange + 1][2];
        for (int i = lowerRange; i <= upperRange; i++) {
            numberSquareArray[i - lowerRange][0] = i;
            numberSquareArray[i - lowerRange][1] = i * i;
        }
        System.out.print("[");
        for (int i = 0; i < numberSquareArray.length; i++) {
            System.out.print("(" + numberSquareArray[i][0] + ", " + numberSquareArray[i][1] + ")");
            if (i < numberSquareArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}