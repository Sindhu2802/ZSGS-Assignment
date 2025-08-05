import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;




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

class ClassNotFound{
	public static void main(String[] args)
	{
		try{

			System.out.println(Class.forName("Kumar"));
			System.out.println(Class.forName("har"));
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class notfound exception handled :"  + e.getMessage());
		}
		
	}
}
//class CarBike
//Class notfound exception handled :Kumar

//4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

class StringtoInt{
	public static int stringtoIntParse(String str)
	{
		try{
		int n = Integer.parseInt(str) ; //Convert string to int
		System.out.println("Integer   number : " + n);
		 return n;
	   }
	   catch(NumberFormatException e)
	   {
		System.out.println("Invalidnumber "+ e.getMessage());
		}
		return -1;
	}
	public static void main(String[] args)
	{
		stringtoIntParse("432");
		stringtoIntParse("fad");
		stringtoIntParse("aw");
	}
}
/*Integer   number : 432
Invalidnumber For input string: "fad"
Invalidnumber For input string: "aw"*/


/*5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns.
Show this with output.*/

class FinallyReturn{
	public static int ViewMessage(){
		try{
			System.out.println("Inside try block");
			return 10;
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			return 100;
		}
		finally{
		System.out.println("Inside final block Executed");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Return the value for : "  + ViewMessage());
	}
}

/*Inside try block
Inside final block Executed
Return the value for : 10*/


/*6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/



class ATMCheck{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your pin :" );
		 try{
			 
			 String s = scan.nextLine();
			 
			 if(s.charAt(0) == '0') // first digit not zero 
			 {
				 throw new Exception("First digit not zero not valid ");
			 }
			 if(s.length() != 4)
			 {
				 throw new Exception("the length is to low or high anything will be not valid ");
			 }
			 for(int i=0;i<s.length();i++)
			 {
				 char ch = s.charAt(i);
				 if(ch < '0' || ch > '9')
				 {
					 throw new Exception("It's not a valid pin . Must be contain numeric value");
				 }
			 }
			  System.out.println("It's valid pin  ");
		 }
			 catch(Exception e){
				 System.out.println("Pin is not valid " + e.getMessage());
			 }
		 
	}
} 

/*Enter your pin :
2354
It's valid pin

Enter your pin :
0234
Pin is not valid First digit not zero not valid

Enter your pin :
d43
Pin is not valid the length is to low or high anything will be not valid

Enter your pin :
edff
Pin is not valid It's not a valid pin . Must be contain numeric value*/


/*7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). 
Handle the exception in method1.*/

class Propogation{
	public static  void method3(){
		System.out.println("Inside method3 block");
		int num = 40/0;
	}
	public static void method2(){
		System.out.println("Inside method2 block");
		method3();
	}
	public static void method1(){
		try{
			method2();
			System.out.println("Inside method1 block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception " + e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		method1();
		System.out.println("Exception called pass tha methods ");
	}
}
	
/*Inside method2 block
Inside method3 block
Exception / by zero
Exception called pass tha methods*/


//8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.



//9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.

class Getfile{
	public static void main(String[] args)
	{
		try{
			FileReader File = new FileReader("D:/tranig notes/zoho tharuvai series 1.txt");
			int read = File.read();
			
			System.out.println("File is Reading successfully");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found : " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IOException " + e.getMessage());
		}
	}
}

//File is Reading successfully
//File not found : D:\tranig notes\zoho tharuvai series 1.txt (The system cannot find the path specifid

//10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.*/

class Vote{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = scan.nextInt();
		try{
			if( age < 18)
			{
				throw new Exception("You are not eligible for voting");
			}
			else{
				System.out.println("You are eligible for voting");
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception error :" + e.getMessage());
		}
		
	}
}

/*Enter your age :
12
Exception error :You are not eligible for voting

Enter your age :
21
You are eligible for voting*/



