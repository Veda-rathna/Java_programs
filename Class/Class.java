package Class;

public class Class{
    public static void main(String args[]){
        Class c = new Class();
        int a = 10;
        int b= 20;
        System.out.println("The sum of the two numbers is "+ c.add(a, b));
    }

    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

}