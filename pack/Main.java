package pack;
import java.util.Scanner;

public class Main{
public void mul(){
	Scanner sc = new Scanner(System.in);
	int x,y;
	System.out.println("Enter the value of x");
	x = sc.nextInt();
	System.out.println("Enter the value of y");
	y = sc.nextInt();
	System.out.println("The product is "+x*y);
}
}