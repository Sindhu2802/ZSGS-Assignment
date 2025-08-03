
import java.util.Scanner;
 /*Day-5 Assignment Questions:
 1. Design a Java program to maintain hospital medical records.
 Create a base class named MedicalRecord that includes common attributes:--- recordId, patientName, dateOfVisit, and diagnosis.--- inputRecordDetails() – to input common record information.--- override displayRecord() – to display the common record details.
 Create a subclass InPatientRecord that extends MedicalRecord and adds:--- roomNumber, numberOfDaysAdmitted, roomCharges.--- calculateTotalCharges() – to compute and return total inpatient cost.--- displayRecord() – to include all details, including total charges.
 Create another subclass OutPatientRecord that extends MedicalRecord and adds:--- doctorName, consultationFee.--- override displayRecord() – to include all outpatient-specific details.
 Include all the necessary classes if it's needed.
 2. Can we override private method, constructor, static method, final method? Illustrate with an example.
 3. Create a Java application to manage employees in a company. Define a base class Employee with a method 
calculateSalary(). Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that 
override calculateSalary() method based on their working type.
 4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common 
method but implement booking differently.*/

 /*1. Design a Java program to maintain hospital medical records.
 Create a base class named MedicalRecord that includes common attributes:--- recordId, patientName, dateOfVisit, and diagnosis.--- 
 inputRecordDetails() – to input common record information.--- override displayRecord() – to display the common record details.
 Create a subclass InPatientRecord that extends MedicalRecord and adds:--- roomNumber, numberOfDaysAdmitted, roomCharges.--- calculateTotalCharges() – 
 to compute and return total inpatient cost.--- displayRecord() – to include all details, including total charges.
 Create another subclass OutPatientRecord that extends MedicalRecord and adds:--- doctorName, consultationFee.--- override displayRecord() –
 to include all outpatient-specific details.
 Include all the necessary classes if it's needed.*/
 

//Create a base class named MedicalRecord that includes common attributes:--- recordId, patientName, dateOfVisit, and diagnosis.--- 
class MedicalRecord{
	int recordId;
	String patientName;
	int dateOfVisit;
	String diagnosis;

//inputRecordDetails() – to input common record information.--- override displayRecord() – to display the common record details.	
	
	public void inputRecordDetails(int recordId,String patientName,int dateOfVisit,String diagnosis)
	{
		this.recordId = recordId;
		this.patientName = patientName;
		this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
	}
	
	public void displayRecordDetails(){
		
		System.out.println("Record Id : " + recordId);
		System.out.println("PatientName : " + patientName);
		System.out.println("DateOfVisit : " + dateOfVisit);
		System.out.println("Diagnosis : " + diagnosis);
	}
}

//subclass

 //Create a subclass InPatientRecord that extends MedicalRecord and adds:--- roomNumber, numberOfDaysAdmitted, roomCharges.---

class InPatientRecord extends MedicalRecord{
	int roomNumber;
	int numberOfDaysAdmitted;
	double roomCharges;
	
	public InPatientRecord(int recordId,String patientName,int dateOfVisit,String diagnosis,int roomNumber,int numberOfDaysAdmitted,double roomCharges)
	{
		super.inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
		this.roomNumber =  roomNumber;
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;
		this.roomCharges = roomCharges;
	}
	
//calculateTotalCharges() – to compute and return total inpatient cost.--- displayRecord() – to include all details, including total charges.
	
	public double calculateTotalCharges()
	{
		return numberOfDaysAdmitted * roomCharges;
	}
	
	public void displayRecord(){
		super.displayRecordDetails();
		System.out.println("Room number : " + roomNumber);
		System.out.println("NumberOfDays Admitted : " + numberOfDaysAdmitted);
		System.out.println("Room charges : " + roomCharges);
		System.out.println("Calculate Total Charges : " + calculateTotalCharges());
	}
}

//subclass
/*Create another subclass OutPatientRecord that extends MedicalRecord and adds:--- doctorName, consultationFee.--- override displayRecord() –
 to include all outpatient-specific details.*/

class OutPatientRecord  extends MedicalRecord{
	
	String doctorName;
	double consultationFee;
	
	public OutPatientRecord(int recordId, String patientName, int dateOfVisit, String diagnosis, String doctorName, double consultationFee)
	{
		super.inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
		this.doctorName = doctorName;
		this.consultationFee = consultationFee;
		
	}
	
	public void displayRecord(){
		super.displayRecordDetails();
		System.out.println("Doctor Name : " + doctorName);
		System.out.println("ConsulationFee : " + consultationFee);
	}
}

public class HospitalRecords{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the choice :");
		int choice = scan.nextInt();
		
		switch(choice)
		{
			case 1 :
			   System.out.println("Enter the Record Id ");
			   int recordId = scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter PatientName : " );
			   String patientName = scan.nextLine();
			   System.out.println("Enter DateOfVisit : ");
               int dateOfVisit = scan.nextInt();
			   scan.nextLine();
               System.out.println("Enter Diagnosis :" );
			   String diagnosis = scan.nextLine();
			  // scan.nextLine();
			   System.out.println("Enter Room number " );
			   int roomNumber = scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter the numberOfDaysAdmitted ");
			   int numberOfDaysAdmitted = scan.nextInt();
			   System.out.println("Enter room charges " );
			   double roomCharges = scan.nextDouble();
			    
			   InPatientRecord Inp = new InPatientRecord(recordId,patientName,dateOfVisit,diagnosis,roomNumber,numberOfDaysAdmitted,roomCharges);
			   Inp.displayRecord();
			   break;
			   
			   
			 
			case 2 :
			   
			   System.out.println("Enter the RecordId ");
			   int recordId2 = scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter the patientName ");
			   String patientName2 = scan.nextLine();
			   
			   System.out.println("Enter the DateOfVisit ");
			   int dateOfVisit2 = scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter the diagnosis " );
			   String diagnosis2 = scan.nextLine();
			   System.out.println("Enter the Doctor name : ");
			   String doctorName = scan.nextLine();
			   System.out.println("Enter the consultationFee ");
			   double consultationFee = scan.nextDouble();
			   
			   OutPatientRecord Oup = new OutPatientRecord(recordId2,patientName2,dateOfVisit2,diagnosis2,doctorName,consultationFee);
			   Oup.displayRecord();
			   break;
			   
		    default :
			   System.out.println("Invalid choice so please enter vaild choice");
			   break;
		}
		scan.close();
	}
}

/* InPatientRecord details   

Enter the choice :
1
Enter the Record Id
1203
Enter PatientName :
jeya
Enter DateOfVisit :
03072025
Enter Diagnosis :
fever
Enter Room number
03
Enter the numberOfDaysAdmitted
10
Enter room charges
500
Record Id : 1203
PatientName : jeya
DateOfVisit : 3072025
Diagnosis : fever
Room number : 3
NumberOfDays Admitted : 10
Room charges : 500.0
Calculate Total Charges : 5000.0			

//OutPatientRecord details

Enter the choice :
2
Enter the RecordId
23
Enter the patientName
kumar
Enter the DateOfVisit
02032025
Enter the diagnosis
fever
Enter the Doctor name :
DR.MR.kumar
Enter the consultationFee
200
Record Id : 23
PatientName : kumar
DateOfVisit : 2032025
Diagnosis : fever
Doctor Name : DR.MR.kumar
ConsulationFee : 200.0

Enter the choice :
3
Invalid choice so please enter vaild choice*/


// 2. Can we override private method, constructor, static method, final method? Illustrate with an example.

/*class Parent{
	Parent()
	{
		System.out.println("Parent constructor"); // constructor
	}
	
	//static Method
	
	static void staticMethod(){
		System.out.println("Parent is staticMethod");
	}
	
	//final method
	
	final void finalMethod(){
		System.out.println("Parent is finalMethod");
	}
	
	private void privateParent(){
		System.out.println("Parent method is private");
	}
	
	public void display(){
		System.out.println(" Parents is super class ");
	}
	
	class Child extends Parent{
		
		//constructor
		Child(){
			System.out.println("child constructor");
		}
		
		static void staticMethod(){
			System.out.println("child is staticMethod");
		}
		final void finalMethod(){
			System.out.println("child is finalMethod");
		}
		
		private void privateChild(){
			System.out.println("Child is private method ");
		}
	
		public void display(){
			System.out.println("Child is super class");
		}
	}
	
class overrideCheck{
		public static void main(String[] args)
		{
			Parent p = new Parent();
			p.staticMethod();
			p.finalMethod();
			p.display();
			
			System.out.println();
			
			Child c= new Child();
			c.staticMethod();
			c.finalMethod();
			c.display();
			
			System.out.println();
			Parent pc = new Child();
			pc.staticMethod();
			pc.finalMethod();
			pc.display();
		}
	}
}*/

			

/*HospitalRecords.java:267: error: finalMethod() in Parent.Child cannot override finalMethod() in Parent
                final void finalMethod(){
                           ^
  overridden method is final
HospitalRecords.java:290: error: non-static variable this cannot be referenced from a static context
                        Child c= new Child();
                                 ^
HospitalRecords.java:296: error: non-static variable this cannot be referenced from a static context
                        Parent pc = new Child();
                                    ^
3 errors*/


 /*3. Create a Java application to manage employees in a company. Define a base class Employee with a method 
calculateSalary(). Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that 
override calculateSalary() method based on their working type.*/


class Employee{
    private String employeeId;
	private String name;
	private int noOfDaysWork;
	
	public Employee(String employeeId, String name, int noOfDaysWork) {
		this.employeeId = employeeId;
		this.name = name;
        this.noOfDaysWork = noOfDaysWork;
    }
	
	public String getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(String EmployeeId)
	{
		this.employeeId = employeeId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		this.name = name;
	}
	public int getNoOfDaysWork(){
		return noOfDaysWork;
	}
	public void setNoofDayWork(int noOfDaysWork)
	{
		this.noOfDaysWork= noOfDaysWork;
	}
	
	public double calculateSalary(){
		return 0.0;
	}
	public void display(){
		System.out.println("Employee id : " + employeeId);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee no of day wrk " + noOfDaysWork);
	}
}

/*Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that 
override calculateSalary() method based on their working type.*/

class FullTimeEmployee extends Employee{
	private double monthlySalary;
	
	public FullTimeEmployee(String employeeId,String name,int  noOfDaysWork,double monthlySalary)
	{
      super(employeeId,name,noOfDaysWork);
      this.monthlySalary= monthlySalary;
	}
  
    public double getMonthlySalary(){
        return monthlySalary;
	}
    public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	
	//override
	public double calculateSalary(){
		return monthlySalary;
	}
	
	public void display(){
		super.display();
		System.out.println("Full time employees details : ");
      	System.out.println("Monthly salary : " + monthlySalary);
		System.out.println("Calculate salary : " +calculateSalary());
	}
}

//PartTimeEmployee

class PartTimeEmployee extends Employee{
    private int workingHours;
	private double hoursSalary;
	
	public PartTimeEmployee(String employeeId,String name,int noOfDaysWork,int workingHours,double hoursSalary)
	{
		super(employeeId,name,noOfDaysWork);
		this.workingHours = workingHours;
		this.hoursSalary = hoursSalary;
	}
	public int getWorkingHours(){
		return workingHours;
	}
	public void setWorkingHours(int workingHours)
	{
		this.workingHours = workingHours;
	}
	public double getHoursSalary(){
		return hoursSalary;
	}
	public void setHoursSalary(double hoursSalary)
	{
		this.hoursSalary = hoursSalary;
	}
	 public double calculateSalary(){
		 return workingHours * hoursSalary;
	 }
	 
	 public void display(){
		 super.display();
		 System.out.println("Part time employees details : ");
		 System.out.println("WorkingHours : "+ workingHours);
		 System.out.println("hoursSalary : " + hoursSalary);
		 System.out.println("Calculatesalary : " + calculateSalary());
	 }
}

//contrateEmployee

class ContractEmployee extends Employee{
	private double contractfee;
	private int monthDuration;
	
	public ContractEmployee(String employeeId,String name,int noOfDaysWork,double contractfee,int monthDuration)
	{
		super(employeeId,name,noOfDaysWork);
		this.contractfee= contractfee;
		this.monthDuration = monthDuration;
	}
	public double getContractfee(){
		return contractfee;
	}
	public void setContractfee(double contractfee)
	{
		this.contractfee = contractfee;
	}
	public int getMonthDuration(){
		return monthDuration;
	}
	public void setMonthDuration(int MonthDuration)
	{
		this.monthDuration = monthDuration;
	}
	 public double calculateSalary(){
		 return contractfee * monthDuration;
	 }
	 
	 public void display(){
		 super.display();
		 System.out.println("COntract employees details : ");
		 System.out.println(");ContractFee : " + contractfee);
		 System.out.println("MonthDuration : " + monthDuration);
		 System.out.println("Calculatesalary : " + calculateSalary());
	 }
}
	
class Employeejobs{
	public static void main(String[] args)
	{
		FullTimeEmployee full = new FullTimeEmployee("2001","Nandhini",15,5000.00);
		PartTimeEmployee part = new PartTimeEmployee("2002","sindhu",15,60,200);
		ContractEmployee contrat = new ContractEmployee("2003","kumar",30,25000,6);
		
	    System.out.println(" Full time Employee :");
		full.display();
		System.out.println("Part time employees :");
		part.display();
		System.out.println("Contract Employee ");
		contrat.display();
	}
}
		 
/*
 Full time Employee :
Employee id : 2001
Employee Name : Nandhini
Employee no of day wrk 15
Full time employees details :
Monthly salary : 5000.0
Calculate salary : 5000.0

Part time employees :
Employee id : 2002
Employee Name : sindhu
Employee no of day wrk 15
Part time employees details :
WorkingHours : 60
hoursSalary : 200.0
Calculatesalary : 12000.0

Contract Employee
Employee id : 2003
Employee Name : kumar
Employee no of day wrk 30
COntract employees details :
);ContractFee : 25000.0
MonthDuration : 6
Calculatesalary : 150000.0

*/

/*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common 
method but implement booking differently.*/		

class TicketBook{
	String destination;
	int seatNo;
	
	public  TicketBook(String destination,int seatNo)
	{
		this.destination = destination;
		this.seatNo= seatNo;
	}
	public void display()
	{
		System.out.println("the destination : "+ destination);
		System.out.println("the seatNo is : " + seatNo);
	}
	
}
 // override 
class Bus extends TicketBook{
	
	public Bus(String destination ,int seatNo)
	{
		super(destination,seatNo);
	} 
	public void display(){
		 System.out.println("Successfully booked for bus ticket");
	 }
}

//override
class Train extends TicketBook{
		
	public Train(String destination, int seatNo) 
	{
		super(destination, seatNo);
    }
	public void display(){
		System.out.println("Successfully booked for train ticket");
	}
	
}
//override
class Flight extends TicketBook{
	
	 public Flight(String destination,int seatNo)
	 {
        super(destination,seatNo);
    }
	public void display(){
		System.out.println("Successfully booked for Flight Ticket");
	}
}

class BusTrainFlight{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the destination ");
		String destination = scan.nextLine();
		
		System.out.println("Enter the seat no ");
		int seatNo = scan.nextInt();
		
		System.out.println("enter options ");
		int options = scan.nextInt();
		
		switch (options) {
            case 1:
                System.out.println("Bus Ticket Booking");
                System.out.println("Destination: " + destination);
                System.out.println("Seat No: " + seatNo);
                System.out.println("Successfully booked a Bus ticket.");
                break;

            case 2:
                System.out.println("Train Ticket Booking");
                System.out.println("Destination: " + destination);
                System.out.println("Seat No: " + seatNo);
                System.out.println("Successfully booked a Train ticket.");
                break;

            case 3:
                System.out.println("Flight Ticket Booking");
                System.out.println("Destination: " + destination);
                System.out.println("Seat No: " + seatNo);
                System.out.println("Successfully booked a Flight ticket.");
                break;

            default:
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
        }
    }
}


/*Enter the destination
chennai
Enter the seat no
02
enter options
1
Bus Ticket Booking
Destination: chennai
Seat No: 2
Successfully booked a Bus ticket.	

Enter the destination
kerala
Enter the seat no
12
enter options
2
Train Ticket Booking
Destination: kerala
Seat No: 12
Successfully booked a Train ticket.*/







