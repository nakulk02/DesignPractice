package FlightUtils;
import java.util.*;
import FlightUtils.Aircraft;


public class Route{
   private String routeId;
   private String source;
   private String destination;
   private String distance;
   private String Time;
   private String FuelRequired;
   private List<String> Checkpoints;

   Route(String routeId,String source,String destination,String distance,String Time,String FuelRequired)
   {
      this.routeId=routeId;
      this.source=source;
      this.distance=distance;
      this.destination=destination;
      this.FuelRequired=FuelRequired;
      this.Checkpoints =new ArrayList<>();
      Checkpoints.add(source);
      Checkpoints.add(destination);
   }
   boolean checkPlaneAbility(Aircraft aircraft)
   {
      // add checks for checking planes ability for this route
      return true;
   }
}