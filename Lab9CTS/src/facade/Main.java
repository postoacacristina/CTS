package facade;

public class Main {

	public static void main(String[] args) {
		
		
//		Hotel hotel=new Hotel("London Hilton");
//		hotel.roomBooking("London");
//		
//		Airline airline=new Airline("BlueAir");
//		Flight toGo=airline.flightBooking("Bucharest", "London");
//		Flight back=airline.flightBooking("Londin", "Bucharest");
		
		
		Facade.reservation("Bucharest", "London");
	}

}