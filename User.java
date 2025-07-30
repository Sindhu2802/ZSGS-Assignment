/*4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class*/


package travel.user;
import travel.booking.Booking;

public class User{
	private String CustomerName;
	private String UserId;
	private long Phone_No;
	private String Gender;
	
	public User(String CustomerName,String  UserId,long Phone_No,String Gender)
	{
		this.CustomerName = CustomerName;
		this.UserId = UserId;
		this.Phone_No = Phone_No;
		this.Gender = Gender;
	}
	
	public  String getCustomerName(){
		return CustomerName;
	}
	
	public String getUserId(){
		return UserId;
	}
	
	public long getPhoneno(){
		return Phone_No;
		
		
	}
	
	public String getGender(){
		return Gender;
	}
	
	
	public void displayTicket(){
		System.out.println("CustomerName " + CustomerName);
		System.out.println(" userId " + UserId);
		System.out.println("Phone_No " + Phone_No);
		System.out.println("Gender " + Gender);
	}
}
	