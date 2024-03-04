package Loop;

import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Give some number as input:");
            int x = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= x; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to " + x + " is: " + sum);
        }
    }
}