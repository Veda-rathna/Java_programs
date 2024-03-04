package Parameterized_const_in_super;

public class A {
    A(int x){ 
        System.out.println("The value in class A is "+ x);
    }
    void disp(){}
}

class B extends A{
    B(int x){
        super(10);
        System.out.println("The value in class B is "+x);
    }
    
    public static void main(String[] args) {
        B b = new B(5);
        b.disp();
    }
}
