import java.util.Scanner;
public class squareandcube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();
        double square = number * number;
        double cube = number * number * number;
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);
    }
}