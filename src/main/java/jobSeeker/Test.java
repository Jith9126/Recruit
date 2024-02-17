package jobSeeker;

import java.util.Date;

public class Test {
	private int openingId;
	private Date date;
	private String title;
	private int duration;
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Test(int openingId, Date date, String title, int duration) {
		this.openingId = openingId;
		this.date = date;
		this.title = title;
		this.duration = duration;
	}
	
	
}
