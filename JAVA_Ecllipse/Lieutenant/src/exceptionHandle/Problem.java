package exceptionHandle;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		
	  while (true)  {
			
		try {

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter Number 1 & 2 : ");
			
			int a = input.nextInt();
			int b = input.nextInt();
			
			int result = a/b;
			
			System.out.println("Result = "+result);
			break; 
			
		} catch (Exception a) {
			
			System.out.println("Exception : "+a);
			System.out.println("PLz enter an position integer number");
		}
		
	  }

	}

}
