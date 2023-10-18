import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static char findFirstNonRepeatingCharacter(String str) {
        // Create a map to store the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a default value
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(userInput);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
