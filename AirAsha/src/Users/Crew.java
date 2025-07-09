package Users;

public class Crew extends Passenger {
	final private String password;
	final private String dateOfJoining;

	Crew(String name, String phone, String email, int id, String password, String dateOfJoining) {
		super(name, phone, email, id, 2);
		this.password = password;
		this.dateOfJoining = dateOfJoining;
	}

	// setter for flightNumber
	// getter for all except password

	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
};
