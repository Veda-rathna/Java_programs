package Assignment_2;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = input.replaceAll("(.)(?=.*\\1)", "");
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}