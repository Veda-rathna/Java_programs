package Overloading;
import java.util.Scanner;

class Overloading{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println("The sum of two numbers "+add(x,y));
            System.out.println("The sum of three numbers "+add(x,y,z));
        }
    }

    public static int add(int x, int y){
        return x + y;
    
    }

    public static int add(int x, int y, int z){
        return x + y + z;
    }
}