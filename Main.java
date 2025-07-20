
/*Day-1 Assignment Questions:
1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.
3. Write a program to find the maximum of two numbers using ternary operator.
4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
5. Write a program that illustrate the execution order of static block and initializer block?
6. Write a program that illustrate the Explicit type casting?
7. Write a program to check if a number is a power of 2?
8. Write a program to find the first set bit of a number?
9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?
10. Write a program to check whether the object is an instance of a particular class?*/


//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
    class Vartype{
		//static variable
		static String stuName = "sin";
       // final variable is that reference itself cannot be changed to point to a different object
		//final int regNo = 20234; //cannot assign a value to final variable regNo
		int regNo = 20234;
		public static void main(String[] args)
		{
			
			System.out.println("student name : " + stuName);
			String department = "cyber security";//local variable 
			System.out.println("Student department  " + department);
			
			Vartype obj1 =  new Vartype();
			obj1.regNo = 20230;
			System.out.println("Student regno : " + obj1.regNo);
			
			//block of variable
			{
				int a = 5;
				int b =6;
				int c = a + b;
				System.out.println("the sum of " + c ); 
			}
		//	int c = a+b;
			
		}
	}
				
//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.

class dtype{
	public static void main(String[] args)
	{
		int a = 22;
		double b = 2.3414999d;
		float c = 3.34f;
		long d = 3345662;
		char e = 'A';
		byte f = 2;
		System.out.println("Integer Value : " + a );
        System.out.println("Double value : " + b);
		System.out.println("Float value : " + c );
		System.out.println("Long integer value  : " + d );
		System.out.println("Char letter : " + e);
        System.out.println("byte value : " + f);
	}
}	

//3. Write a program to find the maximum of two numbers using ternary operator.
 class max{
	 public static void main(String[] args)
	 {
		 int x = 34;
		 int y = 56;
		 int Maxvalue = (x > y) ? x : y ;//ternary operator
		 System.out.println(Maxvalue);
	 }
 }
 
 //4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
 
 class comapare{
	 static int equalnum(int x , int y)
	 {
		 if((x ^ y)==0)//XOR operator
		 {
			 System.out.println("the num is equal");
		 }
		 else{
			 System.out.println("the num is not equal");
		 }
		 return 0;
	 }
	 public static void main(String[] args)
	 {
		  
		 equalnum(5,6);
	 }
	 }
	 
//5.Write a program that illustrate the execution order of static block and initializer block?
   class block{
   
   {
	   System.out.println("Initializer block" );
   }
   static
   {
	   System.out.println("static block");
   }
    public static void main(String[] args)
   {
	   block value = new block();
   } 
	   
}

//6. Write a program that illustrate the Explicit type casting?
class explicitcast{
	public static void main(String[] args)
	{  
	//explicit type casting double to int
		double d = 2.456;
		int n = (int)d;
		System.out.println(" double value : " + d + " the int value " + n );
	}
}
//7.Write a program to check if a number is a power of 2?
class power{
	// A number is a power of 2 if it's positive and has only one bit set in its binary repersentation
	  static boolean isPower(int n )
	{
		while(n != 1 && n %2 == 0) 
		{
			n /= 2;
		}
		return n ==  1;
	}
	public static void main(String[] args)
	
	{
		
		System.out.println("the valid power of 2 " + isPower(4));
		System.out.println("the invalid power of 2 " + isPower(7));
	}
	}

//8. Write a program to find the first set bit of a number?
class firstbit{
	public static void main(String[] args)
	{
	
		int n = 8;
		int temp = n;
		String binary="";
		if(temp == 0)
		{
			binary = "0";
		}
		while(temp > 0)
		{
			int remainder = temp % 2;
			binary = remainder + binary;
			temp = temp /2;
		}
		System.out.println(binary);
		int count  =1;
		for(int i =binary.length()-1;i>0;i--)
		{
			if(binary.charAt(i) == '0')
			{
				count ++;
			}
			else{
				break;
			}
			
		}
		System.out.println(count);
	}
}


	
//9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?

class Employee{
	private int empId;
	private String name;
	private String department;
	private double salary;
	
	public Employee(int empId,String name,String department,double salary)
	{
		this.empId= empId;
		this.name= name;
		this.department=department;
		this.salary=salary;
	}
	public void displayEmployee()
	{
		System.out.println("The employeeid is : " + empId);
		System.out.println("The name is : " + name);
		System.out.println("The department : " + department);
		System.out.println("The salary : " + salary);
	}
	public static void main(String[] args)
	{
		Employee result = new Employee(1,"kumar","HR DEP",29000);
		result.displayEmployee();
	}
}


//10. Write a program to check whether the object is an instance of a particular class?

class instance{
	public static void main(String[] args)
	{
		
		String str = "veni";
		boolean value = str instanceof String;
		System.out.println(value);
	}
}


/*Day-2 Assignment Questions: Part-1*
1. Write a program that uses if statement to find the minimum of three numbers.
2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R
3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS
‌
5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
6. Define a method to convert the decimal number to a binary number?
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

//1. Write a program that uses if statement to find the minimum of three numbers.
class minimum{
	public static void main(String[] args)
	{
		int n1 = 45;
		int n2 = 32;
		int n3 = 55;
		if(n1 < n2 & n1 < n3)
		{
			System.out.println( "minimum of three number" + n1);
		}
		else if(n2 < n3)
		{
			System.out.println("minimum of three number " + n2);
		}
		else{
			System.out.println("minimum of three number " + n3);
		}
	}
}  

/*2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R*/

//a) Using for loop patterns
  /*1      1
    1  1
      1
	1   1
  1       1 */   	
	   

class pattern1{
	public static void main(String[] args)
	{
		int rows =5;
		for(int i=0;i<rows;i++)
		{
			for(int j =0;j<rows;j++)
			{
				
				if(i == j || i+j == rows - 1 )
				{
					System.out.print("1"+ " " );
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//b R pattern 
  class pattern2{
	  public static void main(String[] args)
	  {
		  int rows = 5;
		  for(int i=1;i<=rows;i++)
		  {
			  for(int j=1;j<rows;j++)
			  {
		        if(i==1 || j == 1 ||  i == 3 || (j == 4 & i<=2))
				  {
					  System.out.print("R" + " " );
				  }
				  else if(j == rows-1 || i + j ==rows)
				  {
					  System.out.print("R" + " ");
				  }
				  else{
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
		  }
	  }
  }
  
/*3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w*/
//a)
   /*  1
   2   3
 4    5   6
   7   8
     9*/
	 
 class pattern3{
	 public static void main(String[] args)
	 {
		 int r = 3;
		 int num=1;
		 int i=1;
		 while(i<=2*r-1)
		 {
			int totoalcols = (i<=r) ? i : (2*r-i);
		    int j =1;
		      while(j<=r)
			 {
				 if( j <= r-totoalcols )
				 {
					 System.out.print(" ");
				 }
				 else{
					 System.out.print(num+" ");
					  num++;
				 }
				 j++;
				
			 }
			 System.out.println();
			 i++;
		 }
	 }
 }

//b.	 
class pattern4{
	 public static void main(String[] args)
	 {
		 int r = 3;
		 int num=1;
		 int i=1;
		 while(i<=2*r-1)
		 {
			int totoalcols = (i<=r) ? i : (2*r-i);
		    int j =1;
		  while(j<=r)
			 {
				 if( j <= r-totoalcols )
				 {
					 System.out.print(" ");
				 }
				 else{
					 System.out.print("W"+" ");
					  num++;
				 }
				 j++;
				
			 }
			 System.out.println();
			 i++;
		 }
	 }
 }

 
/* 4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS*/

//a)

		 

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
			
        
				
			
			
			
		
		