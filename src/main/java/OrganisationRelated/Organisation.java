package OrganisationRelated;

import java.util.List;

public class Organisation {
	
	private String name;
	private String typeOfOrg;
	private String industry;
	private String contactEmail;
	private String contactNumber;
	private List<Department> departments;
	
	public Organisation(String name, String typeOfOrg, String industry, String contactEmail, String contactNumber) {
		this.name = name;
		this.typeOfOrg = typeOfOrg;
		this.industry = industry;
		this.contactEmail = contactEmail;
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfOrg() {
		return typeOfOrg;
	}

	public void setTypeOfOrg(String typeOfOrg) {
		this.typeOfOrg = typeOfOrg;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public List<Department> getDepartments(){
		return this.departments;
	}
	
	public void addDepartment(Department department) {
		this.departments.add(department);
	}
	
	public void removeDepartment(Department department) {
		this.departments.remove(department);
	}
}
