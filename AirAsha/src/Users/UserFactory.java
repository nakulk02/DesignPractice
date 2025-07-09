package Users;

import java.util.HashMap;
import java.util.List;

import ErrorAndLogging.CustomException;
import Utils.UserParamsParser;
import Utils.UserType;

public abstract class UserFactory {

	public abstract Object createObject(Admin admin, List<Object> params);

	static private User createPassenger(Admin admin, HashMap<String, Object> params) throws CustomException {
		checkAccess(admin);
		HashMap<String, Object> parsedParams = UserParamsParser.parsePassenger(params);
		return new Passenger(parsedParams.get("name").toString(), parsedParams.get("phone").toString(),
				parsedParams.get("email").toString(), (Integer) (parsedParams.get("id")));
	}

	static private User createCrew(Admin admin, HashMap<String, Object> params) throws CustomException {
		checkAccess(admin);
		HashMap<String, Object> parsedParams = UserParamsParser.parseCrew(params);
		return new Crew(parsedParams.get("name").toString(), parsedParams.get("phone").toString(),
				parsedParams.get("email").toString(), (Integer) (parsedParams.get("id")),
				parsedParams.get("password").toString(), parsedParams.get("dateOfJoining").toString());
	}

	static private User createPilot(Admin admin, HashMap<String, Object> params) throws CustomException {
		checkAccess(admin);
		HashMap<String, Object> parsedParams = UserParamsParser.parsePilot(params);
		return new Pilot(parsedParams.get("name").toString(), parsedParams.get("phone").toString(),
				parsedParams.get("email").toString(), (Integer) (parsedParams.get("id")),
				parsedParams.get("password").toString(), parsedParams.get("dateOfJoining").toString(),
				parsedParams.get("licenseNumber").toString(), parsedParams.get("yearsOfExperience").toString(),
				parsedParams.get("currentLocation").toString());
	}

	static private User createAdmin(Admin admin, HashMap<String, Object> params) throws CustomException {
		checkAccess(admin);
		HashMap<String, Object> parsedParams = UserParamsParser.parseCrew(params);
		return new Admin(parsedParams.get("name").toString(), parsedParams.get("phone").toString(),
				parsedParams.get("email").toString(), (Integer) (parsedParams.get("id")),
				parsedParams.get("password").toString(), parsedParams.get("dateOfJoining").toString());
	}

	static private void checkAccess(Admin admin) throws CustomException {
		if (admin.getLevel() != 4) {
			throw CustomException.errorValidating("Unauthorized access. Only Admins can create users.");
		}
	}

	public static User getUserObject(Admin admin, UserType type, HashMap<String, Object> params)
			throws CustomException {
		switch (type) {
		case UserType.PASSENGER: {
			return createPassenger(admin, params);

		}
		case UserType.CREW: {
			return createCrew(admin, params);
		}
		case UserType.PILOT: {
			return createPilot(admin, params);
		}
		case UserType.ADMIN: {
			return createAdmin(admin, params);
		}
		default:
			break;
		}
		return null;
	}

}
