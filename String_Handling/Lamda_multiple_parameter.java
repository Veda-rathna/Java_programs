package String_Handling;

interface Add{
    public int add(int a, int b);
}
public class Lamda_multiple_parameter {
    public static void main(String args[]){
        Add a1 = (a , b) ->(a+b);

        System.out.println("The sum of 5 and 10 is " + a1.add(5,10));
    }
}
