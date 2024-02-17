package OrganisationRelated;

public class Panelist extends User{
	
	private Gender gender;
	private String position;
	
	public Panelist(String name, String email, Gender gender, String position) {
		super(name, email);
		this.gender = gender;
		this.position = position;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}