import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class uniquepermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        String givenNumber = scanner.nextLine();
        Set<String> permutations = new HashSet<>();
        permutations.add("");
        for (char c : givenNumber.toCharArray()) {
            Set<String> newPermutations = new HashSet<>();
            for (String perm : permutations) {
                for (int i = 0; i <= perm.length(); i++) {
                    newPermutations.add(perm.substring(0, i) + c + perm.substring(i));
                }
            }
            permutations = newPermutations;
        }
        System.out.println("Permutations are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}