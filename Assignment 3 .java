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



/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
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
		
	  
