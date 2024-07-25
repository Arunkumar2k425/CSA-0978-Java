import java.util.*;
public class weakestrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the matrix values row by row (0s and 1s):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        List<Integer> result = kWeakestRows(mat, k);
        System.out.println("The indices of the " + k + " weakest rows are: " + result);
        scanner.close();
    }
    public static List<Integer> kWeakestRows(int[][] mat, int k) {
        List<int[]> rowList = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break; 
                }
            }
            rowList.add(new int[]{count, i}); 
        }
        rowList.sort((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(rowList.get(i)[1]);
        }
        return result;
    }
}