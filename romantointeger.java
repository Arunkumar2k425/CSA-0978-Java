import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class romantointeger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();
        int result = romanToInt(roman);
        System.out.println("The integer value of the Roman numeral " + roman + " is: " + result);
        scanner.close();
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        int total = 0;
        int prevValue = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanToIntMap.get(currentChar);
            if (currentValue > prevValue) {
                total += (currentValue - 2 * prevValue);
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}