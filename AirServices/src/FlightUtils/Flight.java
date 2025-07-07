package FlightUtils;

public class Flight{
	   private String flightId;
	   private Aircraft aircraft;
	   private Route route;
	   Flight(String flightId,Aircraft aircraft,Route route)
	   {
	      this.flightId=flightId;
	      this.aircraft =aircraft;
	      this.route=route;
	   }
	}