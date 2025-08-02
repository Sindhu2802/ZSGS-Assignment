
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


