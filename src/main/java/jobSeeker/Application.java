package jobSeeker;

import java.util.Date;

public class Application {
	private JobSeeker jobSeeker;
	private int openingId;
	private Date date;
	
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeekerId(JobSeeker jobSeekerId) {
		this.jobSeeker = jobSeekerId;
	}
	public int getOpeningId() {
		return openingId;
	}
	public void setOpeningId(int openingId) {
		this.openingId = openingId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Application(JobSeeker jobSeeker, int openingId, Date date) {
		this.jobSeeker = jobSeeker;
		this.openingId = openingId;
		this.date = date;
	}
	
	
}
