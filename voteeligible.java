import java.util.Scanner;
public class voteeligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();
        int votingAge = 18;
        if (age >= votingAge) {
            System.out.println("The person is eligible to vote.");
        } else {
            int yearsLeft = votingAge - age;
            System.out.println("The person is not eligible to vote.");
            System.out.println("Years left to be eligible: " + yearsLeft);
        }
        scanner.close();
    }
}