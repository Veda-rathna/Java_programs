package AJP_Practicals;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Unit5Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Fibonacci sequence limit
        System.out.print("Enter the limit for Fibonacci sequence: ");
        int fibonacciLimit = scanner.nextInt();

        List<Integer> fibonacciSequence = generateFibonacciSequence(fibonacciLimit);
        System.out.println("Fibonacci Sequence: " + fibonacciSequence);

        scanner.close();
    }

    public static List<Integer> generateFibonacciSequence(int limit) {
        return Stream.iterate(new int[] {0, 1}, fib -> new int[] {fib[1], fib[0] + fib[1]})
                     .limit(limit)
                     .map(fib -> fib[0])
                     .collect(Collectors.toList());
    }
}

