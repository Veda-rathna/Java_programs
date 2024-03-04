package Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the first operand:");
            double x = sc.nextDouble();
            
            System.out.print("Enter the operator:");
            String operator = sc.next();
            
            System.out.print("Enter the second operand:");
            double y = sc.nextDouble();

            Calculator calc = new Calculator();
            
            if(operator.equals("+")){
                calc.add(x,y);
            }
            else if(operator.equals("-")){
                calc.sub(x, y);
            }
            else if(operator.equals("*")){
                calc.mul(x, y);
            }
            else if(operator.equals("/")){
                calc.div(x, y);
            }
            else{
                System.out.println("The given operator is invalid!");
            }
        }

    }

    public void add(double x, double y){
        System.out.println(x+" + "+y+" = "+(x+y));
    }

    public void sub(double x, double y){
        System.out.println(x+" - "+y+" = "+(x-y));
    }

    public void mul(double x, double y){
        System.out.println(x+" * "+y+" = "+(x*y));
    }

    public void  div(double x, double y){
        if (y==0)
            System.out.println("Error! Division by zero is not allowed.");
        else
            System.out.println(x + " / " + y + " = " + (x/y));
    }
}