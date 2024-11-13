package Assignment_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Pattern p = Pattern.compile("\\b(\\w+)(\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + input.trim());
        
        scanner.close();
    }
}