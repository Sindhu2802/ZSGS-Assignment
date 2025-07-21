
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



				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
			
        
				
			
			
			
		
		
