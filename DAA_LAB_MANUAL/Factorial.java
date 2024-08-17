package DAA_LAB_MANUAL;
import java.util.*;

public class Factorial {  
    public static int factorial(int n){      
      if (n == 1)      
        return 1;      
      else 
        return(n * factorial(n-1));      
    }      
  
    @SuppressWarnings("resource")
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n = sc.nextInt();
      System.out.println("Factorial of " +n +" is: "+factorial(n));  
  }  
}  