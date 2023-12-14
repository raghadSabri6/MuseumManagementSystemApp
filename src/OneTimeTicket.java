//Recepition and Main in the same class 
public class OneTimeTicket extends Ticket {
	public OneTimeTicket(Date issueDate, int price, Visitor visitor) {
		super(issueDate, price, visitor);
	}
	public OneTimeTicket() {
		super();
	}
	@Override
	public String toString() {
		return super.toString() + "OneTimeTicket ";
	}
	
}
