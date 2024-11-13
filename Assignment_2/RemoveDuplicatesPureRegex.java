package Assignment_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveDuplicatesPureRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeDuplicateCharsRegex(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
        
        scanner.close();
    }
    
    public static String removeDuplicateCharsRegex(String str) {
        StringBuilder pattern = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            pattern.append("(?<!").append(Pattern.quote(String.valueOf(ch))).append(".*)")
                  .append(Pattern.quote(String.valueOf(ch)));
            
            if (i < str.length() - 1) {
                pattern.append("|");
            }
        }
        
        return Pattern.compile(pattern.toString()).matcher(str).replaceAll("");
    }
}