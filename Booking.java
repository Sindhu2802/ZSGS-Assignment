

/*4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class*/

package travel.booking;
public class Booking{
	private String tickeyId;
	private String destination;
	private double fare;
	
	public  Booking(String tickeyId ,String destination,double fare)
	{
		this.tickeyId = tickeyId;
		this.destination = destination;
		this.fare = fare;
	}
	
	public String getTicketId(){
		return tickeyId;
	}
	public String destination(){
		return destination;
	}
	public double fare(){
		return fare;
	}
	
	public void display(){
		System.out.println("Ticket Id : " + tickeyId);
		System.out.println("destination : " + destination);
		System.out.println("fare : " + fare);
		
	}
}
	
	
	