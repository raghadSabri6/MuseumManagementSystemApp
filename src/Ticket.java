//Recepition and Main in the same class 
public class Ticket {
	private Visitor visitor ;
	private Date issueDate;
	private int price;
	public Ticket() {
		this.issueDate = null;
		this.price = 0;
		this.visitor = null;
	}
	public Ticket(Date issueDate, int price, Visitor visitor) {
		super();
		this.issueDate = issueDate;
		this.price = price;
		this.visitor = visitor;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	
	public Visitor getVisitor () {
		return this.visitor;
	}
	public void setVisitor (Visitor v) {
		this.visitor = v; 
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	RegularVisitor vr = new  RegularVisitor();
	SeniorVisitor vs = new SeniorVisitor();
	public Ticket(Visitor visitor, Date issueDate, int price, RegularVisitor vr, SeniorVisitor vs) {
		super();
		this.visitor = visitor;
		this.issueDate = issueDate;
		this.price = price;
		this.vr = vr;
		this.vs = vs;
	}
	public RegularVisitor getVr() {
		return vr;
	}
	public void setVr(RegularVisitor vr) {
		this.vr = vr;
	}
	public SeniorVisitor getVs() {
		return vs;
	}
	public void setVs(SeniorVisitor vs) {
		this.vs = vs;
	}
	@Override
	public String toString() {
		vs.bookTour();
		return "Ticket [" + " issueDate=" + issueDate + ", price=" + price + "]";
	}
	
	
	
	
	
}
