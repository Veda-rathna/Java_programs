package Exception_Handling;

public class Try {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try{
            int num = 50/0;
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Division by zero is not allowed");
    }
}

/*Exception in thread Main java.lang.ArithmeticException: / by zero
Rest of the code........................*/
