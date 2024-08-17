public class PrimeNumberGenerator {
    public static void main(String[] args) {
        int limit = 20; 
        int numThreads = 4;

        for (int i = 0; i < numThreads; i++) {
            int start = 1;
            int end = limit;
            new Thread(() -> {
                for (int num = start; num <= end; num++) {
                    if (isPrime(num)) {
                        System.out.println(num);
                    }
                }
            }).start();
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
