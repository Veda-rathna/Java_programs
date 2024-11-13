package AJP_Practicals;

import java.util.Scanner;
import java.util.stream.*;

public class Unit3Ex2 {

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of prime numbers to generate: ");
            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Number of primes should be greater than zero.");
                return;
            }

            String result = IntStream.iterate(2, i -> i + 1)
                            .filter(Unit3Ex2::isPrime)
                            .limit(count)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(", "));

            System.out.println("Generated " + count + " prime numbers: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}