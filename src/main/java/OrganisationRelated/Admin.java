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

	public void addPanelist(String name,String email,Gender gender, String position, int Department_Id, int Org_Id) {
		
		DBConnection db = DBConnection.getDB();
		Connection connection = db.getConnection();

		String query = "insert into PaneList (Name, Email, Gender, Department_Id, Org_Id, Position) values (?, ?, ?, ?, ?, ?)";
		PrePa
		
	}
}
