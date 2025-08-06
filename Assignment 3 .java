/*Day-3 Assignment Questions:*
1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/

//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student {
	 String name;
	 int rollno;
}
class Studentdetails{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		Student stu = new Student();
		System.out.println("Enter the student Name : ");
		stu.name = scan.nextLine();
		
		System.out.println("enter the RollNo ");
	    stu.rollno = scan.nextInt();
		
		System.out.println("Student name  " + stu.name);
		System.out.println("Roll NO " + stu.rollno);
		scan.close();
	}
	}


/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.*/

class students{
	String name; 
	int roll_no;
	long phone_no;
	String address; 
	
   public students(String name , int roll_no ,long phone_no , String address)
   {
	 this.name = name;
	 this.roll_no = roll_no; // constructors
	 this.phone_no= phone_no;
	 this.address = address;
	 }
	public void display()
	{ // void means does not return any value 
	 System.out.println("Name : " + name); //  display 
	 System.out.println("Roll No : " + roll_no);
	 System.out.println("Phone NO : " + phone_no);
	 System.out.println("Address : " + address);
    }
}
class Studentinfo{
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 
		  //first student 
		 System.out.println("Enter the FirstStudent name : ");
		 String name1st = scan.nextLine();
		 
		 System.out.println("Enter the RollNO ");
		 int roll_no1st = scan.nextInt();
		
		 System.out.println("Enter the Phone_no");
		 long phone_no1st = scan.nextLong();
		 
		 System.out.println("Enter the address");
		 String address1st = scan.next();
		 scan.nextLine();

        //second students 
		
		 System.out.println("Enter the secondStudent name : ");
		 String name2nd = scan.nextLine();
		 
		 System.out.println("Enter the RollNO ");
		 int roll_no2nd = scan.nextInt();
		
		 System.out.println("Enter the Phone_no");
		 long phone_no2nd = scan.nextLong();
		 
		 System.out.println("Enter the address");
		 String address2nd = scan.next();

		 
		 students stu1 = new students(name1st,roll_no1st,phone_no1st,address1st);
		 students stu2 = new students(name2nd,roll_no2nd,phone_no2nd,address2nd);
		 
		
		 System.out.println("Display the Firststudents details ");
		 stu1.display();
		 
		 System.out.println("Display the secondstudents details ");
		 stu2.display();
		
		scan.close();
	}
	
}
		 
/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/


class Employees{
	String employee_name;
	int employee_id;
	String designation;
	int salary;
	
	public Employees()
	{
		// default constructor
       this.employee_name = "default" ;
		this.employee_id = 0 ;
		this.designation  = "default";
		this.salary = 0 ;
	}
	public Employees(String  employee_name , int employee_id , String designation , int salary)
	{
		//parametrized constructors
		
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.designation = designation;
		this.salary = salary;
		
	}
	
	Employees(Employees em)
	{
		//copy constructor
		this.employee_name = em.employee_name;
		this.employee_id =  em.employee_id;
		this.designation = em.designation;
		this.salary = em.salary;
	
	}
	
	void displaydetails(){
		System.out.println(" Employee name: " + employee_name);
		System.out.println(" Employee id : " + employee_id);
		System.out.println("Designation : " + designation);
		System.out.println(" Salary : " + salary);
		System.out.println();
	}
}
	
class Employeesdetails{
		public static void main(String[] args)
		{
			Employees em1 = new Employees(); //default constructor
			
			Employees em2 = new Employees("Sindhu",2,"HR",12000); // parametrized constructor
			
			Employees em3 = new Employees(em2); //copy constructor
			
			
			
			System.out.println("default constructor" );
			em1.displaydetails();
			
			System.out.println("Display parametrized constructor ");
			em2.displaydetails();
			
			System.out.println("Display the copy constructor");
			em3.displaydetails();
			

		}
	}
	
	
//4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.

class Vehicle{
	static int vehicleCount =0;
	int vehicle_id ;
	String brandName;
	double price;

public Vehicle(String brandName ,double price)
{
	this.brandName = brandName;
	this.price = price;
	vehicleCount++;
	this.vehicle_id = vehicleCount;
}
}
class  Vehicleinfo{
	public static void main(String[]args)
	{
		Vehicle vec1 = new Vehicle("Hyundai",25000.0);
		Vehicle vec2 = new Vehicle("SUV",30000.0);
		Vehicle vec3 = new Vehicle("Hatchback",40000.0);
		Vehicle vec4 = new Vehicle("Aadii",60000.0);
       System.out.println("Vehicle id : " + vec1.vehicle_id + "  vehicle brand name " + vec1.brandName + "  vehicle price " + vec1.price);
       System.out.println("Vehicle id : " + vec2.vehicle_id + "  vehicle brand name " + vec2.brandName + "  vehicle price " + vec2.price );
       System.out.println("Vehicle id : " + vec3.vehicle_id + "  vehicle brand name " + vec3.brandName + "  vehicle price " + vec3.price );
       System.out.println("Vehicle id : " + vec4.vehicle_id + "  vehicle brand name " + vec4.brandName + "  vehicle price " + vec4.price );
	   
	   System.out.println("Total vehicle count " + Vehicle.vehicleCount );
	}
}
 
 
 /*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/



/*5 Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/


class Employeethree{
	String name;
	int year_of_joining;
	int salary;
	String address;
 
 public Employeethree(String name , int year_of_joining,int salary,String address)
 {
	 this.name = name;
	 this.year_of_joining = year_of_joining;
	 this.salary = salary;
	 this.address = address;
 }
  void displaydetails()
  {
	  System.out.println("Name of the employee name " + name );
	  System.out.println("year of joining :  " + year_of_joining );
	  System.out.println("salary " + salary);
	  System.out.println("address" + address );
  }
}

class Employeeinformation{
	public static void main(String[] args)
	{
		Employeethree emp1 = new Employeethree("Robert",1994,20000,"64c- Wallstreet");
		
		Employeethree emp2 = new Employeethree("Sam",2000,30000,"68D-WallsStreat");
		
		Employeethree emp3 = new Employeethree("John",1999,40000,"26B-WallsStreat");
		
		System.out.println("Display the details");
		emp1.displaydetails();
		emp2.displaydetails();
		emp3.displaydetails();
	}
}


import java.util.Scanner;

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
class Firstbit {
    public static void main(String[] args) {
        int numBit = 6;
        int pos = 1;

        if (numBit == 0) {
            System.out.println("No Set Bit found for Zero");
        } else {
            while ((numBit & 1) == 0) {
                numBit = numBit >> 1;
                pos++;
            }
            System.out.println("The Position of the First Set Bit is : " + pos);
        }
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
 /*R R R R
  R     R
  R R R R
  R    R
  R     R */
class pattern2{
	public static void main(String[] args){
		int rows = 5;
		int col = 4;
		for(int i=1;i <= rows;i++){
			for(int j=1;j <= col;j++){
				if(i == 1 || i == 3){
					System.out.print("R ");
		        }else if(j==1 || (i == 2 && j == col) || (i == 4 && j == 3)  || (i == 5 && j == 4)){
					System.out.print("R ");
				}else{
					System.out.print("  ");
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
 4   5   6
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
/*3.B. w
       w w 
	   w w w 
	   w w
	   w   */
	   
class pattern4{
	public static void main(String[] args){
		int r=3;
		int i=1;
		while(i <= r){
			
			int j=1;
			
			while(j <= i){
				System.out.print("W ");
				j++;
			}
			System.out.println();
			i++;
		}
		i=r-1;
		while(i >= 1){
			int j=1;
			while(j <= i){
				System.out.print("W ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}

 
/*4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS*/

//a Pascal Triangle
     /*1
	 1  1
    1  2  1
  1  3   3  1*/	
class pascal{
	public static void main(String[]  args)
	{
		int n =4;
		int i=0;
		
		do {
			int space =0;
			do{
				System.out.print(" "); // space 
				space++;
			}while(space< n -i);
			int j=0;
			int value=1;
			do{
				if(j == 0 || i == 0)
				{
					value =1;
				}
				else{
					value = value * (i - j + 1 )/j;
				}
				System.out.print(value+ " ");
				j++;
			}
			while(j <= i );
			System.out.println();
			i++;
		}
		while(i < n);
	}
 }


/*b) ZOHO
CORP
ORAT
IONS*/

class zohocorp{
	public static void main(String[] args)
	{
		String str  = "ZOHOCORPORATIONS";
		int n = 4;
		int i = 0;
		int length = str.length();
		do{
			int j=0;
			do{
				if(i + j < length)
				{
					System.out.print(str.charAt(i+j));
				}
				j++;
			}
			while(j < n );
			System.out.println();
			i += n;
		}
		while(i < length);
	}
}


 

//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class even{
	
	static int evensum(int n)
	{
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			if(i%2 != 0)
			{
				continue; 
			}
			sum += i ; //sum of even numbers
			
		}
		
		return sum;
	}
				
	public static void main(String[] args)
	{
		int n = 10;
		int sumOf = evensum(n);
		System.out.println("The sumof even numbers from the series " + sumOf );
	}
}

//6. Define a method to convert the decimal number to a binary number?

 class decimal{
	 static String decimaltobinary(int num)
	 {
		
		 int temp = num; //create temp variable store the num value
		 String binary = ""; //store the decimal to binary value 
		 
		 while(temp >0)
		 {
			 int rem = temp % 2;
			 binary = rem + binary;
			 temp /= 2;
		 }
		 
		 return binary; 
	 }
	 public static void main(String[] args)
	 {
		 int num = 10;
		 String result = decimaltobinary(num);
		 System.out.println("decimal number to binary number value is " + result);
	 }
 }
 
 
 
/*7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

class student{
	public static void main(String[] args)
	{
		int percen = 65;
		int grade ;
		if(percen>=85 && percen<=100)
		{
			grade = 3;
		}
		else if(percen >= 70)
		{
			grade = 2;
		}
		else if(percen >=50)
		{
			grade =1;
		}
		else{
			grade =0;
		}
		switch(grade)
		{
			case 3 : 
			  System.out.println("Grade 'A' . Excellent marks");
			break;
			case 2:
			   System.out.println("Grade 'B' .Good marks ");
			   break;
			case 1:
			   System.out.println("Grade 'C'");
			   break;
			default :
			    System.out.println("Fail marks");
		}
	}
}
			
	
/*Day-2 Assignment Questions: Part-2 Arrays*
1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
2. Write a program to take in 10 values and print only those numbers which are prime.
3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

class oddsum{
	public static void main(String[] args)
	{
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter  the size of the elements ");
		int arr = scan.nextInt();
		int[] num = new int[arr];
		System.out.println("enter the elements");
		int sum =0;
		for(int i=0;i<arr;i++)
		{
			num[i] = scan.nextInt();
		}
		for(int i=0;i<arr;i++)
		{
			if(num[i] % 2 != 0)
			{
				sum += num[i];
			}
			
		}
		System.out.println("sum of odd numbers " + sum );
		scan.close();
	}
}	
			
//2. Write a program to take in 10 values and print only those numbers which are prime.

class prime{
	static boolean isprime(int n)
	{
		
		if(n <=1)
		{
			return false;
		}
		for(int i =2;i*i <= n;i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
    public static void main(String[] args)
	{
    int[] elements = {2,1,4,5,15,17,7,19,0,7};
	System.out.println("prime elements in the array : ");
	for(int values : elements)
	{
		if(isprime(values)) // valid prime numbers are print
		{
			System.out.println(values + " ");
		}
	}	
	}
}

//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class fibonacci{
	public static void main(String[] args)
	{
		int num = 30;
		long[] val = new long[num];
		val[0] = 1; //1st term
		val[1] = 1; // 2nd term
		for(int i =2;i<num;i++)
		{
			val[i] = val[i-1] + val[i-2]; 
		}
		System.out.println("the fibonacci series 30 terms are " );
		for(int i=0;i<num;i++)
		{
			System.out.println(val[i] + " "); //print the all fibonacci series values
		}
	}
}

//4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
 class single{
	 public static void print(int[] x,int num)
	 {
		 int sinSum =0;
		 int doubleSum =0;
		 for(int i=0;i<num;i++)
		 {
			 if(x[i] >= 0 && x[i] <= 9)
			 {
				 sinSum+= x[i];
			 }
			 else if(x[i]>= 10 && x[i] <= 99)
			 {
				 doubleSum+= x[i];
			 }
		 }
		 System.out.println("the sum of single num is "+ sinSum);
		 System.out.println("the sum double num is "+ doubleSum);
	 }
	 public static void main(String[] args)
	 {
		 int[] x = {4,5,1,2,55,75,64,76,88,87};
		 int num =10;
		 print(x,num);
		 
	 }
 }
 
/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/

class identical{
	public static void main(String[]args)
	{
		char[] X = {'m','n','o','p'};
		char[] Y={'m','n','o','p'};
		boolean identicalchar = true;
	    for(int i=0;i<X.length;i++)
		{
			if(X[i] != Y[i])
			{
				identicalchar = false;
				break;
			}
		}
		if(identicalchar)
		{
			System.out.println("Two arrays are identical");
			}
			else{
				System.out.println("two are not identical");
				}
	}
}

/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/

class graduation{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
		System.out.println("enter the year of graduation : ");
		int yr = scan.nextInt();
		int left =0; //start of  the array
		int right = arr.length; // end of the array
		int ind = -1;
		while(left <= right) 
		{
			int mid = (left+right)/2; //middle value check
			if(arr[mid] == yr)
			{
				ind = mid;
				break;
			}
			else if(arr[mid] < yr)
			{
				left = mid+1;
			}
			else{
				mid = mid-1;
			}
		}
		if(ind == -1) 
		{
			System.out.println("Record not exists");
		}
		else{
			System.out.println("Record is exists");
		}
	}
	
}

//7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

class weight{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double arr[] = new double[10]; // weight value is 45.5 so i declare double datatype
		System.out.println("enter weight of ten members");
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextDouble();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			int max =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] > arr[max])
				{
					max=j;
				}
			}
			double temp = arr[i]; //swap the value so create temp variable
			arr[i] = arr[max];
			arr[max]=temp;
		}
		System.out.println("descending order :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("weight " + arr[i]); //print the descending order 
		}
		scan.close();
	}
}

//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
class age{
	public static void main(String[] args)
	{
		int[] ages = {23,43,11,44,55,65,12,33,21,76};
		
        int below18count =0;
		int betw18to60count=0;
		int above60count=0;
		System.out.println("enter the ages 10 people");
		for(int i : ages)
		{
			if(i < 18){
				below18count++;
			}
			else if(i>=18 && i<= 60)
			{
				betw18to60count++;
			}
			else
			{
				above60count++;
			}
		}
        System.out.println("Number of below18 people " + below18count);
		System.out.println("Number of between 18 to 60 people " + betw18to60count);
		System.out.println("Number of above60 people " + above60count);
	}
}

//9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

class subjects{
	public static void main(String[] args)
	{
		int[] rollNo = {201,202,203,204,205,206,207,208,209,210};
		int[] subject1 = {54,66,76,54,32,67,88,98,99,87};
		int[] subject2 ={45,56,43,57,76,89,65,78,65,78};
		int[] subject3 ={44,54,56,76,44,56,76,23,76,45};
		int total_marks[]=new int[10];
		int[] avg=new int[10];
		System.out.println("Roll NO   |  Marks  |     Average");
		System.out.println("________________________________________");
		for(int i =0;i<rollNo.length;i++)
		{
			total_marks[i] += subject1[i] + subject2[i]+subject3[i];
			avg[i] = total_marks[i]/3;
			System.out.println(rollNo[i]   + "     |    "  +   total_marks[i]  +  "   |     " +     avg[i]   );
		}
	}
}
			
		
		


/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

class matrix{
	//input elements 
	public static void inputElements(int[][] mat,int r,int c,Scanner scan)
	{
	   System.out.println("enter mat elements ");
	   for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			   mat[i][j] = scan.nextInt();
		   }
		   
	   }
	}
	//display elements of matrix
	public static void displayMat(int[][] mat,int r,int c)
	{
		System.out.println("display matrix ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	//sum of all elements
	public static void sumOf(int[][] mat,int r,int c)
	{
		int sum=0;
		for(int[] row:mat)
		{
			for(int res:row)
			{
				sum+= res;
			}
		}
		System.out.println("the sum of "+sum );
	}


//row-wise sum of elements
    public static void rowwise(int[][]mat,int r,int c)
	{
		System.out.println("Row wise sum :");
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			sum +=  mat[i][j];
			}
			System.out.println("Row-wise" + (i+1) + sum);
		}
	}
//column wise sum 
     public static void columnwise(int[][] mat,int r,int c)
	 {
		 System.out.println("column wise sum :");
		 int sum=0;
		 for(int j=0;j<c;j++)
		 {
			 for(int i=0;i<r;i++)
			 {
			sum +=  mat[i][j];
			}
			System.out.println("column-wise" + (j+1) + sum);
			}
	 }

     public static void transposemat(int[][] mat,int r,int c)
	{
		System.out.println("Transpose matrix");
		for(int j=0;j<c;j++)
		{
			for(int i=0;i<r;i++)
		{
			System.out.println(mat[i][j] + " ");
		}
		System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter number of rows ");
		int r = scan.nextInt();
		System.out.print("enternumber of columns");
		int c =scan.nextInt();
		int[][] mat=new int[r][c];
		while(true)
		{
			System.out.println("1 . input elements");
			System.out.println("2 . display matrix");
			System.out.println("3 . sum of all elements");
			System.out.println("4. Row-wise sum");
			System.out.println("5. Column-wise sum");
			System.out.println("6. Transpose matrix");
		   
		    System.out.println("enter the options ");
			int options = scan.nextInt();
			
			switch(options)
			{
				case 1:
				  inputElements(mat,r,c,
				  scan);
				  break;
				case 2:
				  displayMat(mat,r,c);
				  break;
				case 3:
			      sumOf(mat,r,c);
				  break;
				case 4:
				  rowwise(mat,r,c);
				  break;
				case 5:
				  columnwise(mat,r,c);
				  break;
				case 6:
	              transposemat(mat,r,c);
				  break;
				  default:
				  System.out.println("invalid options");
			}
		}
	}
}
	
	
/*Day-2 Assignment Questions: Part-3 Strings
1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
‌
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
‌
3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
‌
4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
‌
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
‌
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
‌
7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
‌
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.	*/

/*1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

class binaryadd{
	public static String addBinary(String a ,String b)
	{
		StringBuilder result = new StringBuilder();
		int i = a.length()-1; // last digit value 1st add valueof a  
		int j =b.length()-1; // last digit value 1st add value of b
		int carry =0;
        while(i>=0 || j>=0 || carry==1)
		{
			int sum = carry;
			if(i>=0)
			{
				sum += a.charAt(i) - '0';
				i--;
			}
			if(j>=0)
			{
				sum += b.charAt(j)-'0';
			    j--;
			}
			result.append(sum % 2);
		    carry= sum /2; // carry give 1 loop is run
		}
		 return result.reverse().toString();
		
	} 
    public static void main(String[] args)
	{
	   String a1 = "11";
	   String b1 = "1";
	   System.out.println(addBinary(a1,b1));
	   String a2 =  "1010";
	   String b2 = "1011";
	   System.out.println(addBinary(a2,b2));
	}
}
      	



/*2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1*/

class columnnum{
	public String columnTitle(int columnNumber)
	{
		String res = "";
		//int columnNumber =1;
		while(columnNumber > 0)
		{
			columnNumber--; //adjustment base
			int rem = columnNumber% 26;
			char ch = (char)('A' + rem);
			res= ch + res;
			columnNumber = columnNumber /26;
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter column number ");
		int columnNumber = scan.nextInt();
		columnnum obj= new columnnum();
		String column = obj.columnTitle(columnNumber);
		System.out.println("excel sheet column "+column);
	}
}

/*3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.	*/
class vowels{
	public  static String rev(String str)
	{
		char ch[] = str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			while(left < right && !isVowel(ch[left])){
			left++;
			}
			while(left<right && !isVowel(ch[right]))
			{
				right--;
			}
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		return new String(ch);
	}
	static boolean isVowel(char s)
	{
		if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		String str = "leetcode";
		String res = rev(str);
		System.out.println("Reversed vowels string : "+ res);
		
	}
}

		
/*4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.*/

class random{
	public static Character difference(String s, String t)
	{
		int sum =0;
		for(int i=0;i<t.length();i++)
		{
			sum += t.charAt(i); 
		}
		for(int i=0;i<s.length();i++)
		{
			sum -= s.charAt(i); 
		}
		return (char)sum; //return  the value of char type 
	}
	public static void main(String[] args)
	{
		String s1 ="abcd";
		String t1 ="abcde";
		System.out.println(difference(s1,t1));
		String s2 = "";
		String t2 = "Y";
		System.out.println(difference(s2,t2));
	}
}

/*5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?*/

class subsequence{
	public  static boolean isSubseq(String s, String t)
	{
		int left =0;
		int right=0;
		while(left < s.length() && right < t.length())
		{
			if(s.charAt(left) == t.charAt(right))
			{
				left++;
			}
			right++;
		}
		return left == s.length();
	}
	public static void main(String[] args)
	{
		String s1 = "abc";
		String t1 = "ahbgdc";
		System.out.println(isSubseq(s1,t1));
		String s2 = "axc";
		String t2 = "ahbgdc";
		System.out.println(isSubseq(s2,t2));
	}
	
}
				
/*6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself*/

	
class str{
	
	 public static String addstr(String s1,String s2)
	 {
		 int i =s1.length()-1; //last value
		 int j=s2.length()-1;
		 int carry=0;
		 StringBuilder result = new StringBuilder();
		 while(i>=0 || j>=0 || carry != 0)
		 {
			 int digit1 = i>=0 ? s1.charAt(i) - '0' : 0; //ASCII VALUE  - '0'
			 int digit2 = j>=0 ? s2.charAt(j)- '0' : 0;
			 int sum = digit1 + digit2 + carry; 
			 carry = sum /10;
			 result.append (sum % 10);
			 i--;
			 j--;
		 }
		 return result.reverse().toString(); 
	 }
	 public static void main(String[] args)
	 {
		 String s1 = "11";
		 String s2 ="123";
		 System.out.println(addstr(s1,s2));
		 String s3 = "456";
		 String s4 ="77";
		 System.out.println(addstr(s3,s4));
		 String s5 = "0";
		 String s6 ="0";
		 System.out.println(addstr(s5,s6));
	 }
}
		 
/*7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/

class segments{
	public static int countnumber(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) 
			{
				count++; //  count to the words
			}
		}
		return count ;
	}
   public static void main(String[] args)
   {
	   String s = "Hello,my name is John";
	   System.out.println(countnumber(s));
	   String s1 = "Hello";
	   System.out.println(countnumber(s1));
   }
}

/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.	*/


class capital{
	public static boolean capitalLetter(String word)
	{
		int capcount =0;
		for(int i=0;i<word.length();i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
			{
				capcount++;
			}
		}
		if(capcount == word.length()) // word length and capital letters count are same return true
		{
			return true;
		}
		if(capcount == 0)
		{
			return true; //incase count 0 check
		}
		if(capcount == 1 && Character.isUpperCase(word.charAt(0)))
		{
			return true; //incase count 1 and uppercase in 1st letter
		}
		return false; //otherwise false
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words are : ");
		String word = scan.nextLine();
		
		
		System.out.println(capitalLetter(word));
		//System.out.println("Capital letters count "+count);
		

	}
}




/*Day-3 Assignment Questions:*
1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/

//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student {
	 String name;
	 int rollno;
}
class Studentdetails{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		Student stu = new Student();
		System.out.println("Enter the student Name : ");
		stu.name = scan.nextLine();
		
		System.out.println("enter the RollNo ");
	    stu.rollno = scan.nextInt();
		
		System.out.println("Student name  " + stu.name);
		System.out.println("Roll NO " + stu.rollno);
		scan.close();
	}
	}


/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.*/

class students{
	String name; 
	int roll_no;
	long phone_no;
	String address; 
	
   public students(String name , int roll_no ,long phone_no , String address)
   {
	 this.name = name;
	 this.roll_no = roll_no; // constructors
	 this.phone_no= phone_no;
	 this.address = address;
	 }
	public void display()
	{ // void means does not return any value 
	 System.out.println("Name : " + name); //  display 
	 System.out.println("Roll No : " + roll_no);
	 System.out.println("Phone NO : " + phone_no);
	 System.out.println("Address : " + address);
    }
}
class Studentinfo{
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 
		  //first student 
		 System.out.println("Enter the FirstStudent name : ");
		 String name1st = scan.nextLine();
		 
		 System.out.println("Enter the RollNO ");
		 int roll_no1st = scan.nextInt();
		
		 System.out.println("Enter the Phone_no");
		 long phone_no1st = scan.nextLong();
		 
		 System.out.println("Enter the address");
		 String address1st = scan.next();
		 scan.nextLine();

        //second students 
		
		 System.out.println("Enter the secondStudent name : ");
		 String name2nd = scan.nextLine();
		 
		 System.out.println("Enter the RollNO ");
		 int roll_no2nd = scan.nextInt();
		
		 System.out.println("Enter the Phone_no");
		 long phone_no2nd = scan.nextLong();
		 
		 System.out.println("Enter the address");
		 String address2nd = scan.next();

		 
		 students stu1 = new students(name1st,roll_no1st,phone_no1st,address1st);
		 students stu2 = new students(name2nd,roll_no2nd,phone_no2nd,address2nd);
		 
		
		 System.out.println("Display the Firststudents details ");
		 stu1.display();
		 
		 System.out.println("Display the secondstudents details ");
		 stu2.display();
		
		scan.close();
	}
	
}
		 
/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/


class Employees{
	String employee_name;
	int employee_id;
	String designation;
	int salary;
	
	public Employees()
	{
		// default constructor
       this.employee_name = "default" ;
		this.employee_id = 0 ;
		this.designation  = "default";
		this.salary = 0 ;
	}
	public Employees(String  employee_name , int employee_id , String designation , int salary)
	{
		//parametrized constructors
		
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.designation = designation;
		this.salary = salary;
		
	}
	
	Employees(Employees em)
	{
		//copy constructor
		this.employee_name = em.employee_name;
		this.employee_id =  em.employee_id;
		this.designation = em.designation;
		this.salary = em.salary;
	
	}
	
	void displaydetails(){
		System.out.println(" Employee name: " + employee_name);
		System.out.println(" Employee id : " + employee_id);
		System.out.println("Designation : " + designation);
		System.out.println(" Salary : " + salary);
		System.out.println();
	}
}
	
class Employeesdetails{
		public static void main(String[] args)
		{
			Employees em1 = new Employees(); //default constructor
			
			Employees em2 = new Employees("Sindhu",2,"HR",12000); // parametrized constructor
			
			Employees em3 = new Employees(em2); //copy constructor
			
			
			
			System.out.println("default constructor" );
			em1.displaydetails();
			
			System.out.println("Display parametrized constructor ");
			em2.displaydetails();
			
			System.out.println("Display the copy constructor");
			em3.displaydetails();
			

		}
	}
	
	
//4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.

class Vehicle{
	static int vehicleCount =0;
	int vehicle_id ;
	String brandName;
	double price;

public Vehicle(String brandName ,double price)
{
	this.brandName = brandName;
	this.price = price;
	vehicleCount++;
	this.vehicle_id = vehicleCount;
}
}
class  Vehicleinfo{
	public static void main(String[]args)
	{
		Vehicle vec1 = new Vehicle("Hyundai",25000.0);
		Vehicle vec2 = new Vehicle("SUV",30000.0);
		Vehicle vec3 = new Vehicle("Hatchback",40000.0);
		Vehicle vec4 = new Vehicle("Aadii",60000.0);
       System.out.println("Vehicle id : " + vec1.vehicle_id + "  vehicle brand name " + vec1.brandName + "  vehicle price " + vec1.price);
       System.out.println("Vehicle id : " + vec2.vehicle_id + "  vehicle brand name " + vec2.brandName + "  vehicle price " + vec2.price );
       System.out.println("Vehicle id : " + vec3.vehicle_id + "  vehicle brand name " + vec3.brandName + "  vehicle price " + vec3.price );
       System.out.println("Vehicle id : " + vec4.vehicle_id + "  vehicle brand name " + vec4.brandName + "  vehicle price " + vec4.price );
	   
	   System.out.println("Total vehicle count " + Vehicle.vehicleCount );
	}
}
 
 
 /*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/


		





/*5.. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/


class Employeethree{
	String name;
	int year_of_joining;
	int salary;
	String address;
 
 public Employeethree(String name , int year_of_joining,int salary,String address)
 {
	 this.name = name;
	 this.year_of_joining = year_of_joining;
	 this.salary = salary;
	 this.address = address;
 }
  void displaydetails()
  {
	  System.out.println("Name of the employee name " + name );
	  System.out.println("year of joining :  " + year_of_joining );
	  System.out.println("salary " + salary);
	  System.out.println("address" + address );
  }
}

 class Employeeinformation{
	public static void main(String[] args)
	{
		Employeethree emp1 = new Employeethree("Robert",1994,20000,"64c- Wallstreet");
		
		Employeethree emp2 = new Employeethree("Sam",2000,30000,"68D-WallsStreat");
		
		Employeethree emp3 = new Employeethree("John",1999,40000,"26B-WallsStreat");
		
		System.out.println("Display the details");
		emp1.displaydetails();
		emp2.displaydetails();
		emp3.displaydetails();
	}
}


/* 6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. 
Your class should store character data internally (e.g., using a char[] or String as input) and should provide the 
following string methods, 
1. int length() – Returns the number of characters.
 2. char charAt(int index) – Returns the character at the specified index.
 3. boolean equals(MyString other) – Checks if two MyString objects are equal.
 4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
 5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
 6. MyString substring(int start, int end) – Returns a substring from start to end-1.
 7. MyString concat(MyString other) – Concatenates another string to the current one.
 8. boolean contains(MyString sub) – Checks if a substring exists.
  9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
 10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
 * Implement proper constructors, including one that takes a char[] or String as input.
 * Avoid using any built-in String methods to perform the operations internally.
 * Write a main method to demonstrate the working of your MyString class*/


class MyString{
	private char[] arr;
	
	MyString(String s)
	{
		this.arr = s.toCharArray(); //constr
	}
	 //1. int length() – Returns the number of characters.
	 public int length(){
		 return arr.length;
	 }
	 
	 //2. char charAt(int index) – Returns the character at the specified index.
	 public char charAt(int i){
		 return arr[i];
	 }
	 //3. boolean equals(MyString other) – Checks if two MyString objects are equal.
	  public boolean equal(MyString arr3) {
        if (arr.length != arr3.arr.length){
             
		    return false;
		}

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr3.arr[i]){
                return false;
			}
        }
        return true;
     }
		 
	 //  4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
	 public String UpperCase(){
		 String Upper ="";
		 for(int i=0;i<arr.length;i++)
		 {
			 if((arr[i] >= 'a') && (arr[i] <= 'z'))
			 {
				 Upper += (char)(arr[i] - 32);
			 }
			 else{
				 Upper+= arr[i];
			 }
		 }
	     return Upper;
		}
		 
	   // 5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
	   public String LowerCase(){
		   String lower="";
		   for(int i=0;i<arr.length;i++)
		   {
			   if((arr[i] >= 'A') && (arr[i] <= 'Z'))
			   {
				   lower += (char)(arr[i] -32);
			   }
			   else{
				   lower += arr[i];
			   }
		   }
			   return lower;
		   }
		   
		//6. MyString substring(int start, int end) – Returns a substring from start to end-1.
		public String Substr(int start ,int end)
		{
			String sub="";
			for(int i=start;i<end;i++)
			{
				sub += arr[i];
			}
			return sub;
		}
		
		//7. MyString concat(MyString other) – Concatenates another string to the current one.
		 public String concat(String conc)
		 {
			 return new String(arr) + conc;
		 }
		 
		 //8. boolean contains(MyString sub) – Checks if a substring exists.
		 public boolean contains(String sub)
		 {
			 char[] c2 = sub.toCharArray();
			 for(int i=0;i<= arr.length - c2.length;i++)
			 {
				 int j;
				 for( j=0;j<c2.length;j++)
				 {
					 if(arr[i+j]  != c2[j])
					 {
						 break;
					 }
				 }
				 if(j == c2.length)
				 {
					 return true;
				 }
			 }
			 return false;
		 }
		 
		 
		 
		 //9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
		 public int indexOf(int c)
		 {
			 for(int i=0;i<arr.length;i++)
			 {
				 if(arr[i] == c)
				 {
					 return i;
				 }
				
			 }
			  return -1;
		 }
		 
		//10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
		public String replace(int oldch,int newch)
		{
			char[] replacedchar = new char[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] == oldch)
				{
					replacedchar[i] =(char) newch;
				}
				else{
					replacedchar[i] = arr[i];
				}
			}
			return new String(replacedchar);
		}
		
	javac InbuildWithoutcode.java
java InbuildWithoutcode
class InbuildWithoutcode{
		
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your string :");
			String str = scan.nextLine();
			MyString MS = new MyString(str);
			int options = scan.nextInt();
			scan.nextLine();
			while(true)
			{
				System.out.println("Choose the options of the list :");
				System.out.println("1 . int length() ");
				System.out.println("2 . character at the specified index");
				System.out.println("3 . Two string obj are equal");
                System.out.println("4 . New string with Uppercase ");
                System.out.println("5 . New string with lowercase");
                System.out.println("6 . Substring to start to end");
                System.out.println("7 . Concat another string to current one");
                System.out.println("8 . Boolean contains - checks if substring exicts");
                System.out.println("9 . Index of first occurrence the char");
                System.out.println("10 . Replace all occurrences of a char");

         switch(options)
		 {
            case 1 :
               System.out.println("	int length() no of character " + MS.length());
               break;
            
			case 2:
			  System.out.println("Enter the index : ");
			   int index = scan.nextInt();
              System.out.println("	character at the specified index" + MS.charAt(index));
         	  break;
			
			case 3 :
			   System.out.println("Enter string to comapare");
			   String str1 = scan.nextLine();
			   MyString s2 = new MyString(str1);
			   System.out.println("Two string obj are equal " + MS.equal(s2));
			   break;
			
			case 4 :
			   System.out.println(" Uppercase " + MS.UpperCase());
			   break;
			
			case 5:
                System.out.println("Lowercase: " + MS.LowerCase());
                 break;
			
			case 6:
                 System.out.print("Enter start index: ");
                 int start = scan.nextInt();
                 System.out.print("Enter end index: ");
                 int end = scan.nextInt();
                  System.out.println("Substring: " + MS.Substr(start, end));
                  break;

            case 7:
                  System.out.print("Enter string to concat: ");
                  String concatStr = scan.nextLine();
                  System.out.println("Concatenated: " + MS.concat(concatStr));
                  break;

            case 8:
                  System.out.print("Enter substring to check: ");
                  String subStr = scan.nextLine();
                  System.out.println("Contains? " + MS.contains(subStr));
                 break;

            case 9:
                  System.out.print("Enter character to find: ");
                  char ch = scan.nextLine().charAt(0);
                  System.out.println("Index of " + ch + ": " + MS.indexOf(ch));
                  break;

            case 10:
                  System.out.print("Enter old character: ");
                  char oldCh = scan.nextLine().charAt(0);
                  System.out.print("Enter new character: ");
                  char newCh = scan.nextLine().charAt(0);
                  System.out.println("Replaced String: " + MS.replace(oldCh, newCh));
                  break;

              default:
                   System.out.println("Invalid option! Try again.");
				}
			}
		}
	}
}

/*Enter your string :
AnbuSelvam
Choose the options of the list :
1 int length()
2 specified index()
3 obj are equal
4 Uppercase()
5 lowercase()
6 Substring ()
7 Concat ()
8 Boolean contains ()
9 Index of first ()
10Replace all occurrences ()

1
int length() no of character 10

2
Enter the index :
2
character at the specified index = b

3
Enter string to comapare
sindhu
Two string obj are equal ?false

3
Enter string to comapare
AnbuSelvam
Two string obj are equal ?true

4
Uppercase ANBUSELVAM

5
Lowercase: anbuselvam

6
Enter start index: 2
Enter end index: 4
Substring: bu

7
Enter string to concat: kumar
Concatenated: AnbuSelvamkumar

8
Enter substring to check: Selvam
Contains? true

9
Enter character to find: l
Index of l: 6
9
Enter character to find: q
Index of q: -1

10
Enter old character: n
Enter new character: i
Replaced String: AibuSelvam*/

	  
