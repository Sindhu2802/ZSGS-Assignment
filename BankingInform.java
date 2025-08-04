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

