package pack;

import java.util.Scanner;

public class Add{
	@SuppressWarnings("resource")
	public void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the first number");
		int y = sc.nextInt();
		System.out.println("The sum of two numbers are:"+(x+y));
	}
}