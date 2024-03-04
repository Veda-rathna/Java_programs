package ConstructorInInheritance;

class A{
    A(){
        System.out.println("This is the parent class");
    }
    void disp(){

    }
}

class B extends A{
    B(){
        System.out.println("This is the child class");
    }

    public static void main(String[] args) {
        B b = new B();
        b.disp();
    }
}
