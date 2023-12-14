//Recepition and Main in the same class 
public class VisitorRecord {
	private Date enteringDate;
	private Time enteringtime;
	public VisitorRecord(Date enteringDate, Time enteringtime) {
		this.enteringDate = enteringDate;
		this.enteringtime = enteringtime;
	}
	
	public VisitorRecord() {
		super();
	}

	public Date getEnteringDate() {
		return enteringDate;
	}
	public void setEnteringDate(Date enteringDate) {
		this.enteringDate = enteringDate;
	}
	public Time getEnteringtime() {
		return enteringtime;
	}
	public void setEnteringtime(Time enteringtime) {
		this.enteringtime = enteringtime;
	}
	@Override
	public String toString() {
		return "VisitorRecord [enteringDate=" + enteringDate + ", enteringtime=" + enteringtime + "]";
	}
	
}
