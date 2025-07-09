package Utils;

import java.util.HashMap;

import ErrorAndLogging.CustomException;

public abstract class UserParamsParser {

	static private HashMap<String, Object> parseUser(HashMap<String, Object> params) throws CustomException {
		String name = (String) params.getOrDefault("name", "");
		String phone = (String) params.getOrDefault("phone", "");
		String email = (String) params.getOrDefault("email", "");
		int id = (int) params.getOrDefault("id", -1);

		if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || id < 0) {
			throw CustomException.errorValidating("Invalid parameters");
		}
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("name", name);
		hashMap.put("phone", phone);
		hashMap.put("email", email);
		hashMap.put("id", id);
		return hashMap;
	}

	static public HashMap<String, Object> parsePassenger(HashMap<String, Object> params) throws CustomException {
		HashMap<String, Object> hashMap;
		try {
			hashMap = parseUser(params);
		} catch (Exception e) {
			throw e;
		}
		return hashMap;
	}

	static public HashMap<String, Object> parseCrew(HashMap<String, Object> params) throws CustomException {
		String password = (String) params.getOrDefault("password", "");
		String dateOfJoining = (String) params.getOrDefault("dateOfJoining", "");
		if (password.isEmpty() || dateOfJoining.isEmpty()) {
			throw CustomException.errorValidating("Invalid parameters");
		}
		HashMap<String, Object> hashMap;
		try {
			hashMap = parseUser(params);
			hashMap.put("password", password);
			hashMap.put("dateOfJoining", dateOfJoining);
		} catch (Exception e) {
			throw e;
		}
		return hashMap;
	}

	static public HashMap<String, Object> parsePilot(HashMap<String, Object> params) throws CustomException {
		String password = (String) params.getOrDefault("password", "");
		String dateOfJoining = (String) params.getOrDefault("dateOfJoining", "");
		String licenseNumber = (String) params.getOrDefault("licenseNumber", "");
		String yearsOfExperience = (String) params.getOrDefault("yearsOfExperience", "");

		if (password.isEmpty() || dateOfJoining.isEmpty() || licenseNumber.isEmpty() || yearsOfExperience.isEmpty()) {
			throw CustomException.errorValidating("Invalid parameters");
		}
		HashMap<String, Object> hashMap;
		try {
			hashMap = parseUser(params);
			hashMap.put("password", password);
			hashMap.put("dateOfJoining", dateOfJoining);
			hashMap.put("licenseNumber", licenseNumber);
			hashMap.put("yearsOfExperience", yearsOfExperience);
		} catch (Exception e) {
			throw e;
		}
		return hashMap;
	}

	static public HashMap<String, Object> parseAdmin(HashMap<String, Object> params) throws CustomException {
		String password = (String) params.getOrDefault("password", "");
		String dateOfJoining = (String) params.getOrDefault("dateOfJoining", "");

		if (password.isEmpty() || dateOfJoining.isEmpty()) {
			throw CustomException.errorValidating("Invalid parameters");
		}
		HashMap<String, Object> hashMap;
		try {
			hashMap = parseUser(params);
			hashMap.put("password", password);
			hashMap.put("dateOfJoining", dateOfJoining);
		} catch (Exception e) {
			throw e;
		}
		return hashMap;
	}
};