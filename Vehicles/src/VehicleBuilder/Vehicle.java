package VehicleBuilder;

public class Vehicle {
	private final String make;
	private final String model;
	private final String color;
	private final String year;
	private final String engineType;
	
	//final to only set once
	
	private Vehicle(Builder builder)
	{
		this.make= builder.make;
		this.model= builder.model;
		this.color= builder.color;
		this.year= builder.year;
		this.engineType= builder.engineType;
	}
	
	//create a static inner class to be called
	
	public static class Builder{
		private final String make;
		private final String model;
		private String color;
		private String year;
		private String engineType;
	
		
		// public is required here if you want to create it outside the package.
		// As by default it is private to package
		public Builder(String make,String model)
		{
			this.make=make;
			this.model=model;
		}
		
		public Builder color(String color)
		{
			this.color=color;
			return this;
		}
		public Builder year(String year)
		{
			this.year=year;
			return this;
		}
		public Builder engineType(String engineType)
		{
			this.engineType = engineType;
			return this;
		}
		
		// This is one of the ways that an object of a class 
		// can be made even though its constructor is private
		
		public Vehicle build()
		{
			return new Vehicle(this);
		}
	}
}
