//Recepition and Main in the same class 
public class MultiTimeTicket extends Ticket {
	private TickectType tickectType;
	
	public MultiTimeTicket() {
		super();
	}
	public MultiTimeTicket(Date issueDate, int price, Visitor visitor , TickectType tickectType) {
		super(issueDate, price, visitor);
		this.tickectType = tickectType;
	}
	public MultiTimeTicket(TickectType tickectType) {
		super();
		this.tickectType = tickectType;
	}
	public TickectType getTickectType() {
		return tickectType;
	}
	public void setTickectType(TickectType tickectType) {
		this.tickectType = tickectType;
	}
	@Override
	public String toString() {
		return super.toString() + "MultiTimeTicket [tickectType=" + tickectType + "]";
	}
	
}
