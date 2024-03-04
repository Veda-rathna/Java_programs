package Exception_Handling;

public class Throw {
    public static void main(String[] args) {
        int bal = 1000, w = 10000;
        if (bal < w) {
            // throw new ArithmeticException();
            // throw e;
            // ArithmericException e = new ArithmeticException("No money");
            throw new ArithmeticException("No money");
        } else {
            System.out.println("Balance:900");
        }

    }
}
