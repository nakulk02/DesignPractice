package Utils;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import Users.Passenger;

public class PNR {
	private int pnr;
	private String source, dest;
	private String flightNumber;
	private List<Passenger> passengers;
	private HashMap<Integer, Seat> passengerToSeat;

	PNR(String source, String dest, String flightNumber, List<Passenger> passengers) {
		this.source = source;
		this.dest = dest;
		this.flightNumber = flightNumber;
		this.passengers = passengers;
		pnr = 1;
		passengerToSeat = new HashMap<>();
	}

	// getter for attributes

	public boolean checkPassenger(String name) {
		// logic to check
		return true;
	}

	public List<Passenger> getPassengersByName(String name) {
		List<Passenger> pass = passengers.stream().filter(x -> name.equals(x.getName())).collect(Collectors.toList());
		return pass;
	}

};
