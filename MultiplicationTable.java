import java.util.Scanner;
class MultiplicationTable extends Thread {
    private int number;
    public MultiplicationTable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number for the multiplication table: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number for the multiplication table: ");
        int num2 = scanner.nextInt();
        MultiplicationTable table1 = new MultiplicationTable(num1);
        MultiplicationTable table2 = new MultiplicationTable(num2);
        table1.start();
        table2.start();
        try {
            table1.join();
            table2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Multiplication tables are printed.");
    }
}