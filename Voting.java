import java.util.Scanner;
import java.util.InputMismatchException;


/*1. Program to check if person is eligible to vote or not.
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
‌
2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.
‌
3. Write a program to illustrate how to throw a ClassNotFoundException.
‌
4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.
‌
5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.
‌
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
‌
7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
‌
8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.
‌
9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
‌
10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.*/

/*1. 
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/


 class Voting{
	public static void main(String[] args)
	{	
		int[] arr = {2,5,1,4,0,7};
		
		try{
			int quotient = arr[7] / arr[4];
			System.out.println("Quotient " + quotient);
		}
		catch(ArithmeticException  e)
		{
			System.out.println("ArithmeticException occurs");
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs" + e.getMessage());
		}
		
		
	}
}

//2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.

class Multiple{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		try{
			System.out.println("First no ");
			String numberstr1 = scan.nextLine();
			
			System.out.println("Second no");
			String numberstr2  = scan.nextLine();
			
			int n1 = Integer.parseInt(numberstr1);
			int n2 = Integer.parseInt(numberstr2);
			
			int divide = n1 / n2;
			
			System.out.println("Division of two numbers : " + divide);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid number format.enter the valid int type");
			System.out.println("NumberFormatException Details : " + e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occurs");
			System.out.println("ArithmeticException details : " + e.getMessage());
		}
		catch(Exception e )
		{
			System.out.println(" Unexpected error " );
			System.out.println("Exception error details : " + e.getMessage());
		}
		finally{
			
		}
	}
}

//3. Write a program to illustrate how to throw a ClassNotFoundException.

/*class ClassNotFound{
	public static void main(String[] args)
	{
		try{
			Class.forName("Multiple");
		}
		
		catch(ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException error ");
			System.out.println("Exception message  class not found: " + e.getMessage());
		}
	}
}*/
 class ClassNotFound {
    public static void main(String[] args) {
        try {
            Class.forName("Multiple");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException error ");
            System.out.println("Exception message  class not found: " + e.getMessage());
        }

        System.out.println("End of program");
    }
}

