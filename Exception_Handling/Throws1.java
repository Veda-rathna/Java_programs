package Exception_Handling;

public class Throws1 {
    public int div(int num) throws ArithmeticException{
        int divide = num/0;
        return divide;
    }

    public static void main(String[] args) {
        Throws obj = new Throws();
        try{
            obj.div(45);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
    }
}
