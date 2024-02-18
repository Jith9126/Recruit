package OrganisationRelated;

import java.sql.Connection;

public class Admin extends User{

	private Organisation organisation;

	public Admin(String name, String email, Organisation organisation) {
		super(name, email);
		this.organisation = organisation;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}
	
}
