package Advanced_Java.Unit_3;

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        long count = IntStream.rangeClosed(start, end)
                              .parallel()
                              .filter(Main::isPrime)
                              .count();

        System.out.println(count);

        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
