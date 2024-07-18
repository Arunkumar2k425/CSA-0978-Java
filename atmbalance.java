import java.util.Scanner;
public class atmbalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = new int[4];
        int[] numberOfNotes = new int[4];
        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            denominations[i] = scanner.nextInt();
            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            numberOfNotes[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            totalBalance += denominations[i] * numberOfNotes[i];
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }
}