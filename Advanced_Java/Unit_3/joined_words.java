package Advanced_Java.Unit_3;

import java.util.*;
import java.util.stream.*;

class joined_words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split(" ");

        String output = Arrays.stream(words).collect(Collectors.joining("-"));

        String finaloutput = output.toString();
        System.out.println("The joined words are: " + finaloutput);

        sc.close();
    }
}