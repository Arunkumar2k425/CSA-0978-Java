import java.util.Scanner;
class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType; 
    private double balance;
    public BankAccount(String depositorName, String accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance >= 500 ? initialBalance : 500; 
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 500) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance. Minimum balance of Rs.500.00 must be maintained.");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter depositor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(name, accountNumber, accountType, initialBalance);
        account.displayBalance();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();
    }
}