//Recepition and Main in the same class 
import java.util.ArrayList;
public class SeniorVisitor extends Visitor{
	private double discountRate;
	
	public SeniorVisitor(String name, int id, Date dob, int record_id, int visits_count, ArrayList<VisitorRecord> vR,
			ArrayList<Languages> languages, double discountRate) {
		super(name, id, dob, record_id, visits_count, vR, languages);
		this.discountRate = discountRate;
	}
	public SeniorVisitor() {
		super();
	}

	public SeniorVisitor(String name, int id, Date dob, int record_id, int visits_count, ArrayList<VisitorRecord> vR,
			ArrayList<Languages> languages) {
		super(name, id, dob, record_id, visits_count, vR, languages);
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
@Override
	public void bookTour() {
		// TODO Auto-generated method stub
		System.out.println("your information :");
		System.out.println(super.toString());
		System.out.println("hava a nice day");
	}
@Override
public String toString() {
	return super.toString()+"SeniorVisitor [discountRate=" + discountRate + "]";
}
	
}
