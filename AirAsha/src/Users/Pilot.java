package Users;

public class Pilot extends User {
	final private String password;
	final private String dateOfJoining;
	final private String licenseNumber;
	final private String yearsOfExperience;
	private String currentLocation;

	Pilot(String name, String phone, String email, int id, String password, String dateOfJoining, String licenseNumber,
			String yearsOfExperience, String currentLocation) {
		super(name, phone, email, id, 3);
		this.password = password;
		this.dateOfJoining = dateOfJoining;
		this.licenseNumber = licenseNumber;
		this.yearsOfExperience = yearsOfExperience;
		this.currentLocation = currentLocation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public int getLevel() {
		return level;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

};