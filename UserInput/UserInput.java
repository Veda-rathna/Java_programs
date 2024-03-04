package UserInput;
import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println(x+y);

      //Double and formating the output
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double sum = a+b;
      System.out.format("%.2f",sum);
    }
  }
}