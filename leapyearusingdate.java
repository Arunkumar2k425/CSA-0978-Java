import java.util.Scanner;
public class leapyearusingdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date (dd/MM/yyyy): ");
        String date = scanner.nextLine();
        int year = Integer.parseInt(date.split("/")[2]);
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }
}