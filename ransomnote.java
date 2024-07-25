import java.util.Scanner;
public class ransomnote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ransom note: ");
        String ransomNote = scanner.nextLine();
        System.out.print("Enter the magazine: ");
        String magazine = scanner.nextLine();
        boolean canConstruct = canConstruct(ransomNote, magazine);
        System.out.println("output:" + canConstruct);
        scanner.close();
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if (index == -1) {
                return false; 
            }
            magazine = magazine.substring(0, index) + magazine.substring(index + 1); 
        }
        return true;
    }
}