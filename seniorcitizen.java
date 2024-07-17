import java.util.Scanner;
public class seniorcitizen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Is the customer a senior citizen (y/n): ");
        char isSenior = scanner.next().charAt(0);
        double rateOfInterest;
        if (isSenior == 'y' || isSenior == 'Y') {
            rateOfInterest = 12.0;
        } else {
            rateOfInterest = 10.0;
        }
        double interest = calculateSimpleInterest(principal, years, rateOfInterest);
        System.out.println("Interest: " + interest);
        scanner.close();
    }
    public static double calculateSimpleInterest(double principal, int years, double rateOfInterest) {
        return (principal * years * rateOfInterest) / 100;
    }
}