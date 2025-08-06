	package VehicleBuilder;
	
	public class Main {
		//creating the new Vehicle
		Vehicle truck= new Vehicle.Builder("Ford", "Endanver").color("silver").build();
		Vehicle car= new Vehicle.Builder("Toyota", "camry").color("red").build();
	}