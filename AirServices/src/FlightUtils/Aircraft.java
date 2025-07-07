package FlightUtils;
import Utils.Seat;
import java.util.*;


public class Aircraft {
   private String aircraftId;
   private String manufacturer;
   private String currentLocation;
   final private int dateOfManufacture;
   private int capacity;
   private int availableSeats;
   private int occupiedSeats;
   private int lastDateOfService;
   private List<Seat>seats;

   Aircraft(String aircraftId,String manufacturer,int dateOfManufacture,int capacity,int availableSeats,int occupiedSeats,int lastDateOfService,String location)
   {
      this.aircraftId=aircraftId;
      this.manufacturer=manufacturer;
      this.dateOfManufacture=dateOfManufacture;
      this.capacity=capacity;
      this.availableSeats=availableSeats;
      this.occupiedSeats=0;
      this.lastDateOfService=lastDateOfService;
      this.currentLocation=location;
      seats=new ArrayList<>();
   }
}
