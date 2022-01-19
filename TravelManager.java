package objectOrientedSoftwareDesignHW;

import java.util.Date;
import java.util.UUID;

public class TravelManager {
	public static void main(String args[]) {
		Airport origin = new Airport("ABC");
		Airport destination = new Airport("XYZ");
		Airline airline = new Airline("OOSDAir");
		Date date = new Date();
		String flightNumber = "123e4567e89b12d3a456556642440000";
		Flight flight = new Flight(airline, origin, destination, flightNumber, date);
		
		System.out.println(flight);
	}
	
}
