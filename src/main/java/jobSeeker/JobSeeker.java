package jobSeeker;

import java.util.Date;

public class JobSeeker extends User{
	private Date Dob;
	private Gender gender;
	private int experience;
	private int departmentId;
	private String phoneNo;
	private String qualification;
	private String photo;
	
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public JobSeeker(String name, String email, Date dob, Gender gender, int experience,
			int departmentId, String phoneNo, String qualification, String photo) {
		super(name, email);
		Dob = dob;
		this.gender = gender;
		this.experience = experience;
		this.departmentId = departmentId;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.photo = photo;
	}
	
	
}
