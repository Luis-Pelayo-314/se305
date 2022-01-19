package objectOrientedSoftwareDesignHW;

import java.util.Date;

public class Flight {
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private String flightNumber;
	private Date departureTime;
	
	public Flight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime){
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
	}
	
	public String toString() {
		System.out.println(airline.getName());
		System.out.println(origin.getName());
		System.out.println(destination.getName());
		System.out.println(flightNumber);
		System.out.println(departureTime);
		return "";
	}
}
