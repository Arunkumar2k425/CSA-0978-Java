import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class commonelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of elements for the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("number of elements for the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        Set<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: " + commonElements);
        scanner.close();
    }
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        Set<Integer> commonElements = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }
}