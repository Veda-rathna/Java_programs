package Recursion;
import java.util.Scanner;

class Recursion {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Factorial of " +x+ " is "+repeat(x));
        }
    }
    static int repeat(int x){
        if(x <= 1){
            return 1;
        }
        else{
            return (x * repeat(x - 1));
        }
    }
}
