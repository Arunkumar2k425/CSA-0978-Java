import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class sortname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); 
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.print("Enter sorting order (ascending/descending): ");
        String sortOrder = scanner.next().toLowerCase();
        if (sortOrder.equals("ascending")) {
            Collections.sort(names);
            System.out.println("Names sorted in ascending order:");
            printNames(names);
        } else if (sortOrder.equals("descending")) {
            Collections.sort(names, Collections.reverseOrder());
            System.out.println("Names sorted in descending order:");
            printNames(names);
        } else {
            System.out.println("Invalid sorting order entered. Please enter 'ascending' or 'descending'.");
        }
        scanner.close();
    }
    public static void printNames(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}