/*Day-7 Assignment Questions:*
1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a
saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario.
 Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement
 required member variables and methods in each class.
Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
}
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI extends public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI extends public RBI
{
//Use RBI functionality or define own functionality.
}
‌
2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
 Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment 
 using different methods.
‌
3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). 
Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
‌
4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary().
 Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
 Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
‌
5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as *Bus*, *Train*, and *Flight*.
Define a common interface or abstract class `Ticket` with a method `bookTicket()` that each transportation mode must implement differently.
Create classes `BusTicket`, `TrainTicket`, and `FlightTicket` that extend the abstract class or implement the interface.
Demonstrate *runtime polymorphism* by calling the `bookTicket()` method using a reference of the base class/interface.*/


/*1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, 
minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account 
to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and 
few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
}
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI extends public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI extends public RBI
{
//Use RBI functionality or define own functionality.
}*/

class Customer{
	private String name;
	private long phone_No;
	
	public Customer(String name,long phone_No)
	{
		this.name = name;
		this.phone_No = phone_No;
	}
	
	public void displayCustomer(){
		System.out.println("Account holder Name : " + name);
		System.out.println("Account phone no : "+ phone_No);
	}
}

class Account{
	private String accountNumber;
	private String IFSCcode;
	private double balance;
	
	public Account(String accountNumber,String IFSCcode,double balance)
	{
		this.accountNumber = accountNumber;
		this.IFSCcode = IFSCcode;
		this.balance = balance;
	}
	public void displayAccount(){
		System.out.println("Account number " + accountNumber);
		System.out.println("IFSCCODE " + IFSCcode);
		System.out.println("Balance :" + balance);
	}
}

class RBI{
	Customer c;
	Account a;
	
	public RBI(Customer c, Account a)
	{
		this.c =c;
		this.a =a;
	}
	
	public double getInterestRate()
	{
		return 2.0;
	}
	
	public double  getWithdrawalLimit()
	{
		return 1000.00;
		
	}
	
	void displayDetails(){
		System.out.println("RBI Bank information :");
		c.displayCustomer();
		a.displayAccount();
		System.out.println("RBI bank InterestRate : " + getInterestRate());
		System.out.println("RBI bank withdrawal limit :" + getWithdrawalLimit());
	}
}

class SBI extends RBI{
	
	public SBI(Customer c, Account a){
		super(c,a);
	}
	public double getInterestRate(){
		return 3.0;
	}
	public double getWithdrawalLimit(){
		return 500.00;
	}
	
	public void displayDetails(){
		System.out.println("SBI bank information ;");
		c.displayCustomer();
		a.displayAccount();
		System.out.println("SBI bank InterestRate : "+  getInterestRate());
		System.out.println("SBI bank withdrwal limit :" + getWithdrawalLimit());
	}
}

class ICICI extends RBI{
	public ICICI (Customer c,Account a){
		super(c,a);
	}
	public double getInterestRate(){
		return 3.5;
	}
	public double getWithdrawalLimit(){
		return 1500.00;
	}
	public void displayDetails(){
		System.out.println("ICICI bank information ;");
		c.displayCustomer();
		a.displayAccount();
		System.out.println("ICICI bank InterestRate : "+  getInterestRate());
		System.out.println("ICICI bank withdrwal limit :" + getWithdrawalLimit());
	}
}

class PNB extends RBI{
	public PNB (Customer c,Account a)
	{
		super(c,a);
	}
	public double getInterestRate(){
		return 4.0;
	}
	public double getWithdrawalLimit(){
		return 1000.00;
	}
	public void displayDetails(){
		System.out.println("PNB bank information ;");
		c.displayCustomer();
		a.displayAccount();
		System.out.println("PNB bank InterestRate : "+  getInterestRate());
		System.out.println("PNB bank withdrwal limit :" + getWithdrawalLimit());
	}
}

class BankingInform{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Raja",98754765);
		Account a1 = new Account("2338799873","876ISOO88",1000);
		SBI s = new SBI(c1,a1);
		s.displayDetails();
		
		Customer c2 = new Customer("gopal",987655434);
		Account a2 = new Account("212379983","876ISO348",30000);
		ICICI i = new ICICI(c2,a2);
		i.displayDetails();
	    
		Customer c3 = new Customer("Jeya",436554765);
		Account a3 = new Account("233872373","8236ISOO88",40000);
		PNB p = new PNB(c3,a3);
		p.displayDetails();
	}
}
	 
/*SBI bank information ;
Account holder Name : Raja
Account phone no : 98754765
Account number 2338799873
IFSCCODE 876ISOO88
Balance :1000.0
SBI bank InterestRate : 3.0
SBI bank withdrwal limit :500.0

ICICI bank information ;
Account holder Name : gopal
Account phone no : 987655434
Account number 212379983
IFSCCODE 876ISO348
Balance :30000.0
ICICI bank InterestRate : 3.5
ICICI bank withdrwal limit :1500.0

PNB bank information ;
Account holder Name : Jeya
Account phone no : 436554765
Account number 233872373
IFSCCODE 8236ISOO88
Balance :40000.0
PNB bank InterestRate : 4.0
PNB bank withdrwal limit :1000.0*/


/*2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
 Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment 
 using different methods.*/
 
 interface PaymentMethod{
	 void pay(double amount);
 }
 
 class CreditCardPayment implements PaymentMethod{
	 public void pay(double amount){
		 System.out.println("Paid amount : " + amount + " using  CreditCardPayment  ");
	 }
 }

 class DebitCardPayment implements PaymentMethod{
	 public void pay(double amount){
		 System.out.println("Paid amount : " +amount + "using in DebitCardPayment");
	 }
 }
	 
class UPIPayment implements PaymentMethod{
	public void pay(double amount){
		System.out.println("Paid amount : " + amount + " using in UPIPayment");
	}
}

class Payment{
	public static void main(String[] args){
         
		CreditCardPayment  credit = new CreditCardPayment();
		DebitCardPayment debit = new DebitCardPayment();
		UPIPayment upi = new UPIPayment();
		credit.pay(2000);
		debit.pay(1000);
		upi.pay(500);
	}
}

/*Paid amount : 2000.0 using  CreditCardPayment
Paid amount : 1000.0using in DebitCardPayment
Paid amount : 500.0 using in UPIPayment*/


/*3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). 
Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.*/

abstract class Employee{
	String name;
	int noOfDayswork;
	
	public Employee(String name,int noOfDayswork){
		this.name = name;
		this.noOfDayswork=noOfDayswork;
	}
	abstract double calculateSalary();
	void display(){
		System.out.println("Employee Name : " + name + " No of days work : " + noOfDayswork);
	}
}

class FullTimeEmployee extends Employee{
	 double monthlySalary;
	  public FullTimeEmployee(String name,int noOfDayswork,double monthlySalary){
		  super(name,noOfDayswork);
		  this.monthlySalary = monthlySalary;
	  }
	  double calculateSalary(){
		  return monthlySalary;
	  }
}

class PartTimeEmployee extends Employee{
	int workingHours;
	int hoursSalary;
	
	public PartTimeEmployee(String name,int noOfDayswork,int workingHours,int hoursSalary)
	{
		super(name,noOfDayswork);
		this.workingHours = workingHours;
		this.hoursSalary = hoursSalary;
	}
	double calculateSalary(){
		return workingHours * hoursSalary;
	}
}

class EmployeeDetails{
	public static void main(String[] args)
	{
		Employee employ1 = new FullTimeEmployee("Veni",15,5000);
		Employee employ2 = new PartTimeEmployee("pandi",30,60,200);
		
		employ1.display();
		System.out.println("Full time employees inform : " + employ1.calculateSalary());
		employ2.display();
		System.out.println("Parttime employees inform : " + employ2.calculateSalary());
	}
}

/*Employee Name : VeniNo of days work : 15
Full time employees inform : 5000.0

Employee Name : pandiNo of days work : 30
Parttime employees inform : 12000.0*/

/*4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary().
 Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. 
 Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.*/
 
 
 interface Employees{
	
	public double calculateSalary();
	void display();
}

class FullTimeEmployees implements Employees{
	private String name;
	private int noOfDayswork;
	private double monthlySalary;
	public FullTimeEmployees(String name,int noOfDayswork,double monthlySalary){
		  this.name = name;
		  this.noOfDayswork=noOfDayswork;
		  this.monthlySalary = monthlySalary;
	  }
	 public double calculateSalary(){
		  return monthlySalary;
	  }
	 public void display(){
		  System.out.println("Employee name : "+ name);
		  System.out.println("No of days work :" + noOfDayswork);
	  }
}

class PartTimeEmployees implements Employees{
	private String name;
	private int noOfDayswork;
	private int workingHours;
	private int hoursSalary;
	
	public PartTimeEmployees(String name,int noOfDayswork,int workingHours,int hoursSalary)
	{
		this.name =name;
		this.noOfDayswork=noOfDayswork;
		this.workingHours = workingHours;
		this.hoursSalary = hoursSalary;
	}
	public double calculateSalary(){
		return workingHours * hoursSalary;
	}
	public void display() {
        System.out.println("Part-Time Employee Name: " + name);
        System.out.println("No of Days Worked: " + noOfDayswork);
    }
}

class EmployeeDetail{
	public static void main(String[] args)
	{
		Employees employ1 = new FullTimeEmployees("Veni",15,5000);
		Employees employ2 = new PartTimeEmployees("pandi",30,60,200);
		
		employ1.display();
		System.out.println("Full time employees inform : " + employ1.calculateSalary());
		employ2.display();
		System.out.println("Parttime employees inform : " + employ2.calculateSalary());
	}
}

/*Employee name : Veni
No of days work :15
Full time employees inform : 5000.0

Part-Time Employee Name: pandi
No of Days Worked: 30
Parttime employees inform : 12000.0*/


/*5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as *Bus*, *Train*, and *Flight*.
Define a common interface or abstract class `Ticket` with a method `bookTicket()` that each transportation mode must implement differently.
Create classes `BusTicket`, `TrainTicket`, and `FlightTicket` that extend the abstract class or implement the interface.
Demonstrate *runtime polymorphism* by calling the `bookTicket()` method using a reference of the base class/interface.*/

interface Ticket{
	void Booking();
}

class Bus implements Ticket{
	private String name;
	private String gender;
	private String destination;
	private int seatNo;
	
	public Bus(String name,String gender,String destination,int seatNo)
	{
		this.name = name;
		this.gender=gender;
		this.destination=destination;
		this.seatNo=seatNo;
	}
	public void Booking(){
		System.out.println("Bus Ticket ");
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Destination : " + destination);
		System.out.println("seatNo : " + seatNo);
	}
}

class Train implements Ticket{
	private String name;
	private String gender;
	private String destination;
	private int seatNo;
	
	public Train(String name,String gender,String destination,int seatNo)
	{
		this.name = name;
		this.gender=gender;
		this.destination=destination;
		this.seatNo=seatNo;
	}
	public void Booking(){
		System.out.println("Train Ticket");
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Destination : " + destination);
		System.out.println("seatNo : " + seatNo);
	}
}

class Flight implements Ticket{
	private String name;
	private String gender;
	private String destination;
	private int seatNo;
	
	public Flight(String name,String gender,String destination,int seatNo)
	{
		this.name = name;
		this.gender=gender;
		this.destination=destination;
		this.seatNo=seatNo;
	}
	public void Booking(){
		System.out.println("Flight Ticket");
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Destination : " + destination);
		System.out.println("seatNo : " + seatNo);
	}
}

class BookTicket{
	public static void main(String[] args){
		Ticket t1 = new Bus("Kumar","Male","chennai",02);
		t1.Booking();
		Ticket t2 = new Train("veni","Female","kerala",53);
		t2.Booking();
		Ticket t3 = new Flight("Lakshimi","Female","banglore",34);
		t3.Booking();
	}
}
		
/*Bus Ticket
Name : Kumar
Gender : Male
Destination : chennai
seatNo : 2

Train Ticket
Name : veni
Gender : Female
Destination : kerala
seatNo : 53

Flight Ticket
Name : Lakshimi
Gender : Female
Destination : banglore
seatNo : 34*/


		

