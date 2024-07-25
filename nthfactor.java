import java.util.Scanner;
public class nthfactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        int count = 0;
        int nthFactor = -1;
        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                count++;
                if (count == n) {
                    nthFactor = i;
                }
            }
        }
        System.out.println("Number of factors = " + count);
        if (nthFactor != -1) {
            System.out.println(n + "th factor of " + givenNumber + " = " + nthFactor);
        } else {
            System.out.println("The given number does not have " + n + " factors.");
        }
    }
}