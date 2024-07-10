public class DisplayAlphabets {
    public static void main(String[] args) {
        System.out.println("Uppercase Alphabets:");
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.err.println();
        System.err.println("lowercase alphabets");
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }
    }
}