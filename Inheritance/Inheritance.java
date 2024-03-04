package Inheritance;
class CPU{
    int a = 10;
    void operation(){
        System.out.println("Processing the task");
    }
}

class Computer extends CPU{
    int b = 20;
    void start(){
        System.out.println("Computer is booting up"); 
    }
}

class Inheritance{
    public static void main(String[] args) {
        Computer myComp = new Computer();
        myComp.start();
        myComp.operation();
    }
}