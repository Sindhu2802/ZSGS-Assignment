
import arithmetic.ArithmeticOperation;
import stringutils.TwoString;
//*Day-6 Assignment Questions:*
/*1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]
‌
2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
‌
3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.
‌
4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
‌
5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.*/

/*1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary*/


class Payment{
	 //encapsulated
	private int transactionId;
	private String payerName;
	private String payeeName;
	private double amount;
	private String paymentMethod;
	private String transactionStatus;


public Payment(int transactionId,String payerName,String payeeName,double amount,String paymentMethod,String transactionStatus)
{
	//parameterized Constructor
	this.transactionId = transactionId;
	this.payerName = payerName;
	this.payeeName = payeeName;
	this.amount =  amount;
	this.paymentMethod = paymentMethod;
	this.transactionStatus = transactionStatus;
}
	
	public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

	public String getPayerName(){
		  return payerName;
	  }
	 public void setPayerName(String payerName)
	 {
		 this.payerName =  payerName;
	 }
	  
	  public String getPayeeName(){
		  return payeeName;
	  }
	  public void setPayeeName(String payeeName)
	  {
		  this.payeeName = payeeName;
	  }
		  
	  public double getAmount(){
		  return amount;
	  }
	  public void setAmount(double amount)
	  {
		  this.amount = amount;
	  }
	  
	  public String getPaymentMethod(){
		 
		 return paymentMethod;
	  }
	  public void setpaymentMethod(String paymentMethod)
	  {
		  this.paymentMethod = paymentMethod;
	  }
	  
	  public String getTransactionStatus(){
		  
		  return transactionStatus;
	  }
	  public void setTransactionStatus(String transactionStatus)
	  {
		  this.transactionStatus = transactionStatus;
	  }
	  
	  public void display(){
		  System.out.println("Summary of bankdetails ");
		  System.out.println("Transaction id  " + transactionId);
		  System.out.println(" Payer Name " + payerName);
		  System.out.println("payee Name " + payeeName);
		  System.out.println("Amount  " + amount);
		  System.out.println("PaymentMethod  " + paymentMethod);
		  System.out.println("TransactionStatus" + transactionStatus);
	  }
}
	  
 class paymentgateway{
	 public static void main(String[] args)
	 {
		 Payment pay = new Payment(9823,"Jeya","Sindhu",25000,"UPI","Pending");
		 pay.display();
		 
		 
	 }
 }



/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/


class UserOwnPackage{
	public static void main(String[] args)
	{
		ArithmeticOperation Math = new ArithmeticOperation();
		int a = 5;
		int b = 3;
		System.out.println("Addition sum of " + Math.add(a,b));
		System.out.println("Subtraction sum of " + Math.sub(a,b));
		System.out.println("Multiplication sum of " + Math.mul(a,b));
		System.out.println("Division sum of " + Math.div(a,b));
		System.out.println("Modulo sum of " + Math.mod(a,b));
		
		
		TwoString s = new TwoString();
		String str1 = "Jeya";
		String str2 = "Shreee";
		String str = "Sindhu";
		String s1 = "Nandhini";
		
		
		System.out.println("___________________________________");
		
		
		System.out.println("Concatenating to two Strings : " + s.concat(str1,str2));
		System.out.println("Reversing to the String : " + s.reverse(str));
		System.out.println("Finding the length of a String : "  + s.lengthstr(s1));
		

	}
}

‌
		  



//3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.

class Employee{
	private int employeeId;
	private String name;
	private String designation;
	private String department;
	private double monthlySalary;
	
	public  Employee(int employeeId,String name,String designation,String department,double monthlySalary)
	{
		this.employeeId= employeeId;
		this.name = name;
		this.designation= designation;
		this.department = department;
		this.monthlySalary = monthlySalary;
		
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDesignation(){
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public double getMonthlySalary(){
		
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary)
	{
		if(monthlySalary >= 0 )
		{
			this.monthlySalary = monthlySalary;
		}
		else{
			System.out.println("Monthly salary can't be negative(-100)");
		}
	}
	
	public double calAnnualsalary(){
		return monthlySalary * 12; // calculate annual salary
	}
}

class EmployeeDetail{
	public static void main(String[] args)
	{
		Employee em =  new Employee(223,"kumar","Manager","Techinalteam",50000.00);
		
		System.out.println("EmployeeId : " + em.getEmployeeId());
		System.out.println("Name :" + em.getName());
		System.out.println("Desgination " + em.getDesignation());
		System.out.println("Department" + em.getDepartment());
		System.out.println("MonthlySalary " + em.getMonthlySalary());
		

		
		em.setMonthlySalary(60000.00); // update the setter values
		em.setDesignation("Techinalteam");
		
		System.out.println("Updated the employee details");
		System.out.println("updated monthlySalary " + em.getMonthlySalary());
		System.out.println("updated designation " +em.getDesignation());
		System.out.println("updated annual salary " + em.calAnnualsalary());
		
		em.setMonthlySalary(-100.00);
	}
}

/*4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/


class Ticket{
	public static void main(String[] args)
	{
		User us = new User("sindhu","023",323454545,"Female");
		us.displayTicket();
	}
}
//5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.*/
		
class BankAcc{
   private long accountNum;
   private String accountHolderName;
   private double balance;
   
   public long getAccountNum(){
	   return accountNum;
   }
	 
   public void setAccountNum(long accountNum){
	   this.accountNum = accountNum;
   }
   
   public String getAccountHolderName()
   {
	   return accountHolderName;
   }
   public void setAccountHolderName(String accountHolderName)
   {
	   this.accountHolderName = accountHolderName;
   }
   public double getBalance(){
	   return balance;
   }
   public void setBalance(double balance)
   {
	   this.balance = balance;
   }
   
   public void depositAmount(double balance)
   {
	   this.balance += balance;
	   System.out.println("deposit Balance : " + this.balance);
   }
    public void withdraAmount(double balance)
	{
		this.balance -= balance;
		System.out.println("withdraw Balance : " + this.balance);
	}
   }
	
   class BankAccountNumber{
   public static void main(String[] args)
   {
	
      BankAcc	bank = new BankAcc();
	  bank.setAccountNum(234567454);
	  bank.setAccountHolderName("sindhu");
	  bank.setBalance(40000.0);
	  bank.withdraAmount (30000.0);
	  bank.depositAmount(40000.0);
   }
}


	  
		  
		  
	



		
		
		


	  
		  
		  
	
		  
	
