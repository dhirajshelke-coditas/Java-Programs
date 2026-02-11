package Week1Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a: ");
      int a= sc.nextInt();
      System.out.println("Enter b: ");
      int b= sc.nextInt();
      
      try {
		System.out.println(a/b);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Cannot be divided by zero");
	}
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Enter valid number!!!!");
		}
		finally {
			System.out.println("Program execution completed");
		}

	}

}
