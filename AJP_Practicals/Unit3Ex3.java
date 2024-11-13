package AJP_Practicals;

//String Tokenize and Filter using Stream API.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class Unit3Ex3 {

    // Define a set of stopwords
    private static final Set<String> stopwords = new HashSet<>(Arrays.asList(
            "a", "an", "and", "are", "as", "at", "be", "for", "from", "has", "he",
            "in", "is", "it", "its", "of", "on", "that", "this", "the", "to", "was",
            "were", "will", "with"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence to process: ");
            String input = scanner.nextLine().trim();

            // Tokenize the input sentence into words and filter out stopwords
            String result = Arrays.stream(input.split("\\s+"))
                    .filter(word -> !stopwords.contains(word.toLowerCase()))
                    .collect(Collectors.joining(" "));

            // Print remaining words after stopwords removal
            System.out.println("Remaining words after processing sentence: [" + result + "]");
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
