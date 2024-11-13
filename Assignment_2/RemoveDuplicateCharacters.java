package Assignment_2;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = input.replaceAll("(?i)(.)(?=.*\\1)", "");

        System.out.println("Output: " + result);
        sc.close();
    }
}
