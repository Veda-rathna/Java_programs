package AJP_Practicals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unit5Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input string
        String namesString = scanner.nextLine();

        // Task 1: Splitting strings
        System.out.println("\nSplitting string into names:");
        String[] names = splitNames(namesString);
        for (String name : names) {
            System.out.println(name.trim()); // Trim to remove any leading/trailing spaces
        }
        System.out.println();

        // Task 2: Replacing text
        String targetName = scanner.nextLine().trim();
        String replacementName = scanner.nextLine().trim();
        String replacedNames = replaceName(namesString, targetName, replacementName);
        System.out.println("\nReplacing '" + targetName + "' with '" + replacementName + "':");
        System.out.println(replacedNames);
        System.out.println();

        // Task 3: Extracting specific patterns
        char startingLetter = scanner.nextLine().charAt(0);
        System.out.println("\nExtracting names starting with " + startingLetter + ":");
        extractNamesStartingWith(namesString, startingLetter);

        // Close the scanner
        scanner.close();
    }

    // Method to split names based on commas and spaces
    public static String[] splitNames(String namesString) {
        String regex = "\\s*,\\s*"; // Split by comma followed by optional spaces
        return namesString.split(regex);
    }

    // Method to replace occurrences of a specific name in the string
    public static String replaceName(String namesString, String targetName, String replacementName) {
        String regex = "\\b" + Pattern.quote(targetName) + "\\b"; // Use word boundaries to avoid partial matches
        return namesString.replaceAll(regex, replacementName);
    }

    // Method to extract names starting with a specific letter
    public static void extractNamesStartingWith(String namesString, char startingLetter) {
        String regex = "\\b" + Character.toLowerCase(startingLetter) + "\\w*"; // Regex for words starting with the
                                                                               // given letter
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(namesString);

        while (matcher.find()) {
            System.out.println(matcher.group().trim()); // Trim to remove any leading/trailing spaces
        }
    }
}