package jobSeeker;

public enum Gender {
	FEMALE("FEMALE"),
	MALE("MALE"),
	NB("NB");
	
	private final String gender;
	Gender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
}
