import java.util.Scanner;
class Customer {
    private int accountNo;
    private String accName;
    private double balance;
    public Customer(int accountNo, String accName, double initialBalance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = initialBalance;
    }
    public synchronized void withdraw(double amount) throws InterruptedException {
        System.out.println("Attempting to withdraw: " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            wait(); 
        }
        balance -= amount;
        System.out.println("Withdraw operation success, balance amount: " + balance);
    }
    public synchronized void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("Deposit successful. Balance amount: " + balance);
        notifyAll(); 
    }
}
public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 10000;
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter account name: ");
        String accName = scanner.nextLine();
        Customer customer = new Customer(accountNo, accName, initialBalance);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        Thread withdrawThread = new Thread(() -> {
            try {
                customer.withdraw(withdrawAmount); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                customer.deposit(depositAmount); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        withdrawThread.start();
        depositThread.start();
        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}