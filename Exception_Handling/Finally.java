package Exception_Handling;

public class Finally {
    public static void main(String[] args) {
        try{
            int a = 25/0;
            System.out.println(a);
        }
        catch(ArithmeticException e1){
            System.out.println("Division by zero is not allowed");
        }
        finally{
            System.out.println("Rest of the code......");
        }

        System.out.println("Hello");
            
    }
}
