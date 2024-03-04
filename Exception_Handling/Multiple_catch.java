package Exception_Handling;

public class Multiple_catch {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("");
                @SuppressWarnings("unused")
                int num1 = 5 / 0;
            }
            catch (ArithmeticException e){
                System.out.println("Division by zero is not allowed.");
            }

            try{
                int a[] = new int[5];
                a[5] = 4;
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("The given index is out of bounds for the array.");
            }
        }
        catch(Exception e3){
            System.out.println("Program executed successfully");
        }
        }
    }
