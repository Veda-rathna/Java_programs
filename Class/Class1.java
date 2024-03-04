package Class;

public class Class1 {
    public static void main(String args[]){
        Class1 c = new Class1();
        int a = 10;
        int b= 20;
        c.add(a, b);
    }

    public void add(int a, int b){
        int sum = a+b;
        System.out.println("The sum of the two numbers are "+ sum);
    }
}
