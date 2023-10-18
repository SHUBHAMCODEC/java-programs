import java.util.Scanner;

public class Characters1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char maxChar = ' ';
        int maxCount = 0;

        // Convert given string into a character array
        char[] string = str.toCharArray();

        // Count occurrences using an array for ASCII characters
        int[] count = new int[256];

        // Traverse the string and update the count array
        for (int i = 0; i < str.length(); i++) {
            char currentChar = string[i];
            count[currentChar]++;

            // Update max occurring character and count
            if (count[currentChar] > maxCount) {
                maxCount = count[currentChar];
                maxChar = currentChar;
            }
        }

        // Display the result
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Count of maximum occurring character: " + maxCount);

        scanner.close();
    }
}
