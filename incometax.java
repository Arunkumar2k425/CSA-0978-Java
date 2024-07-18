import java.util.Scanner;
public class incometax
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        double exemptionLimit = 150000;
        double taxableIncome = income - exemptionLimit;
        double tax = 0.0;
        if (taxableIncome <= 0) {
            tax = 0;
        } else if (taxableIncome <= 150000) {
            tax = taxableIncome * 0.10;  
        } else if (taxableIncome <= 300000) {
            tax = 15000 + (taxableIncome - 150000) * 0.20;  
        } else if (taxableIncome <= 500000) {
            tax = 45000 + (taxableIncome - 300000) * 0.30;  
        } else {
            tax = 105000 + (taxableIncome - 500000) * 0.30; 
        }
        System.out.println("Income: " + income);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax Payable: " + tax);
    }
}