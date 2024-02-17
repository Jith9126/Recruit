package jobSeeker;

public class Result {
	private JobSeeker jobSeeker;
	private Test test;
	private int rankOfSeeker;
	private boolean selectedOrNot;
	
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public Test getTestId() {
		return test;
	}
	public void setTestId(Test test) {
		this.test = test;
	}
	public int getRankOfSeeker() {
		return rankOfSeeker;
	}
	public void setRankOfSeeker(int rankOfSeeker) {
		this.rankOfSeeker = rankOfSeeker;
	}
	public boolean isSelectedOrNot() {
		return selectedOrNot;
	}
	public void setSelectedOrNot(boolean selectedOrNot) {
		this.selectedOrNot = selectedOrNot;
	}
	
	public Result(JobSeeker jobSeeker, Test test, int rankOfSeeker, boolean selectedOrNot) {
		this.jobSeeker = jobSeeker;
		this.test = test;
		this.rankOfSeeker = rankOfSeeker;
		this.selectedOrNot = selectedOrNot;
	}
	
	
	
}
