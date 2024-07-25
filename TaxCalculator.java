import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.println("Taxable Income: " + income);
        System.out.println("Tax= " + tax); 
        scanner.close();
    }
    public static double calculateTax(double income) {
        double tax = 0;
        double taxableIncome;
        if (income <= 250000) {
            taxableIncome = 0;
        } else if (income <= 500000) {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.10;
        } else if (income <= 1000000) {
            taxableIncome = income - 500000;
            tax = (250000 * 0.10) + (taxableIncome * 0.20);
        } else {
            taxableIncome = income - 1000000;
            tax = (250000 * 0.10) + (500000 * 0.20) + (taxableIncome * 0.30);
        }
        return tax;
    }
}