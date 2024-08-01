import java.util.*;
public class bannedword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z ]", " ");
        System.out.println("Enter banned words:");
        String[] bannedWordsArray = scanner.nextLine().toLowerCase().split("\\s+");
        Set<String> bannedWords = new HashSet<>(Arrays.asList(bannedWordsArray));
        String[] words = paragraph.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedWords.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        String mostFrequentWord = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("The most frequent non-banned word is: " + mostFrequentWord);
        scanner.close();
    }
}