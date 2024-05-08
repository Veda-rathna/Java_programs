package Exception_Handling;

public class Throws {
    public int div(int num) throws ArithmeticException {
        int divide = num / 0;
        return divide;
    }

    public static void main(String[] args) {
        Throws obj = new Throws();
        obj.div(45);
        System.out.println("Rest of the code");
    }
}
